package com.segundo.punto;

public class Account {

    // Tasa en porcentajes
    static double rate = 1;

    // atributos 
    static int id = 0;
    private String name; 
    private double amount;
  
    // Constroctor 
    Account(String name, double amount){
        this.name = name;
        this.amount = amount;
        id = id + 1;
    }


    double getMonthValue () {
        // System.out.println("test0 -> " + (double)(rate));
        // System.out.println("test1 -> " + (double)(rate/12));
        // System.out.println("test2 -> " + this.amount);
        return (double)(rate/12) * this.amount;
    }

    void getAccountUser(){
        System.out.println("id -> " + id);
        System.out.println("Name -> " + this.name);
        System.out.println("Amount -> " + this.amount);
    }

}

 