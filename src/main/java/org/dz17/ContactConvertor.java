package org.dz17;

public class ContactConvertor {

    public static ContactEntity stringToContact(String string) {

        String[] strings = string.split("; ");
        boolean error = false;
        if (strings.length !=3){
            System.out.println("Неправильный ввод. Разделитель \"; \"с пробелом, или количество параметров не равно 3");

            return null;
        }


        if (!strings[0].matches(RegularExpressions.PERSON_NAME.getPattern().pattern()))
        {
            System.out.println("Неправильный ввод имени имя может содержать только латинские буквы");
            error = true;
        }



        if        (!strings[1].matches(RegularExpressions.PHONE_NUMBER.getPattern().pattern()))
        { error =true;
            System.out.println("Неправильный ввод Номера телефона формат +7999-8888888 можно без + и или без -");
        }
         if       (!strings[2].matches(RegularExpressions.EMAIL.getPattern().pattern())) {
             System.out.println("Неправильный ввод почты пример abc@abc.cem");
             error =true;
         }
            if (!error) {
                String name = strings[0];
                String phone = strings[1];
                String mail = strings[2];
                ContactEntity contactEntity = new ContactEntity(name, mail, phone);
                return contactEntity;
            }
         else {
            System.out.println("Ошибка ввода данных, передан null");
            return null;
        }



    }
}
