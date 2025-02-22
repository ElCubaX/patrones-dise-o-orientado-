package co.edu.ucc.jose.manufactura_acero;

import java.util.Base64;

/**
 * =====================================================
 *  Sistema de Producción de Acero - Sector: Manufactura
 * =====================================================
 * 
 * Historia de Usuario:
 * Como supervisor de producción, quiero poder registrar la cantidad 
 * de acero producido por cada máquina en un turno, para poder 
 * llevar un control de la producción.
 * 
 * Autor: Jose Emilio Martinez Urgelles
 * Universidad: Universidad Cooperativa de Colombia
 * Curso: Patrones de diseño Orientado a Objetos
 */

public class Maquina {
    private String nombre;
    private double aceroProducido;

    public Maquina(String nombre) {
        this.nombre = nombre;
        this.aceroProducido = 0;
    }

    /**
     * Aumenta la cantidad de acero producido por la máquina.
     * 
     * @param cantidad 
     */
    public void producirAcero(double cantidad) {
        this.aceroProducido += cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAceroProducido() {
        return aceroProducido;
    }

    /**
     * Retorna el nombre completo del autor codificado en Base64.
     * 
     * @return 
     */
    public String getIdentidad() {
        String nombreCompleto = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes());
    }

    /**
     * Retorna el patrón de diseño utilizado.
     * 
     * @return 
     */
    public String getPatron() {
        return "Patrón utilizado: Composite, ya que se agrupan múltiples máquinas en una entidad Turno.";
    }
}
