package com.jmegun.app.EstructuraControl;

import java.util.Scanner;

/* Ejercicio 33: Calcular la suma y el producto de los N primeros números naturales múltiplos de 3. */

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int suma = 0;
        long producto = 1;

        System.out.print("Ingrese la cantidad de múltiplos de 3: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int multiplo = i * 3;

            suma = suma + multiplo;
            producto = producto * multiplo;
        }

        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);

        sc.close();
    }
}