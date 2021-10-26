package com.example.herencia;

public class Persona {

    public String name;
    public int age = 18;
    private int heigth;

    Persona(){
        System.out.println("Intance Persona");
    }

    Persona(String name){
       this.name =  name;
       System.out.println("Inicilizar Nombre");
    }

    Persona(String name, int age, int heigth){
        this.name =  name;
        this.age =  age;
        this.heigth =  heigth;
        System.out.println("Inicilizar Persona");
    }
     
    public void showName(){
            System.out.println("Persona Mi name is :" + name);
    }

    public void showPerson(){
        System.out.println("Mi name is :" + name);
        System.out.println("Mi age is :" + age);
        System.out.println("Mi heigth is :" + heigth);
    }

    public void showHeight(){
        System.out.println("Mi heigth is :" + heigth);
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}
