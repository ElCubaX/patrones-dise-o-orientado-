package co.edu.ucc.jose.reservacancha;

public class Main {
    public static void main(String[] args) {

        System.out.println("Historia de Usuario:");
        System.out.println("Como usuario, quiero poder reservar una cancha de fútbol para un día y hora específicos, para poder jugar con mis amigos.\n");

        CanchaReserva cancha = new CanchaReserva();
        cancha.reservarCancha("2023-10-15", "18:00", "Juan Pérez");
        cancha.reservarCancha("2023-10-15", "20:00", "Carlos Gómez");
        cancha.mostrarReservas();

        System.out.println("\nIdentidad codificada en Base64: " + cancha.getIdentidad());
        System.out.println(cancha.getPatron());
    }
}
