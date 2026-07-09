package com.jmegun.app.ControlErrores;

/* Problema 1: Desarrolla un programa en Java que declare una variable de tipo String que represente
la edad de un usuario. El programa debe intentar convertir dicha cadena a un valor entero. Encapsula
la conversión dentro de un bloque try-catch. Si la cadena contiene texto no numérico, captura la
excepción e imprime en pantalla un mensaje. */

public class Problema1 {

    public static void main(String[] args) {

        // Cadena que representa la edad
        String edadTexto = "25";

        try {

            int edad = Integer.parseInt(edadTexto);

            System.out.println("La edad es: " + edad);

        } catch (NumberFormatException e) {

            System.out.println("Error: La edad ingresada no es un número válido.");

        }

    }

}