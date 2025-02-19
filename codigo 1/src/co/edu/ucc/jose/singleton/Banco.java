
package co.edu.ucc.jose.singleton;

import java.util.Base64;

/**
 * -----------------------------------------
 * PROGRAMA: Banco Singleton
 * AUTOR: Jose Emilio Martinez Urgelles
 * PROGRAMA: Ingeniería de Sistemas
 * UNIVERSIDAD: Universidad Cooperativa de Colombia
 * AÑO: 2025
 * -----------------------------------------
 */

 public class Banco {
    private static Banco instance;
    private String nombreBanco;

    private Banco() {
        nombreBanco = "Banco Central";
    }

    public static Banco getInstance() {
        if (instance == null) {
            instance = new Banco();
        }
        return instance;
    }

    public void mostrarNombre() {
        System.out.println("Bienvenido al " + nombreBanco);
    }

    public String getIdentidad() {
        String nombreCompleto = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes());
    }
}