package com.jmegun.app.Lambda;

import java.util.Arrays;
import java.util.List;

/* Ejercicio 1: Utilizar una función lambda para imprimir cada elemento de una lista de lenguajes
de programación. */

public class Ejercicio1 {

    public static void main(String[] args) {

        List<String> lenguajes = Arrays.asList(
                "Java",
                "Python",
                "C++",
                "JavaScript",
                "C#"
        );

        System.out.println("Lenguajes de programación:");

        lenguajes.forEach(lenguaje -> System.out.println(lenguaje));

    }

}