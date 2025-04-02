package co.edu.ucc.jose.adapterbridge;

public class GarminDevice implements GPSDevice {
    
    
    
    
    @Override
    public String getLocation() {
        return "Ubicación Garmin: Latitud: 5.32718, Longitud: -40.42825";
    }




    @Override
    public String getStatus() {
        return "Estado Garmin: En movimiento";
    }
}
