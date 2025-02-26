
package co.edu.ucc.jose.singleton2;

public class Main {
    public static void main(String[] args) {
        Database.encabezadoPgm();

        Database db1 = Database.getInstance();
        db1.ejecutarConsulta("SELECT * FROM pedidos");

        System.out.println("Identidad codificada: " + Database.getIdentidad());
    }
}
