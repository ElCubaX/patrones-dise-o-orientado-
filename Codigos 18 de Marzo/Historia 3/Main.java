public class Main {
    public static void main(String[] args) {
        PoolCamillas pool = new PoolCamillas(3);
        
        Camilla c1 = pool.obtenerCamilla();
        Camilla c2 = pool.obtenerCamilla();
        
        if (c1 != null) {
            c1.asignarPaciente("María");
            pool.liberarCamilla(c1);
        }
        
        Camilla c3 = pool.obtenerCamilla();
        if (c3 != null) {
            c3.asignarPaciente("Pedro");
        }
    }
}
