package com.example.herencia;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // Adminstrador admin = new Adminstrador();

        // admin.printAdmin();
        // admin.showName();
        // System.out.println("Age ->" + admin.age);

        // System.out.println("*****************************");
        // System.out.println("*****************************");

        // Adminstrador admin2 = new Adminstrador("Andres", 30, 175);
        // admin2.showName();

        // System.out.println("*****************************");
        // System.out.println("*****************************");

        // Adminstrador admin3 = new Adminstrador("Camila", 20, 185, 1, "Supervisora", "E2");
        // admin3.showName();
        // admin3.printAdmin();


        // System.out.println("*****************************");
        // System.out.println("*****************************");

        // Adminstrador admin4 = new Adminstrador("Camila", 20, 185, 1, "Supervisora", "E2");
        // admin4.showHeight();
        // admin4.addHeight(165);
        // admin4.showHeight();

        // System.out.println("*****************************");
        // System.out.println("*****************************");

        // Adminstrador admin5 = new Adminstrador("Camila", 20, 185, 1, "Supervisora", "E2");
        // admin5.showPerson();


        System.out.println("*****************************");
        System.out.println("*****************************");

        Contratista contratista = new Contratista();
        contratista.rango = "E7";
        contratista.name = "Andres";
        contratista.showPerson();


    }
}
