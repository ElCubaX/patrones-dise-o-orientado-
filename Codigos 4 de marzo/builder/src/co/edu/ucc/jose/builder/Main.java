package co.edu.ucc.jose.builder;

import java.util.Base64;

class Usuario {
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;

    private Usuario(UsuarioBuilder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.direccion = builder.direccion;
        this.telefono = builder.telefono;
    }

    public static class UsuarioBuilder {
        private String nombre;
        private int edad;
        private String direccion;
        private String telefono;

        public UsuarioBuilder(String nombre) {
            this.nombre = nombre;
        }

        public UsuarioBuilder setEdad(int edad) {
            this.edad = edad;
            return this;
        }

        public UsuarioBuilder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public UsuarioBuilder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }

    public String toString() {
        return "Usuario: " + nombre + ", Edad: " + edad + ", Dirección: " + direccion + ", Teléfono: " + telefono;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("       PROGRAMA: PATRÓN BUILDER EN JAVA             ");
        System.out.println("=====================================================");
        System.out.println(" Autor      : Jose Emilio Martinez Urgelles");
        System.out.println(" Universidad: Cooperativa de Colombia");
        System.out.println(" Ciudad     : Cali");
        System.out.println(" Profesor   : Harold Bolaños");
        System.out.println("-----------------------------------------------------");
        System.out.println(" Identidad Codificada (Base64): " + getIdentidad());
        System.out.println("=====================================================");

        Usuario usuario = new Usuario.UsuarioBuilder("Jose Emilio Martinez Urgelles")
                .setEdad(21)  
                .setDireccion("Cali, Valle del Cauca")
                .setTelefono("3101234567")
                .build();

        System.out.println(usuario);
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
}
