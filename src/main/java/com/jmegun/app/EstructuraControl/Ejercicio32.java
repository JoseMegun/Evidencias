package com.jmegun.app.EstructuraControl;

import java.util.Scanner;

/* Ejercicio 32: Dado un rango de números enteros, obtener la cantidad de números pares e impares que
contiene el rango, sin considerar los múltiplos de 5. */

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fin;
        int pares = 0;
        int impares = 0;
        int multiplos5 = 0;

        System.out.print("Ingrese el número inicial: ");
        inicio = sc.nextInt();

        System.out.print("Ingrese el número final: ");
        fin = sc.nextInt();

        for (int i = inicio; i <= fin; i++) {

            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (i % 5 == 0) {
                multiplos5++;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        System.out.println("Cantidad de múltiplos de 5: " + multiplos5);

        sc.close();
    }
}