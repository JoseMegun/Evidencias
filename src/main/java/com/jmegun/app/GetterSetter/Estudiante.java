package com.jmegun.app.GetterSetter;

public class Estudiante {

    private String nombre;
    private double nota;

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para nota
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 20) {
            this.nota = nota;
        } else {
            System.out.println("Error: La nota debe estar entre 0 y 20.");
        }
    }
}