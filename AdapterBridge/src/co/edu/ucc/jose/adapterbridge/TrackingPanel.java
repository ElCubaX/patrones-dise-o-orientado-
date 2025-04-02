package co.edu.ucc.jose.adapterbridge;

public abstract class TrackingPanel {
    
    
    
    protected GPSDevice gpsDevice;

    
    
    
    
    public TrackingPanel(GPSDevice gpsDevice) {
        this.gpsDevice = gpsDevice;
    }




    public abstract void showLocation();
}
