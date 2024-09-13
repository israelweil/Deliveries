import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 5);
        System.out.println("    Base: " + rectangulo.getBase());
        System.out.println("    Altura: " + rectangulo.getAltura());
        System.out.println("    Area: " + rectangulo.calcularArea());
        System.out.println("    Perimetro: " + rectangulo.calcularPerimetro());
        System.out.println("    Area de valores double : " + rectangulo.calcularArea(13.4, 5.6));
        System.out.println("    Perimetro de valores double : " + rectangulo.calcularPerimetro(13.4, 5.6));

//        Empleado
        Empleado empleado = new Empleado(221.50,80.90,2.3);
        System.out.println("\n"+empleado.mostrarDatos());
        System.out.println("    EL salario total con solo sueldo base fue de: " + empleado.calcularSalario(32.7));
        System.out.println("    EL salario total con sueldo base y bonificacion fue de: " + empleado.calcularSalario(32.2,15.7));
        System.out.println("    EL salario total con sueldo base, bonificacion y horas extra fue de: " + empleado.calcularSalario(32,15.7,8.5));


//        Empleado
        Empleado empleado2 = new Empleado(471.50,120.90,1);
        System.out.println("\n"+empleado2.mostrarDatos());
        System.out.println("    EL salario total con solo sueldo base fue de: " + empleado2.calcularSalario(32.7));
        System.out.println("    EL salario total con sueldo base y bonificacion fue de: " + empleado2.calcularSalario(25.99,210));
        System.out.println("    EL salario total con sueldo base, bonificacion y horas extra fue de: " + empleado2.calcularSalario(78,8.7,5));
//        falta metodo calcularImpuestos

//        Calculadora Impuestos
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos(35,28.99,16,5.1);
        System.out.println("\n" + calculadora.mostrarImpuestos());
        System.out.println("    El impuesto por ingresos es de: " + calculadora.calcularImpuestos(56));
        System.out.println("    El impuesto por ventas y porcentaje de ingreso es de: " + calculadora.calcularImpuestos(56, 44.21));
        System.out.println("    El impuesto por dividendos, porcentaje de Impuesto y exención es de: " + calculadora.calcularImpuestos(90, 54.21, 12.5));

//        Calculadora Impuestos
        CalculadoraImpuestos calculadora2 = new CalculadoraImpuestos(250,28.99,21,5.1);
        System.out.println("\n" + calculadora2.mostrarImpuestos());
        System.out.println("    El impuesto por ingresos es de: " + calculadora2.calcularImpuestos(150));
        System.out.println("    El impuesto por ventas y porcentaje de ingreso es de: " + calculadora2.calcularImpuestos(87, 2.21));
        System.out.println("    El impuesto por dividendos, porcentaje de Impuesto y exención es de: " + calculadora2.calcularImpuestos(10, 94.21, 13.7));
    }
}