package co.edu.ucc.jose.abstractfactory;

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