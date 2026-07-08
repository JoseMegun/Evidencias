package com.jmegun.app.ArreglosMatrices;

import java.util.Scanner;

/* Ejercicio 4: Buscar un numero en 7 numeros ingresados y determine la posicion y si existe o no
el numero buscado */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[7];

        System.out.println("Ingrese 7 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Ingrese el número a buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscar) {
                System.out.println("El número existe.");
                System.out.println("Se encuentra en la posición: " + i);
                encontrado = true;
                break;
            }

        }

        if (!encontrado) {
            System.out.println("El número no existe en el arreglo.");
        }

        sc.close();
    }
}