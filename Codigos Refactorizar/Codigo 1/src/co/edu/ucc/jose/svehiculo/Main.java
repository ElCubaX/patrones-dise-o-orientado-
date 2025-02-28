
package co.edu.ucc.jose.svehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = VehiculoFactory.crearVehiculo("electrico");
        Vehiculo v2 = VehiculoFactory.crearVehiculo("gasolina");

        if (v1 != null) v1.conducir();
        if (v2 != null) v2.conducir();
    }
}
