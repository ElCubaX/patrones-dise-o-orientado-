package co.edu.ucc.jose.adapterbridge;

public class DesktopPanel extends TrackingPanel {

    
    
    
    public DesktopPanel(GPSDevice gpsDevice) {
        super(gpsDevice);
    }




    @Override
    public void showLocation() {
        System.out.println("Mostrando ubicación de Garmin: " + gpsDevice.getLocation());
        System.out.println("Estado en Desktop: " + gpsDevice.getStatus());
    }
}
