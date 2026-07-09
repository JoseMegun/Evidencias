package com.jmegun.app.ControlErrores;

import java.util.Scanner;

/* Lanzar una excepción de tipo ArithmeticException si la edad ingresada es menor a 18 años. */

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();

            if (edad < 18) {
                throw new ArithmeticException("La edad debe ser mayor o igual a 18 años.");
            }

            System.out.println("Acceso permitido.");

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        }

        sc.close();
    }
}
