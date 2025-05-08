
package co.edu.ucc.jose.template;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Encabezado y Historia de Usuario ====");
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Año: 2025");
        System.out.println("Universidad Cooperativa de Colombia");
        System.out.println("Programa: Ingeniería de Sistemas\n");

        System.out.println("Historia de usuario:");
        System.out.println("Alejandro trabaja en el backend de una plataforma contable SaaS que genera reportes para los usuarios.");
        System.out.println("Los reportes pueden exportarse en PDF o Excel, y aunque comparten varios pasos (recolección de datos, encabezado, pie de página),");
        System.out.println("difieren en la forma en que presentan los datos y el formato.");
        System.out.println("Inicialmente, se implementaron dos clases separadas que compartían mucha lógica duplicada. Alejandro decidió usar el patrón Template Method.");
        System.out.println("Creó una clase abstracta GeneradorReporte con el método generar() que incluye pasos comunes como obtenerDatos(), generarEncabezado(), generarContenido() y generarPie().");
        System.out.println("Los métodos generarContenido() y formatear() se dejaron como abstractos.");
        System.out.println("Las clases ReportePDF y ReporteExcel extienden GeneradorReporte e implementan las diferencias específicas.");
        System.out.println("Ahora, agregar un nuevo formato de exportación solo requiere implementar dos métodos, manteniendo la estructura central intacta.\n");

        GeneradorReporte pdf = new ReportePDF();
        GeneradorReporte excel = new ReporteExcel();

        System.out.println("==== Generando PDF ====");
        pdf.generar();

        System.out.println("\n==== Generando Excel ====");
        excel.generar();

        System.out.println("\n==== Métodos getIdentidad() y getPatron() ====");
        System.out.println("Identidad en Base64: " + getIdentidad());
        System.out.println("Patrón Implementado: " + getPatron());
    }

    public static String getIdentidad() {
        return java.util.Base64.getEncoder().encodeToString("Jose Emilio Martinez Urgelles".getBytes());
    }

    public static String getPatron() {
        return "Template Method";
    }
}

abstract class GeneradorReporte {
    public final void generar() {
        obtenerDatos();
        generarEncabezado();
        generarContenido(); 
        generarPie();
        formatear();
    }

    protected void obtenerDatos() {
        System.out.println("Obteniendo datos de la base...");
    }

    protected void generarEncabezado() {
        System.out.println("Generando encabezado del reporte.");
    }

    protected void generarPie() {
        System.out.println("Agregando pie de página.");
    }

    protected abstract void generarContenido();
    protected abstract void formatear();
}

class ReportePDF extends GeneradorReporte {
    protected void generarContenido() {
        System.out.println("Escribiendo contenido en PDF.");
    }

    protected void formatear() {
        System.out.println("Formateando como documento PDF.");
    }
}

class ReporteExcel extends GeneradorReporte {
    protected void generarContenido() {
        System.out.println("Escribiendo contenido en celdas Excel.");
    }

    protected void formatear() {
        System.out.println("Formateando como hoja Excel.");
    }
}
