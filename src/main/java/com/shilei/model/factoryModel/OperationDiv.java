package com.shilei.model.factoryModel;

public class OperationDiv extends Operation{
    @Override
    public Double getResult() throws Exception {
        if (numberB == 0){
            throw new Exception("除数不能为0！");
        }
        Double result = numberA / numberB;
        return result;
    }
}
