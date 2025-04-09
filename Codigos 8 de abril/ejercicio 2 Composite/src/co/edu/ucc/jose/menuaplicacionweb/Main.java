package co.edu.ucc.jose.menuaplicacionweb;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        System.out.println("********************************************************");
        System.out.println("Detalles del Programa:");
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Año: 2025");
        System.out.println("Universidad: Universidad Cooperativa de Colombia");
        System.out.println("Programa: Ingeniería de Sistemas");
        System.out.println("Historia de Usuario:");
        System.out.println("Como diseñador de interfaz, quiero crear menús que puedan tener submenús");
        System.out.println("y opciones, y que puedan recorrerse uniformemente sin importar su nivel.");
        System.out.println("********************************************************\n");

        Menu menuPrincipal = new Menu("Principal");
        Opcion opcion1 = new Opcion("Inicio");
        Opcion opcion2 = new Opcion("Perfil");

        Menu submenu = new Menu("Configuración");
        submenu.agregar(new Opcion("Idioma"));
        submenu.agregar(new Opcion("Privacidad"));

        menuPrincipal.agregar(opcion1);
        menuPrincipal.agregar(opcion2);
        menuPrincipal.agregar(submenu);

        menuPrincipal.mostrar();

        System.out.println("\nIdentidad (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Composite";
    }
}
