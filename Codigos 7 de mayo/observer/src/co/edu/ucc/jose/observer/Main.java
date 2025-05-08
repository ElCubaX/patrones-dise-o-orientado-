package co.edu.ucc.jose.observer;

import java.util.ArrayList;
import java.util.List;


interface Observador {
    void actualizar(double temperatura);
}

class Sensor {
    private List<Observador> observadores = new ArrayList<>();
    private double temperatura;

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void removerObservador(Observador o) {
        observadores.remove(o);
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(temperatura);
        }
    }
}

class NotificadorEmail implements Observador {
    public void actualizar(double temperatura) {
        if (temperatura > 8.0) {
            System.out.println("Email enviado al gerente: temperatura alta -> " + temperatura + "°C");
        }
    }
}

class RegistroEvento implements Observador {
    public void actualizar(double temperatura) {
        if (temperatura > 8.0) {
            System.out.println("Evento registrado en sistema de alertas -> " + temperatura + "°C");
        }
    }
}

class OrdenTecnica implements Observador {
    public void actualizar(double temperatura) {
        if (temperatura > 8.0) {
            System.out.println("Orden de revisión técnica generada.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------");
        System.out.println("Universidad Cooperativa de Colombia");
        System.out.println("Ingeniería de Sistemas");
        System.out.println("Docente: Harold Bolaños");
        System.out.println("Estudiante: Jose Emilio Martinez Urgelles");
        System.out.println("Año: 2025");
        System.out.println("Patrón implementado: Observer");
        System.out.println("Historia de usuario:");
        System.out.println("En una planta de producción de alimentos, Julia es responsable de monitorear sensores de temperatura ubicados en diferentes zonas de almacenamiento. Cada vez que un sensor supera los 8 °C, deben activarse múltiples acciones:\r\n" + //
                        "•\tNotificar al gerente por correo electrónico.\r\n" + //
                        "•\tRegistrar el evento en el sistema de alertas.\r\n" + //
                        "•\tActivar una orden de verificación técnica.\r\n" + //
                        "Antes, todo esto estaba embebido en una sola clase de Sensor. El código era difícil de mantener y no podía ampliarse fácilmente.\r\n" + //
                        "Julia decidió aplicar el patrón Observer: el Sensor se convierte en el \"sujeto observable\", y cada uno de los módulos anteriores se convierte en un \"observador\" que se suscribe al sensor.\r\n" + //
                        "Con esta solución, ahora puede agregar o quitar observadores sin tocar el código del sensor. Incluso el equipo de TI implementó nuevos observadores para reportes en Power BI y simuladores.\r\n" + //
                        "");
        System.out.println("------------------------------------------------------------\n");

        Sensor sensor = new Sensor();
        sensor.agregarObservador(new NotificadorEmail());
        sensor.agregarObservador(new RegistroEvento());
        sensor.agregarObservador(new OrdenTecnica());

        System.out.println("Simulación con temperatura 6.5°C:");
        sensor.setTemperatura(6.5); 

        System.out.println("\nSimulación con temperatura 8.5°C:");
        sensor.setTemperatura(8.5); 

        getIdentidad();
        getPatron();
    }

    public static void getIdentidad() {
        String identidad = "Jose Emilio Martinez Urgelles";
        String identidadBase64 = java.util.Base64.getEncoder().encodeToString(identidad.getBytes());
        System.out.println("Identidad en Base64: " + identidadBase64);
    }

    public static void getPatron() {
        System.out.println("Patrón implementado: Observer");
    }
}
