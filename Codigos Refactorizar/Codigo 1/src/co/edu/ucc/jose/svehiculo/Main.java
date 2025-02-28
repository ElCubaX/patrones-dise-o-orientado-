package co.edu.ucc.jose.svehiculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------");
        System.out.println("|  Nombre       : Jose Emilio Martinez Urgelles");
        System.out.println("|  Campus       : Universidad Cooperativa de Colombia, Campus Cali");
        System.out.println("|  Fecha y hora : 25/02/2025 19:45:12");
        System.out.println("|  Repositorio Git : https://github.com/habolanos/ucc-estructuras/blob/master/sesion04/ejercicios/1-algoritmo-01/PgmAlgoritmo01.java");
        System.out.println("--------------------------------------------------\n");

        Vehiculo v1 = Vehiculo.crearVehiculo("electrico");
        Vehiculo v2 = Vehiculo.crearVehiculo("gasolina");

        if (v1 != null) v1.arrancar();
        if (v2 != null) v2.arrancar();

        System.out.println("\nIdentidad del sistema (Base64): " + Vehiculo.getIdentidad());
        System.out.println("Patrón implementado: " + Vehiculo.getPatron());
    }
}
