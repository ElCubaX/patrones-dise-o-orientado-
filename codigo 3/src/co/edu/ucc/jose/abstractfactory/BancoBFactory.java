package co.edu.ucc.jose.abstractfactory;

public class BancoBFactory implements BancoFactory {
    @Override
    public Cuenta crearCuenta() {
        return new CuentaAhorros();
    }

    @Override
    public Tarjeta crearTarjeta() {
        return new TarjetaDebito();
    }
}