public class Main {
    public static void main(String[] args) {


        System.out.println("=======================================");
        System.out.println(" Autor: Jose Emilio Martinez Urgelles ");
        System.out.println(" Universidad: Cooperativa de Colombia ");
        System.out.println(" Carrera: Ingeniería de Sistemas ");
        System.out.println(" Año: 2025 ");
        System.out.println("=======================================\n");


        
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
