import java.util.LinkedList;
import java.util.Queue;

class VehiculoTuristico {
    private String id;

    public VehiculoTuristico(String id) {
        this.id = id;
        System.out.println("Nuevo vehículo disponible: " + id);
    }

    public String getId() {
        return id;
    }

    public void asignarRecorrido(String recorrido) {
        System.out.println("✅ Vehículo " + id + " asignado a: " + recorrido);
    }
}

class PoolVehiculos {
    private Queue<VehiculoTuristico> pool;
    private int limite;

    public PoolVehiculos(int limite) {
        this.limite = limite;
        this.pool = new LinkedList<>();
        for (int i = 0; i < limite; i++) {
            pool.add(new VehiculoTuristico("Vehiculo-" + (i + 1)));
        }
    }

    public VehiculoTuristico obtenerVehiculo() {
        if (!pool.isEmpty()) {
            VehiculoTuristico vehiculo = pool.poll();
            System.out.println("🚗 Vehículo asignado: " + vehiculo.getId());
            return vehiculo;
        } else {
            System.out.println("❌ No hay vehículos disponibles, espere...");
            return null;
        }
    }

    public void liberarVehiculo(VehiculoTuristico vehiculo) {
        if (vehiculo != null) {
            pool.offer(vehiculo);
            System.out.println("🔄 Vehículo " + vehiculo.getId() + " devuelto al sistema.");
        }
    }
}

public class Main {
    public static void main(String[] args) {


        System.out.println("=======================================");
        System.out.println(" Autor: Jose Emilio Martinez Urgelles ");
        System.out.println(" Universidad: Cooperativa de Colombia ");
        System.out.println(" Carrera: Ingeniería de Sistemas ");
        System.out.println(" Año: 2025 ");
        System.out.println("=======================================\n");



        PoolVehiculos pool = new PoolVehiculos(2);

        VehiculoTuristico v1 = pool.obtenerVehiculo();
        VehiculoTuristico v2 = pool.obtenerVehiculo();
        VehiculoTuristico v3 = pool.obtenerVehiculo(); // No hay vehículos disponibles

        if (v1 != null) v1.asignarRecorrido("Tour por la ciudad");
        pool.liberarVehiculo(v1);

        VehiculoTuristico v4 = pool.obtenerVehiculo(); // Ahora hay uno disponible
        if (v4 != null) v4.asignarRecorrido("Visita a las montañas");
    }
}
