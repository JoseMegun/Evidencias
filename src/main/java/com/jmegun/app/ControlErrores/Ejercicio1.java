package com.jmegun.app.ControlErrores;

import java.util.Scanner;

/* Ejercicio 1: Implementar un programa que solicite dos números para realizar una división y
capture el error si el divisor es cero. */

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            int num1 = sc.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = sc.nextInt();

            int resultado = num1 / num2;

            System.out.println("El resultado de la división es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }

        sc.close();
    }
}