package com.jmegun.app.ArreglosMatrices;

import java.util.Scanner;

/* Ejercicio 51: Dado 4 numeros, almacenelos en un vector, luego obtenga la suma y el promedio de los
valores almacenados. */

public class Ejercicio51 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[4];
        int suma = 0;
        double promedio;

        System.out.println("Ingrese 4 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        promedio = (double) suma / numeros.length;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}
