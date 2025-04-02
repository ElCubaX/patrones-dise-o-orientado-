package co.edu.ucc.jose.adapterbridge;





public class HuaweiDevice implements GPSDevice {
    @Override
    public String getLocation() {
        return "Latitud: 2.53149, Longitud: -81.32591"; 
    }




    @Override
    public String getStatus() {
        return "En Movimiento"; 
    }
}
