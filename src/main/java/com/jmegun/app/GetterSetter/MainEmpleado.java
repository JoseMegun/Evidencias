package com.jmegun.app.GetterSetter;

public class MainEmpleado {

    public static void main(String[] args) {

        Empleado empleado = new Empleado();

        empleado.setNombre("José");
        empleado.setSalario(1500);

        System.out.println("Empleado: " + empleado.getNombre());
        System.out.println("Salario: S/. " + empleado.getSalario());

        System.out.println();

        // Intento de asignar un salario inválido
        empleado.setSalario(900);

        System.out.println();

        System.out.println("Salario final: S/. " + empleado.getSalario());

    }
}