package com.shilei.model.factoryModel;

public class OperationAdd extends Operation{
    @Override
    public Double getResult() {
        Double result = numberA + numberB;
        return result;
    }
}
