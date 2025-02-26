
package co.edu.ucc.jose.factorymethod;

public class FabricaVehiculos {
    public static Vehiculo crearVehiculo(String tipo) {
        if (tipo.equalsIgnoreCase("electrico")) return new CarroElectrico();
        else if (tipo.equalsIgnoreCase("gasolina")) return new CarroGasolina();
        return null;
    }
}
