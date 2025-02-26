
package co.edu.ucc.jose.figuras;

public class Main {
    public static void main(String[] args) {
        Figura f1 = FiguraFactory.crearFigura("circulo");
        f1.dibujar();
    }
}
