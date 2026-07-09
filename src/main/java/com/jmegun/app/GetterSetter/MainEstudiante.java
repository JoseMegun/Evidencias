package com.jmegun.app.GetterSetter;

public class MainEstudiante {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("José");
        estudiante.setNota(18);

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Nota: " + estudiante.getNota());

        // Intentar asignar una nota incorrecta
        estudiante.setNota(25);
    }
}