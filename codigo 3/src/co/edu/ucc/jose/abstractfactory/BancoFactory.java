package co.edu.ucc.jose.abstractfactory;

import java.util.Base64;

public interface BancoFactory {
    Cuenta crearCuenta();
    Tarjeta crearTarjeta();

    default String getIdentidad() {
        String nombreCompleto = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes());
    }
}