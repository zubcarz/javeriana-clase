package com.example.archivos;

// Este programa lee un archivo de texto y muestra cada registro.
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeerArchivoTexto {
    private Scanner entrada;

    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("clientes.txt"));
        } 
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        }
    } 

    public void leerRegistros() {

        RegistroCuenta registro = new RegistroCuenta();
        System.out.printf("%-9s%-15s%-18s%10s\n", "Cuenta", "Primer nombre", "Apellido paterno", "Saldo");

        try 
        {
            while (entrada.hasNext()) {
                registro.establecerCuenta(entrada.nextInt());
                registro.establecerPrimerNombre(entrada.next());
                registro.establecerApellidoPaterno(entrada.next());
                registro.establecerSaldo(entrada.nextDouble());

                System.out.printf("<%-9d%-15s%-18s%10.2f\n", registro.obtenerCuenta(), registro.obtenerPrimerNombre(),
                        registro.obtenerApellidoPaterno(), registro.obtenerSaldo());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } 
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
    } 

    public void cerrarArchivo() {
        if (entrada != null)
            entrada.close(); 
    } 
} 