package co.edu.ucc.jose.state;


interface EstadoCajero {
    void insertarTarjeta();
    void ingresarPin(int pin);
    void retirarDinero(double monto);
}

class SinTarjeta implements EstadoCajero {
    private Cajero cajero;

    public SinTarjeta(Cajero cajero) {
        this.cajero = cajero;
    }

    public void insertarTarjeta() {
        System.out.println("Tarjeta insertada.");
        cajero.setEstado(new ConTarjeta(cajero));
    }

    public void ingresarPin(int pin) {
        System.out.println("Primero inserte una tarjeta.");
    }

    public void retirarDinero(double monto) {
        System.out.println("Primero inserte una tarjeta.");
    }
}

class ConTarjeta implements EstadoCajero {
    private Cajero cajero;

    public ConTarjeta(Cajero cajero) {
        this.cajero = cajero;
    }

    public void insertarTarjeta() {
        System.out.println("Ya hay una tarjeta insertada.");
    }

    public void ingresarPin(int pin) {
        if (pin == 1234) {
            System.out.println("PIN correcto.");
            cajero.setEstado(new Autenticado(cajero));
        } else {
            System.out.println("PIN incorrecto.");
        }
    }

    public void retirarDinero(double monto) {
        System.out.println("Debe ingresar su PIN primero.");
    }
}

class Autenticado implements EstadoCajero {
    private Cajero cajero;

    public Autenticado(Cajero cajero) {
        this.cajero = cajero;
    }

    public void insertarTarjeta() {
        System.out.println("Ya autenticado. No necesita reiniciar.");
    }

    public void ingresarPin(int pin) {
        System.out.println("Ya autenticado.");
    }

    public void retirarDinero(double monto) {
        System.out.println("Retirando $" + monto);
        cajero.setEstado(new SinTarjeta(cajero));
    }
}

class Cajero {
    private EstadoCajero estado;

    public Cajero() {
        this.estado = new SinTarjeta(this);
    }

    public void setEstado(EstadoCajero estado) {
        this.estado = estado;
    }

    public void insertarTarjeta() {
        estado.insertarTarjeta();
    }

    public void ingresarPin(int pin) {
        estado.ingresarPin(pin);
    }

    public void retirarDinero(double monto) {
        estado.retirarDinero(monto);
    }
}

public class Main {
    public static void main(String[] args) {
        String identidad = getIdentidad();
        String patron = getPatron();
        System.out.println("Nombre: " + identidad);
        System.out.println("Patrón implementado: " + patron);
        System.out.println("Año: 2025");
        System.out.println("Universidad Cooperativa de Colombia");
        System.out.println("Programa: Ingeniería de Sistemas\n");

        System.out.println("Historia de Usuario:");
        System.out.println("Andrés trabaja en el equipo de desarrollo de una fintech que quiere simular un cajero automático en software.");
        System.out.println("Este cajero debe tener comportamientos distintos dependiendo del estado actual:");
        System.out.println("• Cuando sin tarjeta, debe pedir que se inserte una.");
        System.out.println("• Cuando con tarjeta, debe solicitar PIN.");
        System.out.println("• Cuando autenticado, debe permitir operaciones.");
        System.out.println("La implementación inicial se basaba en muchos condicionales, lo que dificultaba las pruebas unitarias y el mantenimiento.");
        System.out.println("Andrés decide usar el patrón State.");
        System.out.println("Define una interfaz EstadoCajero y crea clases como SinTarjeta, ConTarjeta y Autenticado, cada una encapsulando la lógica específica.");
        System.out.println("El objeto Cajero mantiene una referencia al estado actual y delega en él el comportamiento.");
        System.out.println("El sistema se volvió más legible, cada estado es fácilmente extensible, y ahora se pueden agregar nuevos estados (por ejemplo, Bloqueado) sin alterar el código existente.\n");

        Cajero cajero = new Cajero();

        cajero.insertarTarjeta();
        cajero.ingresarPin(1111);
        cajero.ingresarPin(1234);
        cajero.retirarDinero(200);
    }

    public static String getIdentidad() {
        return java.util.Base64.getEncoder().encodeToString("Jose Emilio Martinez Urgelles".getBytes());
    }

    public static String getPatron() {
        return "State";
    }
}
