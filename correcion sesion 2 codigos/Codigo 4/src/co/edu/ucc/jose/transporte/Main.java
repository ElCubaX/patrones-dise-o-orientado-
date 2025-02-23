/**
 * Nombre: Jose Emilio Martinez Urgelles
 * Universidad: Universidad Cooperativa de Colombia
 * Curso: Patrones de diseño orientado a objetos
 * Descripción: Implementación de compra de boletos de autobús.
 */

 package co.edu.ucc.jose.transporte;

 public class Main {
    public static void main(String[] args) {
        
        System.out.println("==========================================");
        System.out.println(" Nombre: Jose Emilio Martinez Urgelles");
        System.out.println(" Universidad: Universidad Cooperativa de Colombia");
        System.out.println(" Curso: Patrones de Diseño Orientado a Objetos");
        System.out.println(" Descripción: Implementación de compra de boletos de autobús.");
        System.out.println("==========================================\n");



        Autobus autobus = new Autobus();
        Boleto boleto = autobus.comprarBoleto("Ciudad A - Ciudad B", "Juan Pérez");

        boleto.mostrarBoleto();

        System.out.println("Identidad: " + boleto.getIdentidad());
        System.out.println("Patrón: " + boleto.getPatron());
    }
}
