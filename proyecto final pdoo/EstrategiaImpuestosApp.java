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
        System.out.println("Como analista financiero internacional, quiero calcular el impuesto aplicable en");
        System.out.println("diferentes países sin modificar el código base, adaptando dinámicamente la estrategia.");
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
