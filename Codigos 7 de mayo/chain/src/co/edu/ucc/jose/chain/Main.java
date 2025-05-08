package co.edu.ucc.jose.chain;


abstract class Aprobador {
    protected Aprobador siguiente;

    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void procesarSolicitud(double monto);
}

class Supervisor extends Aprobador {
    public void procesarSolicitud(double monto) {
        if (monto <= 500) {
            System.out.println("Aprobado por Supervisor.");
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(monto);
        }
    }
}

class JefeDepartamento extends Aprobador {
    public void procesarSolicitud(double monto) {
        if (monto <= 5000) {
            System.out.println("Aprobado por Jefe de Departamento.");
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(monto);
        }
    }
}

class DirectorFinanciero extends Aprobador {
    public void procesarSolicitud(double monto) {
        if (monto > 5000) {
            System.out.println("Aprobado por Director Financiero.");
        } else if (siguiente != null) {
            siguiente.procesarSolicitud(monto);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String identidad = getIdentidad();
        String patron = getPatron();
        System.out.println("Nombre: " + identidad);
        System.out.println("Patrón implementado: " + patron);
        System.out.println("Año: 2025");
        System.out.println("Universidad Cooperativa de Colombia");
        System.out.println("Programa: Ingeniería de Sistemas\n");

        System.out.println("Historia de Usuario:");
        System.out.println("María es analista de TI en una empresa multinacional que implementa un nuevo sistema de aprobación de compras.");
        System.out.println("Cada solicitud de compra debe ser evaluada por distintos roles según su monto:");
        System.out.println("• Menor a $500: supervisor directo.");
        System.out.println("• Entre $500 y $5000: jefe de departamento.");
        System.out.println("• Mayor a $5000: dirección financiera.");
        System.out.println("Inicialmente, el flujo estaba codificado como una gran estructura if-else, lo que hacía difícil su modificación.");
        System.out.println("María decide aplicar el patrón Chain of Responsibility.");
        System.out.println("Define una interfaz Aprobador con un método setSiguiente() y procesarSolicitud(). Cada clase representa un rol y maneja solo su caso.");
        System.out.println("Ahora, la cadena se configura dinámicamente, y nuevos niveles de aprobación pueden agregarse fácilmente sin modificar la lógica principal.");
        System.out.println("Incluso se pueden registrar logs de cada paso en la cadena para auditoría.\n");

        Aprobador supervisor = new Supervisor();
        Aprobador jefe = new JefeDepartamento();
        Aprobador director = new DirectorFinanciero();

        supervisor.setSiguiente(jefe);
        jefe.setSiguiente(director);

        supervisor.procesarSolicitud(300);   
        supervisor.procesarSolicitud(3000);  
        supervisor.procesarSolicitud(15000); 
    }

    public static String getIdentidad() {
        return java.util.Base64.getEncoder().encodeToString("Jose Emilio Martinez Urgelles".getBytes());
    }

    public static String getPatron() {
        return "Chain of Responsibility";
    }
}
