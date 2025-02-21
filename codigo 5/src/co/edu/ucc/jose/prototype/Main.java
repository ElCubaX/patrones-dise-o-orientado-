// ======================================================
// Nombre del archivo: Main.java
// Paquete: co.edu.ucc.jose.prototype
// Autor: Jose Emilio Martinez Urgelles
// Descripción: Prueba del patrón Prototype con CuentaAhorros.
// Fecha: 2025-02-19
// ======================================================

package co.edu.ucc.jose.prototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println(" Nombre del archivo: Main.java");
        System.out.println(" Paquete: co.edu.ucc.jose.prototype");
        System.out.println(" Autor: Jose Emilio Martinez Urgelles");
        System.out.println(" Descripción: Prueba del patrón Prototype con CuentaAhorros.");
        System.out.println(" Fecha: 2025-02-19");
        System.out.println("======================================================\n");
        
        CuentaAhorros cuentaOriginal = new CuentaAhorros("Juan Pérez", 5000);

        System.out.println("Cuenta Original:");
        cuentaOriginal.mostrarInfo();

        CuentaAhorros cuentaClonada = (CuentaAhorros) cuentaOriginal.clone();

        cuentaClonada.setTitular("María López");
        cuentaClonada.setSaldo(7000);

        System.out.println("\nCuenta Clonada:");
        cuentaClonada.mostrarInfo();

        System.out.println("\nIdentidad codificada en Base64: " + cuentaClonada.getIdentidad());
    }
}
