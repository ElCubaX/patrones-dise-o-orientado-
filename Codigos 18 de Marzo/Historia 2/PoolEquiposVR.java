import java.util.LinkedList;
import java.util.Queue;

public class PoolEquiposVR {
    private Queue<EquipoVR> pool;
    private int limite;

    public PoolEquiposVR(int limite) {
        this.limite = limite;
        this.pool = new LinkedList<>();
        for (int i = 0; i < limite; i++) {
            pool.add(new EquipoVR("VR-" + (i + 1)));
        }
    }

    public EquipoVR obtenerEquipo() {
        if (!pool.isEmpty()) {
            return pool.poll();
        } else {
            System.out.println("No hay equipos VR disponibles, espere...");
            return null;
        }
    }

    public void liberarEquipo(EquipoVR equipo) {
        pool.offer(equipo);
    }
}
