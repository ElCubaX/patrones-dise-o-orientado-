

package co.edu.ucc.jose.memento;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        imprimirEncabezadoYHistoriaDeUsuario();

        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();
        
        editor.escribir("Hola");
        historial.guardar(editor.guardar());

        editor.escribir(" mundo");
        historial.guardar(editor.guardar());

        editor.escribir(" cruel");

        System.out.println("Actual: " + editor.getContenido()); 

        editor.restaurar(historial.deshacer());
        System.out.println("Undo 1: " + editor.getContenido()); 

        editor.restaurar(historial.deshacer());
        System.out.println("Undo 2: " + editor.getContenido()); 

        getIdentidad();
        getPatron();
    }

    public static void imprimirEncabezadoYHistoriaDeUsuario() {
        System.out.println("---------------------------------------------------------");
        System.out.println("Autor: Jose Emilio Martinez Urgelles");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Año: 2025");
        System.out.println("Universidad Cooperativa de Colombia");
        System.out.println("Programa: Ingeniería de Sistemas");
        System.out.println("---------------------------------------------------------");
        
        System.out.println("\nHistoria de Usuario:");
        System.out.println("Daniela trabaja como desarrolladora frontend en una app de edición de notas en línea.");
        System.out.println("Los usuarios pueden escribir texto, y la app guarda automáticamente cada versión del texto");
        System.out.println("cada cierto tiempo o antes de una operación destructiva. En un inicio, Daniela intentó guardar");
        System.out.println("copias completas del objeto en listas manualmente, pero esto era propenso a errores y difícil");
        System.out.println("de mantener. Para resolverlo de forma limpia, aplicó el patrón Memento. Creó una clase EditorTexto");
        System.out.println("que actúa como el Originador, una clase Memento que guarda el estado del texto, y una clase Historial");
        System.out.println("como Caretaker, que maneja una pila de estados. Ahora, el editor puede hacer undo() para regresar al");
        System.out.println("último estado sin violar la encapsulación. La solución es limpia, testable, y fácil de extender para");
        System.out.println("soporte de redo().");
        System.out.println("---------------------------------------------------------");
    }

    public static void getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        String nombreBase64 = java.util.Base64.getEncoder().encodeToString(nombre.getBytes());
        System.out.println("Identidad en Base64: " + nombreBase64);
    }

    public static void getPatron() {
        String patron = "Memento";
        System.out.println("Patrón Implementado: " + patron);
    }
}

class EditorTexto {
    private String contenido = "";
 
    public void escribir(String texto) {
        contenido += texto;
    }
 
    public String getContenido() {
        return contenido;
    }
 
    public Memento guardar() {
        return new Memento(contenido);
    }
 
    public void restaurar(Memento memento) {
        this.contenido = memento.getEstado();
    }
 
    public static class Memento {
        private final String estado;
 
        private Memento(String estado) {
            this.estado = estado;
        }
 
        private String getEstado() {
            return estado;
        }
    }
}

class Historial {
    private Stack<EditorTexto.Memento> pila = new Stack<>();
 
    public void guardar(EditorTexto.Memento m) {
        pila.push(m);
    }
 
    public EditorTexto.Memento deshacer() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return null;
    }
}
