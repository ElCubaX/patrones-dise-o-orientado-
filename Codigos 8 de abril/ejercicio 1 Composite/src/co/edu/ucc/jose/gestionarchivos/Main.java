package co.edu.ucc.jose.gestionarchivos;

import java.util.Base64;

public class Main {

    public static void main(String[] args) {
        mostrarEncabezado();

        Archivo archivo1 = new Archivo("Documento.txt");
        Archivo archivo2 = new Archivo("Imagen.png");

        Carpeta carpeta1 = new Carpeta("Mis Documentos");
        Carpeta subCarpeta = new Carpeta("Fotos");

        subCarpeta.agregar(archivo2);
        carpeta1.agregar(archivo1);
        carpeta1.agregar(subCarpeta);

        carpeta1.mostrar();

        System.out.println("\n--- Información Adicional ---");
        System.out.println("Identidad (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    public static void mostrarEncabezado() {
        System.out.println("********************************************************");
        System.out.println("Detalles del Programa:");
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Año: 2025");
        System.out.println("Universidad: Universidad Cooperativa de Colombia");
        System.out.println("Programa: Ingeniería de Sistemas");
        System.out.println("********************************************************");
        System.out.println("Historia de Usuario:");
        System.out.println("Como administrador de servidores, necesito representar");
        System.out.println("carpetas y archivos en una estructura jerárquica para");
        System.out.println("recorrer y gestionar todo el sistema de almacenamiento");
        System.out.println("de forma uniforme.");
        System.out.println("********************************************************\n");
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Composite";
    }
}
