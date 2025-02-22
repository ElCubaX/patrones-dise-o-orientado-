package co.edu.ucc.jose.reservacancha;

/**
 * =====================================================
 *  Sistema de Reservas de Canchas - Sector: Recreación
 * =====================================================
 * 
 * Historia de Usuario:
 * Como usuario, quiero poder reservar una cancha de fútbol 
 * para un día y hora específicos, para poder jugar con mis amigos.
 * 
 * Autor: Jose Emilio Martinez Urgelles
 * Universidad: Universidad Cooperativa de Colombia
 * Curso: Análisis Numérico
 */

public class Main {
    public static void main(String[] args) {
       
        System.out.println("=====================================================");
        System.out.println("          SISTEMA DE RESERVA DE CANCHAS");
        System.out.println("=====================================================");
        System.out.println("Sector: Recreación");
        System.out.println("\nHistoria de Usuario:");
        System.out.println("Como usuario, quiero poder reservar una cancha de fútbol");
        System.out.println("para un día y hora específicos, para poder jugar con mis amigos.");
        System.out.println("\nAutor: Jose Emilio Martinez Urgelles");
        System.out.println("Universidad: Universidad Cooperativa de Colombia");
        System.out.println("Curso: Patrones de diseño orientado a objetos");
        System.out.println("=====================================================\n");

        CanchaReserva cancha = new CanchaReserva();

 
        cancha.reservarCancha("2023-10-15", "18:00", "Juan Pérez");
        cancha.reservarCancha("2023-10-15", "20:00", "Carlos Gómez");


        cancha.mostrarReservas();

        System.out.println("\n=====================================");
        System.out.println("IDENTIDAD CODIFICADA EN BASE64:");
        System.out.println(cancha.getIdentidad());
        System.out.println("\nPATRÓN DE DISEÑO IMPLEMENTADO:");
        System.out.println(cancha.getPatron());
        System.out.println("=====================================");
    }
}
