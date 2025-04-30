package co.edu.ucc.seguroreportes;

import java.util.Base64;

interface IReporte {
    void mostrar();
}

class ReporteReal implements IReporte {
    public void mostrar() {
        System.out.println("Mostrando reporte confidencial.");
    }
}

class ProxyReporte implements IReporte {
    private ReporteReal reporteReal;
    private String rolUsuario;

    public ProxyReporte(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public void mostrar() {
        if ("gerente".equalsIgnoreCase(rolUsuario)) {
            if (reporteReal == null) {
                reporteReal = new ReporteReal();
            }
            reporteReal.mostrar();
        } else {
            System.out.println("Acceso denegado para el rol: " + rolUsuario);
        }
    }
}

public class AccesoSeguroReportesApp {

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("Sistema de Acceso Seguro a Reportes");
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Universidad Cooperativa de Colombia");
        System.out.println("Año: 2025");
        System.out.println("==============================================");
        System.out.println("\nHistoria de Usuario:");
        System.out.println("Como gerente, quiero acceder a reportes confidenciales");
        System.out.println("sin que otros roles tengan acceso a esta información.Codigo creado por el Jose");

        System.out.println("--------------------------------");

        IReporte reporte1 = new ProxyReporte("gerente");
        reporte1.mostrar();

        IReporte reporte2 = new ProxyReporte("empleado");
        reporte2.mostrar();

        System.out.println(" Identidad codificada (Base64): " + getIdentidad());
        System.out.println(" Patrón implementado: " + getPatron());
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Patrón Proxy";
    }
}
