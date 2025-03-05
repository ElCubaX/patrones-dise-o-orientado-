package co.edu.ucc.jose.prototype;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("       PROGRAMA: PATRÓN PROTOTYPE EN JAVA            ");
        System.out.println("=====================================================");
        System.out.println(" Autor      : Jose Emilio Martinez Urgelles");
        System.out.println(" Universidad: Cooperativa de Colombia");
        System.out.println(" Ciudad     : Cali");
        System.out.println(" Profesor   : Harold Bolaños");
        System.out.println("-----------------------------------------------------");
        System.out.println(" Identidad Codificada (Base64): " + getIdentidad());
        System.out.println("=====================================================");

        try {
            Documento docOriginal = new Documento("Documento Oficial - Universidad Cooperativa de Colombia");
            Documento docClonado = docOriginal.clone();

            docOriginal.mostrar();
            docClonado.mostrar();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
}
