package co.edu.ucc.jose.factorymethod;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("     UNIVERSIDAD COOPERATIVA DE COLOMBIA");
        System.out.println("         INGENIERÍA DE SISTEMAS");
        System.out.println("     Nombre: Jose Emilio Martinez");
        System.out.println("     Profesor: Harold Bolaños");
        System.out.println("===============================================");
        System.out.println();

        Prestamo p1 = FabricaPrestamo.obtenerPrestamo("hipotecario");
        Prestamo p2 = FabricaPrestamo.obtenerPrestamo("automotriz");
        Prestamo p3 = FabricaPrestamo.obtenerPrestamo("personal");

        p1.mostrarDetalles();
        p2.mostrarDetalles();
        p3.mostrarDetalles();

        System.out.println("\nIdentidad codificada: " + getIdentidad());
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
}
