
package co.edu.ucc.jose.abstractfactory;

public class TarjetaDebito implements Tarjeta {
    @Override
    public String emitir() {
        return "Tarjeta de Débito emitida.";
    }
}