package com.javeriana;

public class Calculator {

    double res;
    double tempRes;
    private double currentNumber;
    String history;

    Calculator() {
        this.res = 0;
        this.tempRes = 0;
        this.history = "";
        this.currentNumber = 0;
    }

    public double getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(double currentNumber) {
        this.currentNumber = currentNumber;
    }

    void add() {
        res = res + this.currentNumber;
        tempRes = res;
        history = res + "+" + this.currentNumber;
        showResult();
    }

    void showResult() {
        System.out.println("Resultado => " + res);
        System.out.println("Historico => " + history);
    }
}
