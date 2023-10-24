package org.dz17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        /*LogicClass logicClas = context.getBean("logicClassData",LogicClass.class);
        logicClas.simpleLogic();
        logicClas.printLogicData();
        System.out.println("Hello world!");
        context.getBean(DataComponent.class).someWork();

         */
       // context.getBean(Worker.class).call();
        context.getBean(ContactsApp.class).run();
    }
}