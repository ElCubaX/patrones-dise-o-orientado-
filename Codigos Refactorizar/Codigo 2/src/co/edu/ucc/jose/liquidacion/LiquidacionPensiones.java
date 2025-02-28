

 package co.edu.ucc.jose.liquidacion;

 import java.util.Base64;
 import java.util.HashMap;
 import java.util.Map;
 
 interface LiquidacionStrategy {
     double calcularPago(int cantidadPersonas, double salario);
 }
 
 class LiquidacionLey78 implements LiquidacionStrategy {
     public double calcularPago(int cantidadPersonas, double salario) {
         return cantidadPersonas * salario * 15;
     }
 }
 
 class LiquidacionLey86 implements LiquidacionStrategy {
     public double calcularPago(int cantidadPersonas, double salario) {
         return cantidadPersonas * salario * 5;
     }
 }
 
 class LiquidacionLey98 implements LiquidacionStrategy {
     public double calcularPago(int cantidadPersonas, double salario) {
         return cantidadPersonas * salario * 2.5;
     }
 }
 
 class LiquidacionLey100 implements LiquidacionStrategy {
     public double calcularPago(int cantidadPersonas, double salario) {
         return cantidadPersonas * salario; 
     }
 }
 
 class LiquidacionLeyPetro implements LiquidacionStrategy {
     public double calcularPago(int cantidadPersonas, double salario) {
         if (salario > 1400000 * 3.5) {
             salario = 1400000 * 3.5;
         } else {
             salario *= 0.7;
         }
         return cantidadPersonas * salario;
     }
 }
 

 class LiquidacionFactory {
     private static final Map<String, LiquidacionStrategy> estrategias = new HashMap<>();
     
     static {
         estrategias.put("Ley 78", new LiquidacionLey78());
         estrategias.put("Ley 86", new LiquidacionLey86());
         estrategias.put("Ley 98", new LiquidacionLey98());
         estrategias.put("Ley 100", new LiquidacionLey100());
         estrategias.put("Ley Petro", new LiquidacionLeyPetro());
     }
     
     public static LiquidacionStrategy getEstrategia(String ley) {
         return estrategias.get(ley);
     }
 }
 

 public class LiquidacionPensiones {
     public static void main(String[] args) {
         double totalPago = 0;

         System.out.println("=============================================");
         System.out.println("Autor: Jose Emilio Martinez Urgelles");
         System.out.println("Universidad: Universidad Cooperativa de Colombia");
         System.out.println("Programa: Ingeniería de Sistemas");
         System.out.println("Fecha: 27 de febrero de 2025");
         System.out.println("=============================================");
         System.out.println("=== Cálculo de Liquidación de Pensiones ===");
 
         totalPago += calcularYLiquidar("Ley 78", 3, 850000);
         totalPago += calcularYLiquidar("Ley 86", 2, 930000);
         totalPago += calcularYLiquidar("Ley 98", 3, 1020000);
         totalPago += calcularYLiquidar("Ley 98", 2, 2040000);
         totalPago += calcularYLiquidar("Ley 100", 2, 1200000);
         double promedio = (1230000 * 5 + 1300000 * 5) / 10.0;
         totalPago += calcularYLiquidar("Ley 100", 1, promedio);
         totalPago += calcularYLiquidar("Ley Petro", 4, 1400000 * 4);
         totalPago += calcularYLiquidar("Ley Petro", 3, 1400000);
 
         System.out.println("---------------------------------------------");
         System.out.println("Total a pagar en pensiones: $" + String.format("%,.2f", totalPago));
         
         System.out.println("=============================================");
         System.out.println("Identidad codificada: " + getIdentidad());
         System.out.println(getPatron());
         System.out.println("=============================================");
     }
 
     public static double calcularYLiquidar(String ley, int cantidadPersonas, double salario) {
         LiquidacionStrategy estrategia = LiquidacionFactory.getEstrategia(ley);
         if (estrategia == null) {
             System.out.println("No hay estrategia definida para " + ley);
             return 0;
         }
         double pago = estrategia.calcularPago(cantidadPersonas, salario);
         System.out.println(ley + " - " + cantidadPersonas + " personas * " + salario + " = $" + String.format("%,.2f", pago));
         return pago;
     }
 
     public static String getIdentidad() {
         String nombre = "Jose Emilio Martinez Urgelles";
         return Base64.getEncoder().encodeToString(nombre.getBytes());
     }
 
     public static String getPatron() {
         return "Patrón utilizado: Factory Method";
     }
 }
 