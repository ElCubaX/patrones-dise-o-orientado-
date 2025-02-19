package co.edu.ucc.jose.factorymethod;

public class Antibiotico implements Medicamento {
    @Override
    public void administrar() {
        System.out.println("Administrando antibiótico para la infección.");
    }
}
