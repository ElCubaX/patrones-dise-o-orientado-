package co.edu.ucc.jose.manejoletras;

import java.util.Base64;
import java.util.HashMap;

interface ILetra {
    void mostrar(String posicion);
}

class LetraConcreta implements ILetra {
    private final char simbolo;

    public LetraConcreta(char simbolo) {
        this.simbolo = simbolo;
        System.out.println("Creando letra: " + simbolo);
    }

    public void mostrar(String posicion) {
        System.out.println("Letra " + simbolo + " en posición " + posicion);
    }
}

class FabricaLetras {
    private static final HashMap<Character, ILetra> pool = new HashMap<>();

    public static ILetra obtenerLetra(char simbolo) {
        if (!pool.containsKey(simbolo)) {
            pool.put(simbolo, new LetraConcreta(simbolo));
        }
        return pool.get(simbolo);
    }
}

public class ManejoLetrasApp {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("Sistema de Manejo de Letras");
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Universidad Cooperativa de Colombia");
        System.out.println("Año: 2025");
        System.out.println("==============================================");
        
        System.out.println("Historia de Usuario:");
        System.out.println("Como usuario, quiero manejar muchas letras");
        System.out.println("sin consumir memoria excesiva, reutilizando instancias comunes.Codigo creado por el Jose");

        System.out.println("==============================================");

        ILetra letraA1 = FabricaLetras.obtenerLetra('A');
        ILetra letraA2 = FabricaLetras.obtenerLetra('A');
        ILetra letraB = FabricaLetras.obtenerLetra('B');

        letraA1.mostrar("1");
        letraA2.mostrar("2");
        letraB.mostrar("3");

        System.out.println(" Identidad codificada (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Patrón Flyweight";
    }
}
