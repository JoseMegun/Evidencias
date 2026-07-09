package com.jmegun.app.ControlErrores;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Problema 2: Escribe un programa que solicite al usuario ingresar la cantidad de productos que
desea comprar. Encapsula la lectura en un bloque try-catch. Si el usuario escribe palabras o símbolos
en lugar de un número entero, el programa debe capturar la excepción y un mensaje */

public class Problema2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Ingrese la cantidad de productos: ");
            int cantidad = sc.nextInt();

            System.out.println("Cantidad de productos: " + cantidad);

        } catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un número entero válido.");

        }

        sc.close();

    }

}