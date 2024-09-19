import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**
 * hacer opciones que llevamos hasta ahorita, con case
 */
        Scanner scanner = new Scanner(System.in);
        int opcion=0;

        while(opcion !=9) {
            System.out.println("\n****BIENVENIDO****");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar medico");
            System.out.println("3. Registrar consultorio");
            System.out.println("4. Registrar consulta");
            System.out.println("5. Mostrar pacientes");
            System.out.println("6. Mostrar medicos");
            System.out.println("7. Mostrar consultorios");
            System.out.println("8. Mostrar consultas");
            System.out.println("9. Salir");
            System.out.print("\nSelecciona una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    //registrar paciente
                    break;
                case 2:
                    //registrar medico
                    break;
                case 3:
                    //registrar consultorio
                    break;
                case 4:
                    //registrar consulta
                    break;
                case 5:
                    //mostrar pacientes
                    break;
                case 6:
                    //mostrar medicos
                    break;
                case 7:
                    //mostrar consultorios
                    break;
                case 8:
                    //mostrar consultas
                    break;
                case 9:
                    //salir
                    break;
                default:
                    System.out.println("Numero no esta dentro de las opciones");
            }
        }
    }
}