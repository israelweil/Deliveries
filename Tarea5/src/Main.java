import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 5);
        System.out.println("    Base: " + rectangulo.base);
        System.out.println("    Altura: " + rectangulo.altura);
        System.out.println("    Area: " + rectangulo.calcularArea());
        System.out.println("    Perimetro: " + rectangulo.calcularPerimetro());
        System.out.println("    Area de valores double : " + rectangulo.calcularArea(13.4, 5.6));
        System.out.println("    Perimetro de valores double : " + rectangulo.calcularPerimetro(13.4, 5.6));
    }
}