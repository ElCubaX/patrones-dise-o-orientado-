package co.edu.ucc.jose.abstractfactory;

import co.edu.ucc.jose.abstractfactory.Cuenta;
import co.edu.ucc.jose.abstractfactory.Tarjeta;

import java.util.Base64;

public interface BancoFactory {
    Cuenta crearCuenta();
    Tarjeta crearTarjeta();

    default String getIdentidad() {
        String nombreCompleto = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes());
    }
}