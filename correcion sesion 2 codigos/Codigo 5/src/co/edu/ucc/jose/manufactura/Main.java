package co.edu.ucc.jose.manufactura;

import java.util.Scanner;

/**
 * Nombre: Jose Emilio Martinez Urgelles
 * Universidad: Universidad Cooperativa de Colombia
 * Curso: Patrones de Diseño Orientado a Objetos
 * Sector: Manufactura de Acero
 * Descripción: Cálculo del costo total de producción de un lote de acero.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Encabezado
        System.out.println("==========================================");
        System.out.println(" Nombre: Jose Emilio Martinez Urgelles");
        System.out.println(" Universidad: Universidad Cooperativa de Colombia");
        System.out.println(" Curso: Patrones de Diseño Orientado a Objetos");
        System.out.println(" Sector: Manufactura de Acero");
        System.out.println(" Descripción: Cálculo del costo total de producción de un lote de acero.");
        System.out.println("==========================================\n");

        // Entrada de datos
        System.out.print("Ingrese la cantidad de acero (toneladas): ");
        double cantidad = scanner.nextDouble();

        System.out.print("Ingrese el costo por tonelada: ");
        double costoPorTonelada = scanner.nextDouble();

        LoteAcero lote = new LoteAcero(cantidad, costoPorTonelada);

        System.out.println("\nCosto total del lote: $" + lote.calcularCostoTotal());

        System.out.println("\nIdentidad codificada (Base64): " + lote.getIdentidad());
        System.out.println(lote.getPatron());

        scanner.close();
    }
}
