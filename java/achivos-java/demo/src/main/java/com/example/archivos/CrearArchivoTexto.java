package com.example.archivos;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CrearArchivoTexto {
    private Formatter salida;

    public void abrirArchivo() {
        try {
            salida = new Formatter("clientes.txt");
            System.out.println("File clientes.txt is open");
        } catch (SecurityException securityException) {
            System.err.println("No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        }
    }

    public void agregarRegistros() {
        // objeto que se va a escribir en el archivo
        RegistroCuenta registro = new RegistroCuenta();

        Scanner entrada = new Scanner(System.in);
        System.out.printf("%s\n%s\n%s\n%s\n\n", "Para terminar la entrada, escriba el indicador de fin de archivo ",
                "cuando se le pida que escriba los datos de entrada.",
                "En UNIX/Linux/Mac OS X escriba <ctrl> d y oprima Intro", "En Windows escriba <ctrl> z y oprima Intro");

        System.out.printf("%s\n%s", "Escriba el numero de cuenta (> 0), primer nombre, apellido paterno y saldo.",
                "? ");
        while (entrada.hasNext()) // itera hasta encontrar el indicador de fin de archivo
        {
            try // envía valores al archivo
            {
                // obtiene los datos que se van a enviar
                registro.establecerCuenta(entrada.nextInt()); //
                registro.establecerPrimerNombre(entrada.next()); // lee el primer nombre
                registro.establecerApellidoPaterno(entrada.next());
                registro.establecerSaldo(entrada.nextDouble()); // lee el saldo
                if (registro.obtenerCuenta() > 0) {
                    // escribe el nuevo registro
                    salida.format("%d %s %s %.2f\n", registro.obtenerCuenta(), registro.obtenerPrimerNombre(),
                            registro.obtenerApellidoPaterno(), registro.obtenerSaldo());
                    System.out.println("Escribiendo nuevo registro" + registro.obtenerCuenta());
                } else {
                    System.out.println("El numero de cuenta debe ser mayor que 0.");
                }
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escribir en el archivo.");
                return;
            } catch (NoSuchElementException elementException) {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine();
            }
            System.out.printf("%s %s\n%s", "Escriba el numero de cuenta (> 0),",
                    "primer nombre, apellido paterno y saldo.", "? ");
        }
    }

    public void cerrarArchivo() {
        if (salida != null){
            salida.close();
            System.out.println("File clientes.txt is close");
        }
    }
}