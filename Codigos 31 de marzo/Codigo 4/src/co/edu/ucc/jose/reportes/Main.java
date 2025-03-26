package co.edu.ucc.jose.reportes;

import java.util.Base64;

interface ModoReporte {
    void imprimir(String contenido);
}

class Consola implements ModoReporte {
    public void imprimir(String contenido) {
        System.out.println("Reporte en consola: " + contenido);
    }
}

class ArchivoTexto implements ModoReporte {
    public void imprimir(String contenido) {
        System.out.println("Guardando en archivo: " + contenido);
    }
}

abstract class ReporteVehiculo {
    protected ModoReporte salida;

    public ReporteVehiculo(ModoReporte salida) {
        this.salida = salida;
    }

    public abstract void generar(String estado);
}

class ReporteEstado extends ReporteVehiculo {
    public ReporteEstado(ModoReporte salida) {
        super(salida);
    }

    public void generar(String estado) {
        salida.imprimir("Estado del vehículo: " + estado);
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
        System.out.println("Como supervisor de mantenimiento, quiero que el sistema de monitoreo pueda generar");
        System.out.println("reportes del estado de los vehículos con distintas salidas: en pantalla, archivo de texto");
        System.out.println("o correo electrónico, sin modificar la lógica de captura de datos.");
        System.out.println("=========================================");

        ReporteVehiculo reporte1 = new ReporteEstado(new Consola());
        reporte1.generar("Motor funcionando, llantas en buen estado");

        ReporteVehiculo reporte2 = new ReporteEstado(new ArchivoTexto());
        reporte2.generar("Nivel de aceite bajo, batería en buen estado");

        System.out.println("=========================================");
        System.out.println("Identidad en Base64: " + getIdentidad());
        System.out.println(getPatron());
        System.out.println("=========================================");
    }
}
