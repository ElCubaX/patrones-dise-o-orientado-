package co.edu.ucc.jose.facturas;

import java.util.Base64;

interface FormatoFactura {
    void generarFactura(String datos);
}

class FormatoPDF implements FormatoFactura {
    public void generarFactura(String datos) {
        System.out.println("Generando factura en PDF: " + datos);
    }
}

class FormatoXML implements FormatoFactura {
    public void generarFactura(String datos) {
        System.out.println("Generando factura en XML: " + datos);
    }
}

abstract class Factura {
    protected FormatoFactura formato;

    public Factura(FormatoFactura formato) {
        this.formato = formato;
    }

    public abstract void emitir(String datos);
}

class FacturaElectronica extends Factura {
    public FacturaElectronica(FormatoFactura formato) {
        super(formato);
    }

    public void emitir(String datos) {
        formato.generarFactura(datos);
    }
}

public class Main {

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Patrón Implementado: Puente (Bridge Pattern)";
    }

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Universidad: Universidad Cooperativa de Colombia");
        System.out.println("Carrera: Ingeniería de Sistemas");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Año: 2025");
        System.out.println("-----------------------------------------");
        System.out.println("Historia de Usuario:");
        System.out.println("Como desarrollador de un sistema de facturación electrónica, necesito que el");
        System.out.println("sistema pueda emitir facturas tanto en formato PDF como en XML, dependiendo del cliente.");
        System.out.println("=========================================");

        Factura factura1 = new FacturaElectronica(new FormatoPDF());
        factura1.emitir("Factura #789 - Total: $1.200.000");

        Factura factura2 = new FacturaElectronica(new FormatoXML());
        factura2.emitir("Factura #790 - Total: $900.000");

        // Imprimir identidad y patrón
        System.out.println("=========================================");
        System.out.println("Identidad en Base64: " + getIdentidad());
        System.out.println(getPatron());
        System.out.println("=========================================");
    }
}
