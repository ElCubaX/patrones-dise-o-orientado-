
package co.edu.ucc.jose.abstractfactory;

import java.util.Base64;

// Interfaz común para Botón
interface Boton {
    void render();
}

// Interfaz común para Ventana
interface Ventana {
    void mostrar();
}

// Implementaciones para Light Mode
class BotonLight implements Boton {
    public void render() {
        System.out.println("Renderizando botón Light");
    }
}

class VentanaLight implements Ventana {
    public void mostrar() {
        System.out.println("Mostrando ventana Light");
    }
}

// Implementaciones para Dark Mode
class BotonDark implements Boton {
    public void render() {
        System.out.println("Renderizando botón Dark");
    }
}

class VentanaDark implements Ventana {
    public void mostrar() {
        System.out.println("Mostrando ventana Dark");
    }
}

// Abstract Factory
interface GUIFactory {
    Boton crearBoton();
    Ventana crearVentana();
}

// Fábricas concretas
class LightFactory implements GUIFactory {
    public Boton crearBoton() {
        return new BotonLight();
    }

    public Ventana crearVentana() {
        return new VentanaLight();
    }
}

class DarkFactory implements GUIFactory {
    public Boton crearBoton() {
        return new BotonDark();
    }

    public Ventana crearVentana() {
        return new VentanaDark();
    }
}

// Cliente
public class Main {
    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
    
    public static void mostrarEncabezado() {
        System.out.println("=====================================================");
        System.out.println("       PROGRAMA: PATRÓN ABSTRACT FACTORY EN JAVA     ");
        System.out.println("=====================================================");
        System.out.println(" Autor      : Jose Emilio Martinez Urgelles");
        System.out.println(" Universidad: Cooperativa de Colombia");
        System.out.println(" Ciudad     : Cali");
        System.out.println(" Profesor   : Harold Bolaños");
        System.out.println("-----------------------------------------------------");
        System.out.println(" Identidad Codificada (Base64): " + getIdentidad());
        System.out.println("=====================================================\n");
    }

    public static void main(String[] args) {
        mostrarEncabezado();

        GUIFactory factory = new DarkFactory();

        Boton boton = factory.crearBoton();
        Ventana ventana = factory.crearVentana();

        boton.render();
        ventana.mostrar();
    }
}
