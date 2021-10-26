package com.example.herencia;

public class Adminstrador extends Persona {

    int id = 0;
    String cargo = "";
    String rango = "";

    Adminstrador(){
        // super(name, age, heigth);
        System.out.println("Intance Adminitrador");
    }

    Adminstrador(String name, int age, int heigth){
        super(name, age, heigth);
        System.out.println("Intance Adminitrador");
    }

    Adminstrador(String name, int age, int heigth, int id, String cargo, String rango){
        super(name, age, heigth);
        this.id = id;
        this.cargo = cargo;
        this. rango = rango;
        System.out.println("Intance Adminitrador");
    }

    void printAdmin (){
        System.out.println("Admin cargo" + cargo);
        System.out.println("Admin rango" + rango);
    }

    void addHeight(int ref){
        super.setHeigth(ref);
    }

    public void showPerson(){
        super.showPerson();
        System.out.println("Admin cargo" + cargo);
        System.out.println("Admin rango" + rango);
    }
    
}
