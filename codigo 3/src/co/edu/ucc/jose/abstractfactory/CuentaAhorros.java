package co.edu.ucc.jose.abstractfactory;


public class CuentaAhorros implements Cuenta {
    @Override
    public String abrir() {
        return "Cuenta de Ahorros abierta.";
    }
}