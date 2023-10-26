package org.dz17;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//import javax.annotation.PostConstruct;


public class InitContactLoading implements ContactLoadingInterface, TextFileInteface{

    @Value("${default.file}")
    private String filename;




    @Override
    public List<ContactEntity> load() {

        System.out.println("Загружаем " + filename);
        List<ContactEntity> ceList = new ArrayList<>();

        ceList = readFile(filename).stream().map(ContactConvertor::stringToContact).collect(Collectors.toList());
        System.out.println("Загружено " + ceList.size() + " контактов");
        return ceList;
    }



    @Override
    public List<ContactEntity> getContact() {
        return load();
    }
}
