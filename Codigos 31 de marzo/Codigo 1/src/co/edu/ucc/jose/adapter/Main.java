
package co.edu.ucc.jose.adapter;

import java.util.Base64;

interface ReporteNuevo {
    void generar(String datos);
}

class SistemaContableAntiguo {
    public void exportar(String contenido) {
        System.out.println("Exportando a sistema contable antiguo: " + contenido);
    }
}

class AdaptadorReporte implements ReporteNuevo {
    private SistemaContableAntiguo sistema;

    public AdaptadorReporte(SistemaContableAntiguo sistema) {
        this.sistema = sistema;
    }

    @Override
    public void generar(String datos) {
        sistema.exportar(datos);
    }
}

public class Main {
    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Patrón Implementado: Adaptador (Adapter Pattern)";
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
        System.out.println("Como analista financiero, necesito que el nuevo sistema de facturación");
        System.out.println("pueda generar reportes compatibles con el sistema contable antiguo de la empresa,");
        System.out.println("sin cambiar la lógica principal del sistema nuevo.");
        System.out.println("=========================================");

        ReporteNuevo reporte = new AdaptadorReporte(new SistemaContableAntiguo());
        reporte.generar("Factura #123 - Total: $50000");

        System.out.println("=========================================");
        System.out.println("Identidad en Base64: " + getIdentidad());
        System.out.println(getPatron());
        System.out.println("=========================================");
    }
}
