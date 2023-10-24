package org.dz17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ContactService {

   @Autowired
    private ContactRepository contactRepository;

    public void print() {
        contactRepository.getContactList().forEach(System.out::println);
        System.out.println("Количество контактов - " + contactRepository.getSize());
    }

   public int dellByMail (String mail) {

       List<ContactEntity> forRemovingContact = contactRepository.getContactByMail(mail);

       forRemovingContact.forEach(contactRepository::deleteContact);

       return contactRepository.getContactList().size();

    }

    public int add (String contactString){

        return contactRepository.addContact(ContactConvertor.stringToContact(contactString));
    }

    public String save(String fileName){
        return contactRepository.saveToFile(fileName);
    }




}
