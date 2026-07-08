package com.jmegun.app.ArreglosMatrices;

import java.util.Scanner;

/* Ejercicio 1: Dado 5 numeros obtener su suma. */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("Ingrese 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        System.out.println("La suma de los números es: " + suma);

        sc.close();
    }
}