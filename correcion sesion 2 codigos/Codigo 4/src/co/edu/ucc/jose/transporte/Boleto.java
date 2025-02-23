/**
 * Nombre: Jose Emilio Martinez Urgelles
 * Universidad: Universidad Cooperativa de Colombia
 * Curso: Patrones de Diseño Orientado a Objetos
 * Descripción: Implementación de compra de boletos de autobús.
 */

 package co.edu.ucc.jose.transporte;

 import java.util.Base64;

 class Boleto {
     private String viaje;
     private String pasajero;
 
     public Boleto(String viaje, String pasajero) {
         this.viaje = viaje;
         this.pasajero = pasajero;
     }
 
     public void mostrarBoleto() {
         System.out.println("Viaje: " + viaje + ", Pasajero: " + pasajero);
     }
 
     public String getIdentidad() {
         String nombre = "Jose Emilio Martinez Urgelles";
         return Base64.getEncoder().encodeToString(nombre.getBytes());
     }
 
     public String getPatron() {
         return "Factory Method";
     }
 }
 