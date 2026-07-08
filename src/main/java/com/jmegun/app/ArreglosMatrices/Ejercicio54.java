package com.jmegun.app.ArreglosMatrices;

import java.util.Scanner;

/* Ejercicio 54: Ordene 5 numeros segun la forma que se indique: A (ASCENDENTE) o D (DESCENDIENTE) */

public class Ejercicio54 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int aux;
        char opcion;

        System.out.println("Ingrese 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Orden Ascendente (A) o Descendente (D): ");
        opcion = sc.next().toUpperCase().charAt(0);

        if (opcion == 'A') {

            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = i + 1; j < numeros.length; j++) {

                    if (numeros[i] > numeros[j]) {
                        aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;
                    }

                }
            }

        } else if (opcion == 'D') {

            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = i + 1; j < numeros.length; j++) {

                    if (numeros[i] < numeros[j]) {
                        aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;
                    }

                }
            }

        } else {

            System.out.println("Opción no válida.");
            sc.close();
            return;

        }

        System.out.println("Vector ordenado:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        sc.close();
    }
}