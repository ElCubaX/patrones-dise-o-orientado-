
package co.edu.ucc.jose.abstractfactory;


public class TarjetaCredito implements Tarjeta {
    @Override
    public String emitir() {
        return "Tarjeta de Crédito emitida.";
    }
}