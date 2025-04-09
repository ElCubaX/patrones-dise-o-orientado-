package co.edu.ucc.jose.notificacionesusuario;

interface Notificacion {
    void enviar(String mensaje);
}

class NotificacionBasica implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Notificación básica: " + mensaje);
    }
}

abstract class NotificacionDecorator implements Notificacion {
    protected Notificacion wrappee;

    public NotificacionDecorator(Notificacion n) {
        this.wrappee = n;
    }

    public void enviar(String mensaje) {
        wrappee.enviar(mensaje);
    }
}

class NotificacionEmail extends NotificacionDecorator {
    public NotificacionEmail(Notificacion n) {
        super(n);
    }

    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando email: " + mensaje);
    }
}

class NotificacionSMS extends NotificacionDecorator {
    public NotificacionSMS(Notificacion n) {
        super(n);
    }

    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando SMS: " + mensaje);
    }
}

class NotificacionPush extends NotificacionDecorator {
    public NotificacionPush(Notificacion n) {
        super(n);
    }

    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando notificación push: " + mensaje);
    }
}
