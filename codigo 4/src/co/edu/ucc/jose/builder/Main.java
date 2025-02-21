// Archivo: Main.java
package co.edu.ucc.jose.builder;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Juan Pérez", 30, "Gripe");

        System.out.println("Datos del Paciente:");
        System.out.println("Nombre: " + paciente1.getNombre());
        System.out.println("Edad: " + paciente1.getEdad());
        System.out.println("Diagnóstico: " + paciente1.getDiagnostico());

        paciente1.setNombre("María López");
        paciente1.setEdad(40);
        paciente1.setDiagnostico("Faringitis");
        
        System.out.println("\nDatos del Paciente Actualizados:");
        System.out.println(paciente1);
    }
}
