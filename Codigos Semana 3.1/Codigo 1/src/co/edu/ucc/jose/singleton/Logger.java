package co.edu.ucc.jose.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        String repositorioGit = "https://github.com/habolanos/ucc-estructuras/blob/master/sesion04/ejercicios/1-algoritmo-01/PgmAlgoritmo01.java";

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
}
