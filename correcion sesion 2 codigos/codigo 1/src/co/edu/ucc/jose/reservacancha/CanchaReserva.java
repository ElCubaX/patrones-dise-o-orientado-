package co.edu.ucc.jose.reservacancha;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * =====================================================
 *  Sistema de Reservas de Canchas - Sector: Recreación
 * =====================================================
 * 
 * Historia de Usuario:
 * Como usuario, quiero poder reservar una cancha de fútbol 
 * para un día y hora específicos, para poder jugar con mis amigos.
 * 
 * Autor: Jose Emilio Martinez Urgelles
 * Universidad: Universidad Cooperativa de Colombia
 * Curso: Análisis Numérico
 * 
 */

public class CanchaReserva {
    private Map<String, String> reservas = new HashMap<>();

    /**
     * Método para reservar una cancha en una fecha y hora específicas.
     * 
     * @param fecha  Fecha de la reserva (YYYY-MM-DD)
     * @param hora   Hora de la reserva (HH:mm)
     * @param usuario Nombre del usuario que realiza la reserva
     * @return true si la reserva fue exitosa, false si ya estaba reservada.
     */
    public boolean reservarCancha(String fecha, String hora, String usuario) {
        String clave = fecha + " " + hora;
        if (reservas.containsKey(clave)) {
            return false; 
        }
        reservas.put(clave, usuario);
        return true;
    }

    /**
     * Muestra todas las reservas registradas.
     */
    public void mostrarReservas() {
        System.out.println("=== Reservas Registradas ===");
        for (Map.Entry<String, String> entry : reservas.entrySet()) {
            System.out.println("Fecha y Hora: " + entry.getKey() + ", Usuario: " + entry.getValue());
        }
    }

    /**
     * Retorna el nombre completo del autor codificado en Base64.
     * 
     * @return String codificado en Base64
     */
    public String getIdentidad() {
        String nombreCompleto = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes());
    }

    /**
     * Retorna el patrón de diseño utilizado.
     * 
     * @return Descripción del patrón implementado.
     */
    public String getPatron() {
        return "Patrón utilizado: Singleton, ya que la clase CanchaReserva gestiona las reservas en una única instancia.";
    }
}
