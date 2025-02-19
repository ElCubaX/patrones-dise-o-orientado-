
package co.edu.ucc.jose.singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("  UNIVERSIDAD COOPERATIVA DE COLOMBIA  ");
        System.out.println("  Facultad de Ingeniería de Sistemas  ");
        System.out.println("  Año: 2025  ");
        System.out.println("-------------------------------------------");
        System.out.println("  Estudiante: Jose Emilio Martinez Urgelles  ");
        System.out.println("  Programa: Ingenieria de Sistemas  ");
        System.out.println("===========================================\n");



        Banco banco = Banco.getInstance();
        banco.mostrarNombre();
        
        String identidadCodificada = banco.getIdentidad();
        System.out.println("Identidad codificada en Base64: " + identidadCodificada);
    }
}