package co.edu.ucc.jose.singleton;

public class Main {
    public static void main(String[] args) {
        Logger.encabezadoPgm();
        
        Logger logger1 = Logger.getInstance();
        logger1.log("Inicio de sesión");

        Logger logger2 = Logger.getInstance();
        logger2.log("Transacción realizada");
    }
}
