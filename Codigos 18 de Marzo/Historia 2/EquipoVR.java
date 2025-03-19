public class EquipoVR {
    private String id;
    
    public EquipoVR(String id) {
        this.id = id;
        System.out.println("Nuevo equipo VR disponible: " + id);
    }
    
    public void asignarUsuario(String usuario) {
        System.out.println("Equipo VR " + id + " asignado a " + usuario);
    }
}
