package co.edu.ucc.jose.manufactura_acero;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un turno de producción, gestionando múltiples máquinas.
 */
public class Turno {
    private List<Maquina> maquinas = new ArrayList<>();

    /**
     * Agrega una máquina al turno.
     * 
     * @param maquina 
     */
    public void agregarMaquina(Maquina maquina) {
        maquinas.add(maquina);
    }

    /**
     * Muestra la producción de acero de todas las máquinas en el turno.
     */
    public void mostrarProduccion() {
        System.out.println("\n=== Producción de Acero ===");
        for (Maquina maquina : maquinas) {
            System.out.println("Máquina: " + maquina.getNombre() + 
                               ", Acero Producido: " + maquina.getAceroProducido() + " toneladas");
        }
    }
}
