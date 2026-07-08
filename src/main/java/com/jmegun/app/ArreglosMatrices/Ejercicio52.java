package com.jmegun.app.ArreglosMatrices;

import java.util.Scanner;

/* Ejercicio 52: Dado 4 numeros y almacene en un vector el numero mayor y el menor. */

public class Ejercicio52 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[4];

        System.out.println("Ingrese 4 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }

        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        sc.close();
    }
}
