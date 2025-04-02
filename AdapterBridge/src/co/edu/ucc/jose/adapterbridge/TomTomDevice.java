package co.edu.ucc.jose.adapterbridge;

public class TomTomDevice implements GPSDevice {
    
    
    
    @Override
    public String getLocation() {
        return "Ubicación TomTom: Latitud: 4.60971, Longitud: -74.08175";
    }



    @Override
    public String getStatus() {
        return "Estado TomTom: Detenido";
    }
}
