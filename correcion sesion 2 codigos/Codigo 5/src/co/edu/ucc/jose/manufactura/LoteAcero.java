package co.edu.ucc.jose.manufactura;

import java.util.Base64;

/**
 * Clase que representa un lote de acero.
 */
public class LoteAcero {
    private double cantidad; 
    private double costoPorTonelada;

    public LoteAcero(double cantidad, double costoPorTonelada) {
        this.cantidad = cantidad;
        this.costoPorTonelada = costoPorTonelada;
    }

    public double calcularCostoTotal() {
        return cantidad * costoPorTonelada;
    }

    public String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public String getPatron() {
        return "Patrón de Diseño: Encapsulación (POO)";
    }
}
