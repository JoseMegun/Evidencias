package com.jmegun.app.Lambda;

import java.util.Arrays;
import java.util.List;

/* Ejercicio 3: Convertir una lista de cadenas a mayúsculas usando la función map y un parámetro lambda. */

public class Ejercicio3 {

    public static void main(String[] args) {

        List<String> ciudades = Arrays.asList(
                "Lima",
                "Cusco",
                "Arequipa",
                "Trujillo"
        );

        System.out.println("Ciudades en mayúsculas:");

        ciudades.stream()
                .map(ciudad -> ciudad.toUpperCase())
                .forEach(ciudad -> System.out.println(ciudad));

    }

}