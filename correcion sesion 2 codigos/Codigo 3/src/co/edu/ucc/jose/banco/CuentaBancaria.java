package co.edu.ucc.jose.banco;

import java.util.Base64;

class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public boolean transferir(CuentaBancaria destino, double monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
            destino.saldo += monto;
            return true;
        }
        return false;
    }

    public void mostrarSaldo() {
        System.out.println("Cuenta: " + numeroCuenta + ", Saldo: " + saldo);
    }
    
    public String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public String getPatron() {
        return "Patrón Comportamiento - Encapsulación de datos";
    }

    public void mostrarInformacionFinal() {
        System.out.println("\nIdentidad Codificada: " + getIdentidad());
        System.out.println("Patrón Implementado: " + getPatron());
    }
}
