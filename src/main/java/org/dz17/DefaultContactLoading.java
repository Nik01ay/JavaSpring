package org.dz17;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.PostConstruct;


public class DefaultContactLoading implements ContactLoadingInterface{

    @Value("${default.file}")
    private String filename;


    @Override
    public List<ContactEntity> load() {

        System.out.println("Default Ничего не Загружаем " + filename);
        List<ContactEntity> ceList = new ArrayList<>();
       //  ceList = readFile(filename).stream(s -> (ContactConvertor.stringToContact(s))).collect(Collectors.toList());
        return ceList;
    }



    @Override
    public List<ContactEntity> getContact() {
        return load();
    }
}
