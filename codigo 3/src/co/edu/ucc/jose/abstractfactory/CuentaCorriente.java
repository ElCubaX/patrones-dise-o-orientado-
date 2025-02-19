package co.edu.ucc.jose.abstractfactory;


public class CuentaCorriente implements Cuenta {
    @Override
    public String abrir() {
        return "Cuenta Corriente abierta.";
    }
}