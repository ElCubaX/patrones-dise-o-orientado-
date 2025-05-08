
package co.edu.ucc.jose.mediator;

import java.util.ArrayList;
import java.util.List;

interface TorreControl {
    void enviarMensaje(String mensaje, Participante emisor);
    void registrarParticipante(Participante p);
}

abstract class Participante {
    protected TorreControl torre;
    protected String nombre;

    public Participante(String nombre, TorreControl torre) {
        this.nombre = nombre;
        this.torre = torre;
        torre.registrarParticipante(this);
    }

    public abstract void recibir(String mensaje);
    public void enviar(String mensaje) {
        torre.enviarMensaje(mensaje, this);
    }

    public String getNombre() {
        return nombre;
    }
}

class Avion extends Participante {
    public Avion(String nombre, TorreControl torre) {
        super(nombre, torre);
    }

    public void recibir(String mensaje) {
        System.out.println("Avión " + nombre + " recibe: " + mensaje);
    }
}

class Controlador extends Participante {
    public Controlador(String nombre, TorreControl torre) {
        super(nombre, torre);
    }

    public void recibir(String mensaje) {
        System.out.println("Controlador " + nombre + " recibe: " + mensaje);
    }
}

class Pista extends Participante {
    public Pista(String nombre, TorreControl torre) {
        super(nombre, torre);
    }

    public void recibir(String mensaje) {
        System.out.println("Pista " + nombre + " recibe: " + mensaje);
    }
}

class TorreDeControl implements TorreControl {
    private List<Participante> participantes = new ArrayList<>();

    public void registrarParticipante(Participante p) {
        participantes.add(p);
    }

    public void enviarMensaje(String mensaje, Participante emisor) {
        for (Participante p : participantes) {
            if (p != emisor) {
                p.recibir(mensaje + " (de " + emisor.getNombre() + ")");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Año: 2025");
        System.out.println("Universidad Cooperativa de Colombia");
        System.out.println("Programa: Ingeniería de Sistemas\n");

        System.out.println("Historia de Usuario:");
        System.out.println("Clara es ingeniera de software en un sistema de gestión aérea. Está diseñando un módulo donde aviones, controladores de vuelo y personal de pista deben intercambiar mensajes para coordinar aterrizajes.");
        System.out.println("Inicialmente, cada clase conocía las otras y se comunicaba directamente, creando una red compleja y propensa a errores. Cualquier cambio en una clase obligaba a modificar muchas otras.");
        System.out.println("Clara decide implementar el patrón Mediator. Define una interfaz TorreControl, que centraliza toda la coordinación. Los objetos Avion, Controlador y Pista solo se comunican a través del mediador.");
        System.out.println("Esto permite que nuevos componentes puedan integrarse (como un sistema automático de alertas meteorológicas) sin alterar las clases existentes. Además, el código es más fácil de probar y mantener.\n");

        TorreControl torre = new TorreDeControl();

        Participante avion1 = new Avion("LATAM 123", torre);
        Participante controlador = new Controlador("ATC Norte", torre);
        Participante pista = new Pista("Pista A", torre);

        avion1.enviar("Solicito autorización para aterrizar");
        controlador.enviar("Autorizado a aterrizar");

        System.out.println(getIdentidad());
        System.out.println(getPatron());
    }
    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return java.util.Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Patrón Mediator";
    }
}
