package com.jmegun.app.GetterSetter;

public class MainCuentaBancaria {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.setSaldo(1500);

        System.out.println("Saldo actual: S/ " + cuenta.getSaldo());

        // Intentar asignar un saldo negativo
        cuenta.setSaldo(-300);

        System.out.println("Saldo final: S/ " + cuenta.getSaldo());
    }
}