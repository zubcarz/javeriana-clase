package com.example.harquitectura;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa,
            double salario) {
        super(nombre, apellido, nss, ventas, tarifa);
        establecerSalarioBase(salario);
    }

    public void establecerSalarioBase(double salario) {
        salarioBase = (salario < 0.0) ? 0.0 : salario;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    public double ingresos() {
        return obtenerSalarioBase() + super.ingresos();
    }

    public String toString() {
        return String.format("%s %s; %s: $%,.2f", "con salario base", super.toString(), "salario base",
                obtenerSalarioBase());
    }
}