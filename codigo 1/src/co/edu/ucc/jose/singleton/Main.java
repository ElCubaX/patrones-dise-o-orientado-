
package co.edu.ucc.jose.singleton;

public class Main {
    public static void main(String[] args) {
        Banco banco = Banco.getInstance();
        banco.mostrarNombre();

        // Llamar a getIdentidad() al final del programa
        String identidadCodificada = banco.getIdentidad();
        System.out.println("Identidad codificada en Base64: " + identidadCodificada);
    }
}