import java.util.Queue;
import java.util.LinkedList;

public class PoolCamillas {
    private Queue<Camilla> pool;
    private int limite;

    public PoolCamillas(int limite) {
        this.limite = limite;
        this.pool = new LinkedList<>();
        for (int i = 0; i < limite; i++) {
            pool.add(new Camilla("Camilla-" + (i + 1)));
        }
    }

    public Camilla obtenerCamilla() {
        if (!pool.isEmpty()) {
            return pool.poll();
        } else {
            System.out.println("No hay camillas disponibles, espere...");
            return null;
        }
    }

    public void liberarCamilla(Camilla camilla) {
        pool.offer(camilla);
    }
}
