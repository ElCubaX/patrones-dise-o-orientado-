package co.edu.ucc.jose.command;

interface Comando {
    void ejecutar();
}

class Luz {
    public void encender() {
        System.out.println("Luz encendida.");
    }
}

class Cortina {
    public void subir() {
        System.out.println("Cortina subida.");
    }
}

class Aire {
    public void activar() {
        System.out.println("Aire acondicionado activado.");
    }
}

class ComandoEncenderLuz implements Comando {
    private Luz luz;

    public ComandoEncenderLuz(Luz luz) {
        this.luz = luz;
    }

    public void ejecutar() {
        luz.encender();
    }
}

class ComandoSubirCortina implements Comando {
    private Cortina cortina;

    public ComandoSubirCortina(Cortina cortina) {
        this.cortina = cortina;
    }

    public void ejecutar() {
        cortina.subir();
    }
}

class ComandoActivarAire implements Comando {
    private Aire aire;

    public ComandoActivarAire(Aire aire) {
        this.aire = aire;
    }

    public void ejecutar() {
        aire.activar();
    }
}

class Boton {
    private Comando comando;

    public Boton(Comando comando) {
        this.comando = comando;
    }

    public void presionar() {
        comando.ejecutar();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("** Historia de Usuario: **");
        System.out.println("Santiago es desarrollador en una startup de domótica que permite controlar luces, cortinas y aire acondicionado desde una app móvil. " +
                "El cliente desea que desde un panel central se puedan configurar botones que envíen órdenes a distintos dispositivos. " +
                "Antes, Santiago implementó lógica en botones como if (tipo.equals(\"LUZ\")) { encenderLuz(); }. Este diseño no era extensible. " +
                "Cada vez que se agregaba un nuevo dispositivo, debía modificar código existente, violando el principio de cerrado para modificación. " +
                "Aplicó el patrón Command: creó una interfaz Comando con el método ejecutar(). Cada acción (encender luz, subir cortina, activar aire) se encapsuló en su propia clase de comando. " +
                "Los botones del panel ahora reciben comandos configurables en tiempo de ejecución. Esto permitió agregar nuevas funciones, crear colas de tareas y hasta implementar funciones de deshacer.");
        System.out.println("\n** Autor: ** José Emilio Martínez Urgelles");
        System.out.println("** Profesor: ** Harold Bolaños");
        System.out.println("** Año: ** 2025");
        System.out.println("** Universidad Cooperativa de Colombia**");
        System.out.println("** Programa: ** Ingeniería de Sistemas\n");

        // Comandos y botones
        Luz luz = new Luz();
        Cortina cortina = new Cortina();
        Aire aire = new Aire();

        Comando cmdLuz = new ComandoEncenderLuz(luz);
        Comando cmdCortina = new ComandoSubirCortina(cortina);
        Comando cmdAire = new ComandoActivarAire(aire);

        Boton boton1 = new Boton(cmdLuz);
        Boton boton2 = new Boton(cmdCortina);
        Boton boton3 = new Boton(cmdAire);

        boton1.presionar(); 
        boton2.presionar(); 
        boton3.presionar(); 

        getIdentidad();
        getPatron();
    }

    public static void getIdentidad() {
        String nombre = "Jose Emilio Martínez Urgelles";
        String base64Nombre = java.util.Base64.getEncoder().encodeToString(nombre.getBytes());
        System.out.println("\nIdentidad en Base64: " + base64Nombre);
    }

    public static void getPatron() {
        System.out.println("Patrón Implementado: Command");
    }
}
