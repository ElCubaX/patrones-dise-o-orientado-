package co.edu.ucc.jose.adapterbridge;

public class MobilePanel extends TrackingPanel {

    
    
    public MobilePanel(GPSDevice gpsDevice) {
        super(gpsDevice);
    }

    
    @Override
    public void showLocation() {
        System.out.println("Mostrando ubicación de Huawei: " + gpsDevice.getLocation());
        System.out.println("Estado en Mobile: " + gpsDevice.getStatus());
    }
}
