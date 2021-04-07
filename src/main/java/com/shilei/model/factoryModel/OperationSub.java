package com.shilei.model.factoryModel;

public class OperationSub extends Operation{

    @Override
    public Double getResult() {
        Double result = numberA - numberB;
        return result;
    }
}
