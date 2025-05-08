package co.edu.ucc.jose.strategy;

import java.util.Base64;

public class EstrategiaImpuestosApp {

    interface EstrategiaImpuesto {
        double calcular(double monto);
    }

    static class ImpuestoColombia implements EstrategiaImpuesto {
        public double calcular(double monto) {
            return monto * 0.19;
        }
    }

    static class ImpuestoArgentina implements EstrategiaImpuesto {
        public double calcular(double monto) {
            return monto * 0.21;
        }
    }

    static class ImpuestoEcuador implements EstrategiaImpuesto {
        public double calcular(double monto) {
            return 0.0;
        }
    }

    static class CalculadoraImpuesto {
        private EstrategiaImpuesto estrategia;

        public void setEstrategia(EstrategiaImpuesto estrategia) {
            this.estrategia = estrategia;
        }

        public double calcularImpuesto(double monto) {
            return estrategia.calcular(monto);
        }
    }

    public static void main(String[] args) {
        System.out.println("********************************************************");
        System.out.println("Detalles del Programa:");
        System.out.println("Nombre: Jose Emilio Martinez Urgelles");
        System.out.println("Profesor: Harold Bolaños");
        System.out.println("Año: 2025");
        System.out.println("Universidad: Universidad Cooperativa de Colombia");
        System.out.println("Programa: Ingeniería de Sistemas");
        System.out.println("Historia de Usuario:");
        System.out.println("/*\r\n" + //
                        "********************************************************\r\n" + //
                        "Detalles del Programa:\r\n" + //
                        "Nombre: Jose Emilio Martinez Urgelles\r\n" + //
                        "Profesor: Harold Bolaños\r\n" + //
                        "Año: 2025\r\n" + //
                        "Universidad: Universidad Cooperativa de Colombia\r\n" + //
                        "Programa: Ingeniería de Sistemas\r\n" + //
                        "\r\n" + //
                        "Historia de Usuario:\r\n" + //
                        "Camila es una ingeniera de software encargada del módulo de facturación.\r\n" + //
                        "Su sistema debe calcular el impuesto según el país del cliente: \r\n" + //
                        "si el país es Colombia, se aplica el 19% de IVA; si es Argentina, se calcula el 21% de IVA; \r\n" + //
                        "en Ecuador, no se aplica impuesto.\r\n" + //
                        "\r\n" + //
                        "Inicialmente, Camila implementó una serie de condicionales que seleccionaban \r\n" + //
                        "el algoritmo de cálculo dependiendo del país. Sin embargo, con cada cambio de política fiscal, \r\n" + //
                        "debía modificar esta clase, violando el principio abierto/cerrado.\r\n" + //
                        "\r\n" + //
                        "Decidió aplicar el patrón Strategy: creó una interfaz EstrategiaImpuesto con un método calcular(double monto) \r\n" + //
                        "y definió implementaciones específicas para cada país.\r\n" + //
                        "\r\n" + //
                        "Gracias a esto, pudo registrar estrategias nuevas en tiempo de ejecución \r\n" + //
                        "y cumplir con los requerimientos del equipo de compliance fiscal sin modificar el código base.\r\n" + //
                        "********************************************************\r\n" + //
                        "*/");
        System.out.println("********************************************************\n");

        CalculadoraImpuesto calculadora = new CalculadoraImpuesto();

        calculadora.setEstrategia(new ImpuestoColombia());
        System.out.println("Colombia: $" + calculadora.calcularImpuesto(100000));

        calculadora.setEstrategia(new ImpuestoArgentina());
        System.out.println("Argentina: $" + calculadora.calcularImpuesto(100000));

        calculadora.setEstrategia(new ImpuestoEcuador());
        System.out.println("Ecuador: $" + calculadora.calcularImpuesto(100000));

        System.out.println("\nIdentidad (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    public static String getIdentidad() {
        String nombre = "Jose Emilio Martinez Urgelles";
        return Base64.getEncoder().encodeToString(nombre.getBytes());
    }

    public static String getPatron() {
        return "Strategy";
    }
}
