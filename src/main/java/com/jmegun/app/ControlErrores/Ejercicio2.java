package com.jmegun.app.ControlErrores;

/* Crear un arreglo de nombres e intentar acceder a una posición fuera de los límites establecidos. */

public class Ejercicio2 {
    public static void main(String[] args) {

        String[] nombres = {
                "Ana",
                "Luis",
                "Carlos",
                "María",
                "Pedro"
        };

        try {

            System.out.println("Nombre: " + nombres[7]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: La posición solicitada no existe en el arreglo.");

        }
    }
}
