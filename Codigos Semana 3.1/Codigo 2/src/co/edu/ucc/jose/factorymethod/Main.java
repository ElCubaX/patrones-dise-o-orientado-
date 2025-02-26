package co.edu.ucc.jose.factorymethod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        encabezadoPgm(); 

        Vehiculo v1 = FabricaVehiculos.crearVehiculo("electrico");
        if (v1 != null) v1.conducir();

        String identidadCodificada = getIdentidad();
        System.out.println("Identidad codificada (Base64): " + identidadCodificada);
    }

    public static void encabezadoPgm() {
        String nombre = "Jose Emilio Martinez Urgelles";
        String campus = "Universidad Cooperativa de Colombia, Campus Cali";
        String repositorioGit = "https://github.com/habolanos/ucc-estructuras/blob/master/sesion04/ejercicios/1-algoritmo-01/PgmAlgoritmo01.java";

        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHora = ahora.format(formateador);

        System.out.println("--------------------------------------------------");
        System.out.println("|  Nombre       : " + nombre);
        System.out.println("|  Campus       : " + campus);
        System.out.println("|  Fecha y hora : " + fechaHora);
        System.out.println("|  Repositorio Git : " + repositorioGit);
        System.out.println("--------------------------------------------------");
        System.out.println();
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
}
