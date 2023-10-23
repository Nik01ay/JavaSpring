package org.dz17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Worker {

    private final LogicClass simpleLogic;

    private final  LogicClass dataLogic;

    private final DataComponent dataComponent;
@Autowired
    public Worker(LogicClass simpleLogicClass, LogicClass logicClassData, DataComponent dataComponent) {
        this.simpleLogic = simpleLogicClass;
        this.dataLogic = logicClassData;
        this.dataComponent = dataComponent;
    }

    public  void call(){
    simpleLogic.simpleLogic();
    dataLogic.printLogicData();
    dataComponent.someWork();

    }
}
