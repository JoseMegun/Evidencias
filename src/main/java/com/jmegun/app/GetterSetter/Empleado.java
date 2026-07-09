package com.jmegun.app.GetterSetter;

/* Problema 5: Diseña una clase llamada Empleado con los atributos privados nombre y salario.
Define sus métodos getter y setter. En el método setSalario, agrega una condición de validación
que asegure que el salario a asignar no sea inferior al salario mínimo (s/.1,020.00). Si el salario
ingresado es menor, imprime una advertencia y conserva el valor anterior. */

public class Empleado {

    private String nombre;
    private double salario;

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para salario
    public double getSalario() {
        return salario;
    }

    // Setter con validación
    public void setSalario(double salario) {

        if (salario >= 1020.00) {
            this.salario = salario;
        } else {
            System.out.println("Advertencia: El salario no puede ser menor a S/. 1,020.00");
            System.out.println("Se mantiene el salario anterior: S/. " + this.salario);
        }
    }
}