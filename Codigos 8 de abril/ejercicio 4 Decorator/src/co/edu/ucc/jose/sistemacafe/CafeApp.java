package co.edu.ucc.jose.sistemacafe;

import java.util.Base64;

public class CafeApp {
    public static void main(String[] args) {
        mostrarEncabezado();

        Cafe cafe = new CafeBasico();
        cafe = new ConLeche(cafe);
        cafe = new ConAzucar(cafe);

        System.out.println("\nProducto final:");
        System.out.println("Descripción: " + cafe.descripcion());
        System.out.println("Costo total: $" + cafe.costo());

        System.out.println("\nIdentidad (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    public static void mostrarEncabezado() {
        System.out.println("********************************************************");
        System.out.println("Detalles del Programa:");
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Año: 2025");
        System.out.println("Universidad: Universidad Cooperativa de Colombia");
        System.out.println("Programa: Ingeniería de Sistemas");
        System.out.println("Historia de Usuario:");
        System.out.println("Como barista digital en una app de pedidos, necesito permitir");
        System.out.println("a los usuarios personalizar su café con azúcar, leche, sabores,");
        System.out.println("sin modificar la clase base.");
        System.out.println("********************************************************");
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Decorator";
    }
}
