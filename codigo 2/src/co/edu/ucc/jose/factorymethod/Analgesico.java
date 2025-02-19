package co.edu.ucc.jose.factorymethod;

public class Analgesico implements Medicamento {
    @Override
    public void administrar() {
        System.out.println("Administrando analgésico para el dolor.");
    }
}
