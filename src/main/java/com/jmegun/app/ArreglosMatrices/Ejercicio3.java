package com.jmegun.app.ArreglosMatrices;

import java.util.Scanner;

/* Ejercicio 3: Dado 5 numeros obtener la cantidad de numeros primos ingresados */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int cantidadPrimos = 0;

        System.out.println("Ingrese 5 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {

            if (esPrimo(numeros[i])) {
                cantidadPrimos++;
            }

        }

        System.out.println("Cantidad de números primos: " + cantidadPrimos);

        sc.close();
    }

    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}