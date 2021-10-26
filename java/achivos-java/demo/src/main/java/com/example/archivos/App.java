package com.example.archivos;

import java.io.FileReader;
import com.google.gson.Gson;

public class App {
    static String path = "C:/Users/LENOVO/Documents/Personal/Javeriana/Talleres/Proyecto programación avanzada.pdf";

    public static void main(String[] args) {
        // Leer datos de un archivo
        // DemostracionFile Dfile = new DemostracionFile();
        // Dfile.analizarRuta(path);S

        // Crear un archivo
        // CrearArchivoTexto app = new CrearArchivoTexto();
        // app.abrirArchivo();
        // app.agregarRegistros();
        // app.cerrarArchivo();

        // // leer Archivo
        // LeerArchivoTexto aplicacion = new LeerArchivoTexto();
        // aplicacion.abrirArchivo();
        // aplicacion.leerRegistros();
        // aplicacion.cerrarArchivo();

        Gson gson = new Gson();

        // 1. JSON file to Java object
        try {
            Object object = gson.fromJson(new FileReader("data.json"), Object.class);
            // System.out.println(object.get(""));
            // Data data = (Data) object;
            // System.out.println(data.id);
            // System.out.println(data.value);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // 2. JSON string to Java object
        // String json = "{'name' : 'mkyong'}";
        // Object object = gson.fromJson(json, Staff.class);

    }
}
