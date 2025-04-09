package co.edu.ucc.jose.notificacionesusuario;

import java.util.Base64;

public class Main {

    public static void main(String[] args) {
        mostrarEncabezado();

        Notificacion notificacion = new NotificacionBasica();
        notificacion = new NotificacionEmail(notificacion);
        notificacion = new NotificacionSMS(notificacion);
        notificacion = new NotificacionPush(notificacion);

        notificacion.enviar("Actualización del sistema disponible");

        System.out.println("\nIdentidad (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    public static void mostrarEncabezado() {
        System.out.println("********************************************************");
        System.out.println("Detalles del Programa:");
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Año: 2025");
        System.out.println("Universidad: Universidad Cooperativa de Colombia");
        System.out.println("Programa: Ingeniería de Sistemas");
        System.out.println("Historia de Usuario:");
        System.out.println("Como responsable de comunicación, quiero que las notificaciones");
        System.out.println("puedan enviarse por email, SMS y notificaciones push sin modificar el código base.");
        System.out.println("********************************************************\n");
    }

    public static String getIdentidad() {
        return Base64.getEncoder().encodeToString("Jose Emilio Martinez Urgelles".getBytes());
    }

    public static String getPatron() {
        return "Decorator";
    }
}
