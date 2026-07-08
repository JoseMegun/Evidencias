package com.jmegun.app.ArreglosMatrices;

import java.util.Scanner;

/* Ejercicio 2: Dado 5 numeros obtener el mayor */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);

        sc.close();
    }
}