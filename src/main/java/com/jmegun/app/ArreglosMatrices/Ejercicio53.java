package com.jmegun.app.ArreglosMatrices;

import java.util.Scanner;

/* Ejercicio 53: Dado 6 numeros almacenelos en un vector, luego obtenga cuantos numeros multiplos
de n ha ingresado. */

public class Ejercicio53 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];
        int n;
        int contador = 0;

        System.out.println("Ingrese 6 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Ingrese el valor de N: ");
        n = sc.nextInt();

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % n == 0) {
                contador++;
            }

        }

        System.out.println("Cantidad de múltiplos de " + n + ": " + contador);

        sc.close();
    }
}
