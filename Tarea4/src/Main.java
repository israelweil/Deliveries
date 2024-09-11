//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Coche coche1 = new Coche();
        coche1.marca = "BMW";
        coche1.modelo = "Serie 3";
        coche1.year = 2020;
        System.out.print("Coche 1: ");
        coche1.mostrarDatos();

//      Coche2
        Coche coche2 = new Coche();
        coche2.marca = "Audi";
        coche2.modelo = "A3";
        coche2.year = 2007;
        System.out.print("Coche 2: ");
        coche2.mostrarDatos();

//        Coche3
        Coche coche3 = new Coche();
        coche3.marca = "Mercedes";
        coche3.modelo = "Clase A";
        coche3.year = 2005;
        System.out.print("Coche 3: ");
        coche3.mostrarDatos();
    }
}