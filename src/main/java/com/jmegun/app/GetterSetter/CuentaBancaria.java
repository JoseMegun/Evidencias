package com.jmegun.app.GetterSetter;

public class CuentaBancaria {

    private double saldo;

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Setter con validación
    public void setSaldo(double saldo) {

        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: El saldo no puede ser negativo.");
        }

    }
}