package com.jmegun.app.Lambda;

import java.util.Arrays;
import java.util.List;

/* Ejercicio 4: Ordenar una lista de palabras según su longitud en orden ascendente empleando lambda. */

public class Ejercicio4 {

    public static void main(String[] args) {

        List<String> palabras = Arrays.asList(
                "Computadora",
                "Sol",
                "Programación",
                "Java",
                "Libro"
        );

        System.out.println("Palabras ordenadas por longitud:");

        palabras.stream()
                .sorted((p1, p2) -> Integer.compare(p1.length(), p2.length()))
                .forEach(palabra -> System.out.println(palabra));
    }
}