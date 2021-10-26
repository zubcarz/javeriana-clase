package com.example.archivos;

import java.io.File;

public class DemostracionFile {

    public void analizarRuta(String ruta) {
       
        File nombre = new File(ruta);

        if (nombre.exists()) // si existe el nombre, muestra información sobre él
        {
            System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s", 
                    nombre.getName(), " existe",
                    (nombre.isFile() ? "es un archivo" : "no es un archivo"),
                    (nombre.isDirectory() ? "es un directorio" : "no es un directorio"),
                    (nombre.isAbsolute() ? "es ruta absoluta" : "no es ruta absoluta"), "Ultima modificacion: ",
                    nombre.lastModified(), "Tamanio: ", nombre.length(), "Ruta: ", nombre.getPath(), "Ruta absoluta: ",
                    nombre.getAbsolutePath(), "Padre: ", nombre.getParent());


            if (nombre.isDirectory())
            {
                String directorio[] = nombre.list();
                System.out.println("\n\nContenido del directorio:\n");

                for (String nombreDirectorio : directorio)
                    System.out.printf("%s\n", nombreDirectorio);
            } 
        } 
        else 
        {
            System.out.printf("%s %s", ruta, "no existe.");
        } 
    }
}