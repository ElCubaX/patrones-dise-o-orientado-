public class Main {
    public static void main(String[] args) {


        System.out.println("=======================================");
        System.out.println(" Autor: Jose Emilio Martinez Urgelles ");
        System.out.println(" Universidad: Cooperativa de Colombia ");
        System.out.println(" Carrera: Ingeniería de Sistemas ");
        System.out.println(" Año: 2025 ");
        System.out.println("=======================================\n");


        PoolEquiposVR pool = new PoolEquiposVR(3);
        
        EquipoVR e1 = pool.obtenerEquipo();
        EquipoVR e2 = pool.obtenerEquipo();
        
        if (e1 != null) {
            e1.asignarUsuario("Carlos");
            pool.liberarEquipo(e1);
        }
        
        EquipoVR e3 = pool.obtenerEquipo();
        if (e3 != null) {
            e3.asignarUsuario("Ana");
        }
    }
}
