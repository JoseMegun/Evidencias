package com.jmegun.app.Lambda;

import java.util.Arrays;
import java.util.List;

/* Ejercicio 2: Filtrar únicamente los números pares de una lista utilizando expresiones lambda
en la condición. */

public class Ejercicio2 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(5, 8, 12, 15, 20, 23, 30);

        System.out.println("Números pares:");

        numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .forEach(numero -> System.out.println(numero));
    }
}