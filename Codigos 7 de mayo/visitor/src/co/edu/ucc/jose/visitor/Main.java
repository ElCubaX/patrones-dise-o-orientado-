
package co.edu.ucc.jose.visitor;

import java.util.ArrayList;
import java.util.List;

interface ActivoVisitor {
    void visitar(Inmueble i);
    void visitar(Vehiculo v);
}

interface Activo {
    void aceptar(ActivoVisitor visitor);
}

class Inmueble implements Activo {
    public void aceptar(ActivoVisitor visitor) {
        visitor.visitar(this);
    }

    public double calcularValorFiscal() {
        return 100000;
    }
}

class Vehiculo implements Activo {
    public void aceptar(ActivoVisitor visitor) {
        visitor.visitar(this);
    }

    public double calcularValorFiscal() {
        return 35000;
    }
}

class ReporteFiscalVisitor implements ActivoVisitor {
    public void visitar(Inmueble i) {
        System.out.println("Inmueble - Valor fiscal: $" + i.calcularValorFiscal());
    }

    public void visitar(Vehiculo v) {
        System.out.println("Vehículo - Valor fiscal: $" + v.calcularValorFiscal());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Año: 2025");
        System.out.println("Universidad Cooperativa de Colombia");
        System.out.println("Programa: Ingeniería de Sistemas");
        System.out.println("=====================================");
        
        System.out.println("Historia de Usuario:");
        System.out.println("Francisco trabaja en un sistema contable que maneja diferentes tipos de activos: Inmuebles, Vehículos, Equipos. El sistema debe generar reportes fiscales y financieros sobre estos activos.");
        System.out.println("Cada tipo de activo tiene reglas distintas para el cálculo de depreciación, valor residual, e impacto contable. Además, los reportes pueden cambiar con la normativa legal.");
        System.out.println("En lugar de modificar las clases Activo, Inmueble, Vehículo, cada vez que se agrega una operación nueva, Francisco implementa el patrón Visitor. Define una interfaz ActivoVisitor con métodos visitar(Inmueble), visitar(Vehiculo), etc.");
        System.out.println("Las operaciones como ReporteFiscalVisitor, ReporteFinancieroVisitor implementan esa interfaz y aplican lógica según el tipo de activo. Esto permitió agregar nuevas operaciones sin modificar las clases base, y separar completamente la lógica contable de la lógica de presentación.");
        System.out.println("=====================================");
        
        List<Activo> activos = new ArrayList<>();
        activos.add(new Inmueble());
        activos.add(new Vehiculo());

        ActivoVisitor reporte = new ReporteFiscalVisitor();

        for (Activo a : activos) {
            a.aceptar(reporte);
        }

        getIdentidad();
        getPatron();
    }

    public static void getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        System.out.println("Identidad en Base64: " + new String(java.util.Base64.getEncoder().encode(nombre.getBytes())));
    }

    public static void getPatron() {
        System.out.println("Patrón implementado: Visitor");
    }
}
