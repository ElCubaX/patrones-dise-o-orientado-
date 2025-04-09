package co.edu.ucc.jose.menuaplicacionweb;

public class Opcion implements ElementoMenu {
    private String nombre;

    public Opcion(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Opción: " + nombre);
    }
}
