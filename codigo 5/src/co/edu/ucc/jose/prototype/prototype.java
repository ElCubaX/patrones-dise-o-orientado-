// ======================================================
// Nombre del archivo: CuentaBancaria.java
// Paquete: co.edu.ucc.jose.prototype
// Autor: Jose Emilio Martinez Urgelles
// Descripción: Implementación del patrón Prototype para cuentas bancarias.
// Fecha: 2025-02-19
// ======================================================

package co.edu.ucc.jose.prototype;

import java.util.Base64;

// Prototipo
interface CuentaBancaria extends Cloneable {
    CuentaBancaria clone();
    void mostrarInfo();
}

class CuentaAhorros implements CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaAhorros(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public CuentaBancaria clone() {
        return new CuentaAhorros(this.titular, this.saldo);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Cuenta de Ahorros:");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIdentidad() {
        String nombreCompleto = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes());
    }
}
