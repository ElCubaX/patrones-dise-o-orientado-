public class Main {
    public static void main(String[] args) {
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
