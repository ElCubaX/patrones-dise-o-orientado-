// ======================================================
// Nombre del archivo: Main.java
// Paquete: co.edu.ucc.jose.builder
// Autor: Jose Emilio Martinez Urgelles
// Descripción: Clase principal para probar la creación de un Paciente.
// Fecha: 2025-02-19
// ======================================================

package co.edu.ucc.jose.builder;

public class Main {
    public static void main(String[] args) {


        System.out.println("======================================================");
        System.out.println(" Nombre del archivo: Main.java");
        System.out.println(" Paquete: co.edu.ucc.jose.builder");
        System.out.println(" Autor: Jose Emilio Martinez Urgelles");
        System.out.println(" Descripción: Prueba del Patron con Pacientes.");
        System.out.println(" Fecha: 2025-02-19");
        System.out.println("======================================================\n");



        Paciente paciente = new Paciente("Juan Pérez", 30, "Gripe");

        System.out.println("Datos del Paciente:");
        System.out.println("Nombre: " + paciente.getNombre());
        System.out.println("Edad: " + paciente.getEdad());
        System.out.println("Diagnóstico: " + paciente.getDiagnostico());

        paciente.setNombre("María López");
        paciente.setEdad(40);
        paciente.setDiagnostico("Faringitis");

        System.out.println("\nDatos del Paciente Actualizados:");
        System.out.println(paciente);
        System.out.println("Identidad codificada en Base64: " + paciente.getIdentidad());
    }
}
