package co.edu.ucc.jose.adapterbridge;

public class Main {
    public static void main(String[] args) {
        System.out.println("********************************************************");
        System.out.println("Historial de Usuario:");
        System.out.println("Como ingeniero de integración en una empresa de logística nacional, "
                + "necesito que nuestro sistema de rastreo de vehículos sea capaz de integrarse con múltiples "
                + "dispositivos GPS de diferentes marcas (Garmin, TomTom, Huawei), cada uno con su propia API, "
                + "para mostrar de forma unificada los datos de ubicación y estado del vehículo en una aplicación "
                + "móvil y de escritorio. Además, quiero poder modificar la interfaz gráfica del panel de rastreo "
                + "dependiendo de si el usuario accede desde escritorio o desde el celular, sin tener que cambiar "
                + "toda la lógica del sistema.");
        System.out.println("********************************************************");
        System.out.println("Detalles del Programa:");
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Año: 2025");
        System.out.println("Universidad: Universidad Cooperativa de Colombia");
        System.out.println("Programa: Ingeniería de Sistemas");
        System.out.println("********************************************************");

        GPSDevice garmin = new GarminDevice();
        GPSDevice tomTom = new TomTomDevice();
        GPSDevice huawei = new HuaweiDevice(); 

        TrackingPanel desktopPanel = new DesktopPanel(garmin);
        TrackingPanel mobilePanel = new MobilePanel(tomTom);
        TrackingPanel mobilePanelHuawei = new MobilePanel(huawei); 

        System.out.println("Mostrando ubicación en Desktop: " + garmin.getLocation());
        System.out.println("Estado en Desktop: " + garmin.getStatus());

        System.out.println("Mostrando ubicación en Mobile: " + tomTom.getLocation());
        System.out.println("Estado en Mobile: " + tomTom.getStatus());

        System.out.println("Mostrando ubicación en Mobile (Huawei): " + huawei.getLocation());
        System.out.println("Estado en Mobile (Huawei): " + huawei.getStatus());

        GetIdentidad.getIdentidad();
        GetPatron.getPatron();
    }
}  
