package com.example.harquitectura;

public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss); 
        establecerSalarioSemanal(salario); 
    }

    void establecerSalarioSemanal(double salario) {
        salarioSemanal = salario < 0.0 ? 0.0 : salario;
    }

    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    public double ingresos() {
        return obtenerSalarioSemanal();
    }

    public String toString() {
        return String.format("empleado asalariado: %s\n%s: $%,.2f", super.toString(), "salario semanal",
                obtenerSalarioSemanal());
    }
} 