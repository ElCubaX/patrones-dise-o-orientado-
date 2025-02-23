// Source code is decompiled from a .class file using FernFlower decompiler.
package co.edu.ucc.jose.banco;

import java.util.Base64;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      System.out.println("===========================================");
      System.out.println("Sector: Bancos");
      System.out.println("Historia de Usuario:");
      System.out.println("Jose Emilio Martinez Urgelles");
      System.out.println("Curso: Patrones de Dise\u00f1o Orientado a objetos");
      System.out.println("Como cliente del banco, quiero poder transferir dinero de mi cuenta a otra cuenta,");
      System.out.println("para poder realizar pagos o enviar dinero a familiares.");
      System.out.println("===========================================\n");
      CuentaBancaria var1 = new CuentaBancaria("123456", 1000.0);
      CuentaBancaria var2 = new CuentaBancaria("654321", 500.0);
      var1.transferir(var2, 200.0);
      var1.mostrarSaldo();
      var2.mostrarSaldo();
      System.out.println("\nIdentidad Codificada: " + getIdentidad());
      System.out.println("Patr\u00f3n Implementado: " + getPatron());
   }

   public static String getIdentidad() {
      String var0 = "Jose Emilio Martinez Urgelles";
      return Base64.getEncoder().encodeToString(var0.getBytes());
   }

   public static String getPatron() {
      return "Patr\u00f3n Comportamiento - Encapsulaci\u00f3n de datos";
   }
}
