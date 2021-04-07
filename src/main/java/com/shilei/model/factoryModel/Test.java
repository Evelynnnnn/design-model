package com.shilei.model.factoryModel;

import com.shilei.model.factoryModel.Operation;

import static com.shilei.model.factoryModel.Operation.numberA;
import static com.shilei.model.factoryModel.Operation.numberB;

public class Test {
    public static void main(String[] args) throws Exception {
        OperationFactory factory = new OperationFactory();
        Operation operation = factory.createOperation("-");
        numberA = 10.0;
        numberB = 20.0;
        System.out.println(operation.getResult());
    }
}
