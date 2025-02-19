package co.edu.ucc.jose.factorymethod;

import java.util.Base64;

 public class Main {
    public static void main(String[] args) {


        System.out.println("===========================================");
        System.out.println("  UNIVERSIDAD COOPERATIVA DE COLOMBIA  ");
        System.out.println("  Facultad de Ingeniería de Sistemas  ");
        System.out.println("  Año: 2025  ");
        System.out.println("  Profesor: [Harold Bolaños]  ");
        System.out.println("-------------------------------------------");
        System.out.println("  Estudiante: Jose Emilio Martinez Urgelles  ");
        System.out.println("  Programa: Ingenieria de Sistemas  ");
        System.out.println("===========================================\n");


        Medicamento analgesico = MedicamentoFactory.crearMedicamento("analgesico");
        Medicamento antibiotico = MedicamentoFactory.crearMedicamento("antibiotico");

        analgesico.administrar();
        antibiotico.administrar();
        
        System.out.println("Identidad codificada: " + getIdentidad());
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
}