package com.shilei.model.factoryModel;

public class OperationMul extends Operation{
    @Override
    public Double getResult() {
        Double result = numberA * numberB;
        return result;
    }
}
