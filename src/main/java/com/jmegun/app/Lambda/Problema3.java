package com.jmegun.app.Lambda;

import java.util.Arrays;
import java.util.List;

/* Problema 3: Dada la siguiente lista de países: "Argentina", "Brasil", "Alemania", "Chile",
"Australia", utiliza la Streams de Java y una expresión lambda para extraer únicamente los países
cuyos nombres comiencen con la letra "A". */

public class Problema3 {

    public static void main(String[] args) {

        List<String> paises = Arrays.asList(
                "Argentina",
                "Brasil",
                "Alemania",
                "Chile",
                "Australia"
        );

        System.out.println("Países que comienzan con la letra A:");

        paises.stream()
                .filter(pais -> pais.startsWith("A"))
                .forEach(System.out::println);

    }
}
