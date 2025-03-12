package co.edu.ucc.jose.builder;

import java.util.Base64;

class Boleto {
    private String clase;
    private boolean equipajeExtra;
    private boolean seleccionAsiento;
    private boolean comidaEspecial;

    private Boleto(BoletoBuilder builder) {
        this.clase = builder.clase;
        this.equipajeExtra = builder.equipajeExtra;
        this.seleccionAsiento = builder.seleccionAsiento;
        this.comidaEspecial = builder.comidaEspecial;
    }

    public void mostrarDetalles() {
        System.out.println("Clase: " + clase + ", Equipaje Extra: " + equipajeExtra + 
                           ", Selección de Asiento: " + seleccionAsiento + 
                           ", Comida Especial: " + comidaEspecial);
    }

    public static class BoletoBuilder {
        private String clase;
        private boolean equipajeExtra = false;
        private boolean seleccionAsiento = false;
        private boolean comidaEspecial = false;

        public BoletoBuilder(String clase) {
            this.clase = clase;
        }

        public BoletoBuilder agregarEquipajeExtra() {
            this.equipajeExtra = true;
            return this;
        }

        public BoletoBuilder seleccionarAsiento() {
            this.seleccionAsiento = true;
            return this;
        }

        public BoletoBuilder agregarComidaEspecial() {
            this.comidaEspecial = true;
            return this;
        }

        public Boleto build() {
            return new Boleto(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("UNIVERSIDAD COOPERATIVA DE COLOMBIA");
        System.out.println("Ingeniería de Sistemas");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Estudiante: Jose Emilio Martinez");
        System.out.println("=========================================\n");

        Boleto boleto1 = new Boleto.BoletoBuilder("Económica")
                                    .agregarEquipajeExtra()
                                    .seleccionarAsiento()
                                    .build();

        Boleto boleto2 = new Boleto.BoletoBuilder("Ejecutiva")
                                    .agregarComidaEspecial()
                                    .build();

        boleto1.mostrarDetalles();
        boleto2.mostrarDetalles();

        System.out.println("\nIdentidad en Base64: " + getIdentidad());
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }
}
