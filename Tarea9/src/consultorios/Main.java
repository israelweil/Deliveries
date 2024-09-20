import consultorios.Consultorio;
import hospital.Hospital;
import medicos.Medico;
import pacientes.Paciente;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**
 * hacer opciones que llevamos hasta ahorita, con case
 */
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        int opcion=0;

        while(opcion !=9) {
            System.out.println("\n****BIENVENIDO****");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar medico");
            System.out.println("3. Registrar consultorio");
            //hasta aqui y mostrarlos
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
                    System.out.println("\n Seleccionaste la opcion de registrar a un paciente");

                    System.out.println("Ingresa el nombre ");
                    String nombre = scanner.next();
                    scanner.nextLine();

                    System.out.println("Ingresa los apellidos: ");
                    String apellidos = scanner.nextLine();

                    System.out.println("Ingresa fecha nacimiento: ");
                    String fechaNacimiento = scanner.nextLine();

                    System.out.println("Ingresa el tipo de sangre: ");
                    String tipoSangre = scanner.nextLine();


                    System.out.println("Ingresa el sexo: ");
                    char sexo = scanner.nextLine().charAt(0);

                    System.out.println("Ingresa el telefono: ");
                    String telefono = scanner.nextLine();

                    Paciente paciente = new Paciente(nombre, apellidos,fechaNacimiento,tipoSangre,sexo,telefono);
                    hospital.registrarPaciente(paciente);
                    break;
                case 2:
                    //registrar medico
                    System.out.println("\n Seleccionaste la opcion de registrar a un medico");

                    System.out.println("Ingresa el nombre ");
                    String nombreMedico = scanner.next();
                    scanner.nextLine();

                    System.out.println("Ingresa los apellidos: ");
                    String apellidosMedico = scanner.nextLine();

                    System.out.println("Ingresa fecha nacimiento: ");
                    String fechaNacimientoMedico = scanner.nextLine();

                    System.out.println("Ingresa el telefono: ");
                    String telefonoMedico = scanner.nextLine();

                    System.out.println("Ingresa el RFC: ");
                    String rfc = scanner.nextLine();


                    Medico medico = new Medico(nombreMedico,apellidosMedico,fechaNacimientoMedico,telefonoMedico,rfc);
                    hospital.registrarMedico(medico);
                    break;
                case 3:
                    //registrar consultorio
                    System.out.println("\n Seleccionaste la opcion de registrar a un consultorio");

                    System.out.println("Ingresa el piso ");
                    int piso = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingresa el numero de consultorio: ");
                    int numeroConsultorio = scanner.nextInt();

                    Consultorio consultorio = new Consultorio(piso,numeroConsultorio);
                    hospital.registrarConsultorio(consultorio);
                    break;
                case 4:
                    //registrar consulta
                    break;
                case 5:
                    //mostrar pacientes

                    hospital.mostrarPacientes();
                    break;
                case 6:
                    //mostrar medicos
                    hospital.mostrarMedicos();
                    break;
                case 7:
                    //mostrar consultorios
                    hospital.mostrarConsultorio();
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