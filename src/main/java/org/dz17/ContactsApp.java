package org.dz17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
@Component
public class ContactsApp {



    private final ContactRepository contactRepository;

    private final ContactService contactService;

    @Autowired
    public ContactsApp(ContactRepository contactRepository, ContactService contactService) {
        this.contactRepository = contactRepository;
        this.contactService = contactService;
    }



    public  void run() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("> Введите команду (print, add, dellByMail, save, exit): ");
            String command = scanner.nextLine();

            switch (command) {
                case "print":
                     contactService.print();
                    break;
                case "add": {
                    System.out.println("Введите контакт в формате: имя; телефон; mail");
                    String contactString = scanner.nextLine();
                    contactService.add(contactString);
                }
                    break;
                case "dellByMail": {
                    String mail = scanner.nextLine();
                    contactService.dellByMail(mail);
                }
                    break;
                case "save":
                    String fileName = scanner.nextLine();
                    contactService.save(fileName);
                    break;
                case "help":
                    System.out.println("это помощь");
                case "exit":
                    return;
                default:
                    System.out.println("Недопустимая команда. Доступные команды: print, add, dellByMail, save, exit");
                    break;
            }
        }
    }

}



