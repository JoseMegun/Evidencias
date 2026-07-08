package com.jmegun.app.EstructuraControl;

import java.util.Scanner;

/* Ejercicio 31: Obtener el factorial de un número, recuerde que el factorial de un número es
el producto de 1 x 2 x 3 ... x N */

public class Ejercicio31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        long factorial = 1;

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        sc.close();
    }
}
