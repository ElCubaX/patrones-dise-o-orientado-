/**
 * Nombre: Jose Emilio Martinez Urgelles
 * Universidad: Universidad Cooperativa de Colombia
 * Curso: Patrones de diseño orientado a objetos
 * Descripción: Implementación de compra de boletos de autobús.
 */


 package co.edu.ucc.jose.transporte;

 class Autobus {
    public Boleto comprarBoleto(String viaje, String pasajero) {
        return new Boleto(viaje, pasajero);
    }
}
