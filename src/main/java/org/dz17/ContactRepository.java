package org.dz17;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ContactRepository implements TextFileInteface {
    @Getter
    @Setter
    private List<ContactEntity> contactList = new ArrayList<>();

    @Value("${default.file}")
    private String filename;


    public ContactRepository() {

    }

    public List<ContactEntity> getContactByMail(String mail) {
        return contactList.stream().filter(c -> c.getMail().contains(mail)).collect(Collectors.toList());
    }

    public int getSize(){
        return contactList.size();
    }

    public int deleteContact(ContactEntity contact) {
        contactList.remove(contact);
        return contactList.size();
    }

    public  int addContact(ContactEntity contact){
        if (contact != null) {

            contactList.add(contact);
            System.out.println("добавлен конткакт: " + contact.toString()
                    + " всего конткактов - " + contactList.size());

        }
        return  contactList.size();
    }
    public  int addContactList(List<ContactEntity> contacts){
        contactList.addAll(contacts);
        return  contactList.size();
    }

    public String saveToFile(String filename) {
        createFileWithContent(filename, contactList.stream().map(s -> toString()).collect(Collectors.toList()));
        return filename;
    }

    public int loadFromFile(String filename) {

        readFile(filename).forEach(s -> addContact(ContactConvertor.stringToContact(s)));
        return contactList.size();
    }
    @PostConstruct
    public int loadFromFileInProperty() {
        System.out.println("Загружаем " + filename);
        readFile(filename).forEach(s -> addContact(ContactConvertor.stringToContact(s)));
        return contactList.size();
    }




}
