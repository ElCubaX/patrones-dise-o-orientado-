package co.edu.ucc.jose.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

public class Logger {
    private static Logger instance;
    
    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public static void encabezadoPgm(){
        String nombre = "Jose Emilio Martinez Urgelles";
        String campus = "Universidad Cooperativa de Colombia, Campus Cali";
        String repositorioGit = "https://github.com/ElCubaX/patrones-dise-o-orientado-/tree/main/Codigos%20Semana%203.1/Codigo%201/src/co/edu/ucc/jose/singleton";

        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHora = ahora.format(formateador);

        System.out.println("--------------------------------------------------");
        System.out.println("|  Nombre       : " + nombre);
        System.out.println("|  Campus       : " + campus);
        System.out.println("|  Fecha y hora : " + fechaHora);
        System.out.println("|  Repositorio Git : " + repositorioGit);
        System.out.println("--------------------------------------------------");
        System.out.println();
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        String codificado = Base64.getEncoder().encodeToString(nombre.getBytes());
        return codificado;
    }
}
