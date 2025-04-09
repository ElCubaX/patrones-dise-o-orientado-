

package co.edu.ucc.jose.gestionarchivos;


import java.util.ArrayList;
import java.util.List;

interface ArchivoComponent {
    void mostrar();
}

class Archivo implements ArchivoComponent {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Archivo: " + nombre);
    }
}

class Carpeta implements ArchivoComponent {
    private String nombre;
    private List<ArchivoComponent> elementos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ArchivoComponent componente) {
        elementos.add(componente);
    }

    public void mostrar() {
        System.out.println("Carpeta: " + nombre);
        for (ArchivoComponent c : elementos) {
            c.mostrar();
        }
    }
}
