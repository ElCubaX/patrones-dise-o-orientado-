package co.edu.ucc.jose.abstractfactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("  UNIVERSIDAD COOPERATIVA DE COLOMBIA  ");
        System.out.println("  Facultad de Ingeniería de Sistemas  ");
        System.out.println("  Año: 2025  ");
        System.out.println("-------------------------------------------");
        System.out.println("  Estudiante: Jose Emilio Martinez Urgelles  ");
        System.out.println("  Programa: Ingeniería de Sistemas  ");
        System.out.println("===========================================\n");

        probarBanco(new BancoAFactory());
        System.out.println("----------------------------");

        probarBanco(new BancoBFactory());

        BancoFactory factory = new BancoAFactory();
        System.out.println("\nIdentidad codificada en Base64: " + factory.getIdentidad());
    }

    private static void probarBanco(BancoFactory bancoFactory) {
        Cuenta cuenta = bancoFactory.crearCuenta();
        Tarjeta tarjeta = bancoFactory.crearTarjeta();

        System.out.println(cuenta.abrir());
        System.out.println(tarjeta.emitir());
    }
}