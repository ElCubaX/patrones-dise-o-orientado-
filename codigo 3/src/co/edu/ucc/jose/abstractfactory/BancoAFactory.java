package co.edu.ucc.jose.abstractfactory;


import co.edu.ucc.jose.abstractfactory.Cuenta;
import co.edu.ucc.jose.abstractfactory.CuentaCorriente;
import co.edu.ucc.jose.abstractfactory.Tarjeta;
import co.edu.ucc.jose.abstractfactory.TarjetaCredito;

public class BancoAFactory implements BancoFactory {
    @Override
    public Cuenta crearCuenta() {
        return new CuentaCorriente();
    }

    @Override
    public Tarjeta crearTarjeta() {
        return new TarjetaCredito();
    }
}