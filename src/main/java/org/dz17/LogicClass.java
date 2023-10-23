package org.dz17;

import java.text.MessageFormat;

public class LogicClass {

    private String name;
    private int code;

    public LogicClass(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public LogicClass(){
        System.out.println("lk inicti");
    }
    public void simpleLogic(){
        System.out.println("simple clas logic metod");
    }

    public void printLogicData(){
        System.out.println(MessageFormat.format("Simle logic dafta: {0}, {1}", name, code));
    }
}
