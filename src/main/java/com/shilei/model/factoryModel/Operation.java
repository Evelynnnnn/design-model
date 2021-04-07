package com.shilei.model.factoryModel;

public class Operation {

    public static Double numberA;

    public static Double numberB;

    public static Double getNumberA() {
        return numberA;
    }

    public static void setNumberA(Double numberA) {
        Operation.numberA = numberA;
    }

    public static Double getNumberB() {
        return numberB;
    }

    public static void setNumberB(Double numberB) {
        Operation.numberB = numberB;
    }

    public Double getResult() throws Exception {
        double result = 0;
        return result;
    }
}
