package co.edu.ucc.jose.svehiculo;

import java.util.Base64;

/*
--------------------------------------------------
|  Nombre       : Jose Emilio Martinez Urgelles
|  Campus       : Universidad Cooperativa de Colombia, Campus Cali
|  Fecha y hora : 25/02/2025 19:45:12
|  Repositorio Git : https://github.com/ElCubaX/patrones-dise-o-orientado-/tree/main/Codigos%20Refactorizar/Codigo%201/src/co/edu/ucc/jose/svehiculo
--------------------------------------------------
*/

public abstract class Vehiculo {
    public abstract void arrancar();

    public static Vehiculo crearVehiculo(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "electrico" -> new CarroElectrico();
            case "gasolina" -> new CarroGasolina();
            default -> null;
        };
    }

    public static String getPatron() {
        return "Factory Method";
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
}

class CarroElectrico extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Conduciendo un carro eléctrico");
    }
}

class CarroGasolina extends Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Conduciendo un carro a gasolina");
    }
}
