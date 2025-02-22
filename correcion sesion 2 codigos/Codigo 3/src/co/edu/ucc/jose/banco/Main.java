package co.edu.ucc.jose.banco;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("Sector: Bancos");
        System.out.println("Historia de Usuario:");
        System.out.println("Jose Emilio Martinez Urgelles");
        System.out.println("Curso: Patrones de Diseño Orientado a objetos");
        System.out.println("Como cliente del banco, quiero poder transferir dinero de mi cuenta a otra cuenta,");
        System.out.println("para poder realizar pagos o enviar dinero a familiares.");
        System.out.println("===========================================\n");

        CuentaBancaria cuenta1 = new CuentaBancaria("123456", 1000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("654321", 500.0);

        cuenta1.transferir(cuenta2, 200.0);

        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();

        // Ejecutar métodos al final
        System.out.println("\nIdentidad Codificada: " + getIdentidad());
        System.out.println("Patrón Implementado: " + getPatron());
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Patrón Comportamiento - Encapsulación de datos";
    }
}
