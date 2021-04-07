package com.shilei.model.factoryModel;

public class OperationFactory {

    public Operation createOperation(String operate){
        Operation operation = new Operation();
        switch (operate){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
