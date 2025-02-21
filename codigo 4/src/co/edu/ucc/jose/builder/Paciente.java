// ======================================================
// Nombre del archivo: Paciente.java
// Paquete: co.edu.ucc.jose.builder
// Autor: Jose Emilio Martinez Urgelles
// Descripción: Clase que representa a un paciente con datos personales y diagnóstico.
// Fecha: 2025-02-19
// ======================================================

package co.edu.ucc.jose.builder;

import java.util.Base64;

public class Paciente {
    private String nombre;
    private int edad;
    private String diagnostico;

    public Paciente(String nombre, int edad, String diagnostico) {
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getIdentidad() {
        String nombreCompleto = "Jose Emilio Martinez Urgelles"; 
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes());
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", diagnostico='" + diagnostico + '\'' +
                '}';
    }
}
