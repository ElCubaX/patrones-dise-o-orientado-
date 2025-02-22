package co.edu.ucc.jose.reservacancha;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class CanchaReserva {
    private Map<String, String> reservas = new HashMap<>();

    public boolean reservarCancha(String fecha, String hora, String usuario) {
        String clave = fecha + " " + hora;
        if (reservas.containsKey(clave)) {
            return false; 
        }
        reservas.put(clave, usuario);
        return true;
    }

    public void mostrarReservas() {
        for (Map.Entry<String, String> entry : reservas.entrySet()) {
            System.out.println("Fecha y Hora: " + entry.getKey() + ", Usuario: " + entry.getValue());
        }
    }

    public String getIdentidad() {
        String nombreCompleto = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes());
    }

    public String getPatron() {
        return "Patrón utilizado: Singleton, ya que la clase CanchaReserva gestiona las reservas en una única instancia.";
    }
}
