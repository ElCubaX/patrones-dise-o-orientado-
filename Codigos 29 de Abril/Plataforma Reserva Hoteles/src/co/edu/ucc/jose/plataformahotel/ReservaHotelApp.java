package co.edu.ucc.jose.plataformahotel;

import java.util.Base64;

interface ISistemaReservas {
    void verificarDisponibilidad();
}

interface ISistemaPagos {
    void procesarPago();
}

interface ISistemaFacturacion {
    void generarFactura();
}

class SistemaReservas implements ISistemaReservas {
    public void verificarDisponibilidad() {
        System.out.println("Hotel disponible.");
    }
}

class SistemaPagos implements ISistemaPagos {
    public void procesarPago() {
        System.out.println("Pago procesado.");
    }
}

class SistemaFacturacion implements ISistemaFacturacion {
    public void generarFactura() {
        System.out.println("Factura generada.");
    }
}

class FacadeReservaHotel {
    private ISistemaReservas reservas;
    private ISistemaPagos pagos;
    private ISistemaFacturacion facturacion;

    public FacadeReservaHotel() {
        this.reservas = new SistemaReservas();
        this.pagos = new SistemaPagos();
        this.facturacion = new SistemaFacturacion();
    }

    public void reservar() {
        System.out.println("==============================================");
        System.out.println("Sistema de Reservas de Hotel Plataforma");
        System.out.println(" Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Universidad Cooperativa de Colombia");
        System.out.println("Año: 2025");
        System.out.println("==============================================");
        System.out.println("\n Historia de Usuario:");
        System.out.println("Como usuario, quiero reservar un hotel en línea");
        System.out.println("sin tener que interactuar con reservas, pagos");
        System.out.println("y facturación manualmente. Codigo Creado por José\n");

        reservas.verificarDisponibilidad();
        pagos.procesarPago();
        facturacion.generarFactura();

        System.out.println("Reserva completada con éxito.");

        System.out.println("Identidad codificada (Base64): " + getIdentidad());
        System.out.println(" Patrón implementado: " + getPatron());
    }
    public String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
    public String getPatron() {
        return "Patrón Fachada";
    }
}
public class ReservaHotelApp {
    public static void main(String[] args) {
        FacadeReservaHotel fachada = new FacadeReservaHotel();
        fachada.reservar();
    }
}
