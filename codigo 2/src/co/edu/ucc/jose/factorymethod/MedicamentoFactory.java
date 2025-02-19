package co.edu.ucc.jose.factorymethod;

public class MedicamentoFactory {
    public static Medicamento crearMedicamento(String tipo) {
        if (tipo.equalsIgnoreCase("analgesico")) {
            return new Analgesico();
        } else if (tipo.equalsIgnoreCase("antibiotico")) {
            return new Antibiotico();
        } else {
            throw new IllegalArgumentException("Tipo de medicamento no válido.");
        }
    }
}
