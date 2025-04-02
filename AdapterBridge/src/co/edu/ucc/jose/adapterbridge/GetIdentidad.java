package co.edu.ucc.jose.adapterbridge;

import java.util.Base64;

public class GetIdentidad {
    public static void getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        String encodedName = Base64.getEncoder().encodeToString(nombre.getBytes());
        System.out.println("Identidad codificada: " + encodedName);
    }
}
