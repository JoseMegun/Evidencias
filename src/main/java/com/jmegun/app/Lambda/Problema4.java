package com.jmegun.app.Lambda;

import java.util.Arrays;
import java.util.List;

/* Problema 4: Crea una lista de precios en decimales : 10.0, 25.5, 50.0, 100.0. Utiliza Streams
pasando una expresión lambda como argumento para aplicar un descuento del 15% a cada elemento.
Muestra los precios finales transformados. */

public class Problema4 {

    public static void main(String[] args) {

        List<Double> precios = Arrays.asList(10.0, 25.5, 50.0, 100.0);

        System.out.println("Precios con 15% de descuento:");

        precios.stream()
                .map(precio -> precio * 0.85)
                .forEach(precio -> System.out.printf("S/. %.2f%n", precio));

    }
}