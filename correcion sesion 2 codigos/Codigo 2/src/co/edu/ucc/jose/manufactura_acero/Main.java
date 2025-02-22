package co.edu.ucc.jose.manufactura_acero;

/**
 * =====================================================
 *  Sistema de Producción de Acero - Sector: Manufactura
 * =====================================================
 * 
 * Historia de Usuario:
 * Como supervisor de producción, quiero poder registrar la cantidad 
 * de acero producido por cada máquina en un turno, para poder 
 * llevar un control de la producción.
 * 
 * Autor: Jose Emilio Martinez Urgelles
 * Universidad: Universidad Cooperativa de Colombia
 * Curso: Patrones de Diseño Orientado a Objetos
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("          SISTEMA DE PRODUCCIÓN DE ACERO");
        System.out.println("=====================================================");
        System.out.println("Sector: Manufactura");
        System.out.println("\nHistoria de Usuario:");
        System.out.println("Como supervisor de producción, quiero poder registrar la cantidad");
        System.out.println("de acero producido por cada máquina en un turno, para poder");
        System.out.println("llevar un control de la producción.");
        System.out.println("\nAutor: Jose Emilio Martinez Urgelles");
        System.out.println("Universidad: Universidad Cooperativa de Colombia");
        System.out.println("Curso: Patrones de Diseño Orientado  Objetos");
        System.out.println("=====================================================\n");

        Turno turno = new Turno();
        Maquina maquina1 = new Maquina("Máquina 1");
        Maquina maquina2 = new Maquina("Máquina 2");

        maquina1.producirAcero(5.3);
        maquina2.producirAcero(7.8);

        turno.agregarMaquina(maquina1);
        turno.agregarMaquina(maquina2);

        turno.mostrarProduccion();

        System.out.println("\n=====================================");
        System.out.println("IDENTIDAD CODIFICADA EN BASE64:");
        System.out.println(maquina1.getIdentidad());
        System.out.println("\nPATRÓN DE DISEÑO IMPLEMENTADO:");
        System.out.println(maquina1.getPatron());
        System.out.println("=====================================");
    }
}
