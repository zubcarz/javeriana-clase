package com.example.harquitectura;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Inicializacion
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444",
                5000, .04, 300);

        System.out.println("Empleados procesados por separado:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoAsalariado, "ingresos",
        empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorHoras, "ingresos",
        empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoPorComision, "ingresos",
        empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n", empleadoBaseMasComision, "ingresos",
        empleadoBaseMasComision.ingresos());

        Empleado empleados[] = new Empleado[4];

        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.println("Empleados procesados en forma polimorfica:\n");

        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual);

            if (empleadoActual instanceof EmpleadoBaseMasComision) {

                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;

                double salarioBaseAnterior = empleado.obtenerSalarioBase();
                empleado.establecerSalarioBase(1.10 * salarioBaseAnterior);
                System.out.printf("el nuevo salario base con 10%% de aumento es : $%,.2f\n",
                        empleado.obtenerSalarioBase());

                System.out.printf("ingresos $%,.2f\n\n", empleadoActual.ingresos());
            }

            for (int j = 0; j < empleados.length; j++)
                System.out.printf("El empleado %d es un %s\n", j, empleados[j].getClass().getName());
        }

    }
}
