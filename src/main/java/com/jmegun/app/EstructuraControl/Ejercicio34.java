package com.jmegun.app.EstructuraControl;

import java.util.Scanner;

/* Ejercicio 34: Dado un número, determinar cuantos digitos 0 contiene. */

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long numero;
        int contador = 0;

        System.out.print("Ingrese un número: ");
        numero = sc.nextLong();

        if (numero == 0) {
            contador = 1;
        } else {

            while (numero != 0) {

                if (numero % 10 == 0) {
                    contador++;
                }

                numero = numero / 10;
            }
        }

        System.out.println("Cantidad de ceros: " + contador);

        sc.close();
    }
}