package co.edu.ucc.jose.transporte;

import java.util.Base64;

interface LocalizadorWeb {
    void mostrarUbicacion(String coordenadas);
}

class GPSCamion {
    public String obtenerUbicacion() {
        return "Lat: 4.60971, Lon: -74.08175";
    }
}

class AdaptadorGPS implements LocalizadorWeb {
    private GPSCamion gps;

    public AdaptadorGPS(GPSCamion gps) {
        this.gps = gps;
    }

    @Override
    public void mostrarUbicacion(String coordenadas) {
        String ubicacion = gps.obtenerUbicacion();
        System.out.println("Ubicación del camión: " + ubicacion);
    }
}

public class Main {

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Patrón Implementado: Adaptador (Adapter Pattern)";
    }

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Universidad: Universidad Cooperativa de Colombia");
        System.out.println("Carrera: Ingeniería de Sistemas");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Año: 2025");
        System.out.println("-----------------------------------------");
        System.out.println("Historia de Usuario:");
        System.out.println("Como administrador de flotas, necesito integrar el sistema GPS de los camiones,");
        System.out.println("que usa un protocolo diferente, con la plataforma web de monitoreo de rutas en tiempo real.");
        System.out.println("=========================================");

        LocalizadorWeb localizador = new AdaptadorGPS(new GPSCamion());
        localizador.mostrarUbicacion("");

        System.out.println("=========================================");
        System.out.println("Identidad en Base64: " + getIdentidad());
        System.out.println(getPatron());
        System.out.println("=========================================");
    }
}
