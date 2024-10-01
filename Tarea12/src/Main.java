import consultas.Consulta;
import consultorios.Consultorio;
import hospital.Hospital;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**
 * hacer opciones que llevamos hasta ahorita, con case
 */

//        datos ingresados para hacer pruebas
        Paciente paciente1 = new Paciente("P202491247952219","Jose Israel","Olvera Bucio", LocalDate.of(2005,04,19),"O+",'M',"4436431778");
        Medico medico1 = new Medico("M-ZE-3-2024-21843-1","Sofia","Zendejas Quintana",LocalDate.of(2007,01,23),"7861278729","1230");
        Consultorio consultorio1 = new Consultorio("C1302024240177",3,56);
        Hospital hospital = new Hospital();

        hospital.listaPacientes.add(paciente1);
        hospital.listaMedicos.add(medico1);
        hospital.listaConsultorios.add(consultorio1);
        Scanner scanner = new Scanner(System.in);
        int opcion=0;

        while(opcion !=12) {
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
            System.out.println("9. Buscar pacientes por Id");
            System.out.println("10. Buscar medicos por Id");
            System.out.println("11. Buscar consultorios por Id");
            System.out.println("12. Salir");
            System.out.print("\nSelecciona una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    //registrar paciente
                    System.out.println("\n Seleccionaste la opcion de registrar a un paciente");
                    scanner.nextLine();

                    System.out.println("Ingresa el nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingresa los apellidos: ");
                    String apellidos = scanner.nextLine();

                    System.out.println("Ingresa el anio de nacimiento: ");
                    int anioNacimiento = scanner.nextInt();

                    System.out.println("Ingresa el mes de nacimiento: ");
                    int mesNacimiento = scanner.nextInt();

                    System.out.println("Ingresa el dia de nacimiento: ");
                    int diaNacimiento = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingresa el tipo de sangre: ");
                    String tipoSangre = scanner.nextLine();


                    System.out.println("Ingresa el sexo: ");
                    char sexo = scanner.nextLine().charAt(0);

                    System.out.println("Ingresa el telefono: ");
                    String telefono = scanner.nextLine();

                    String idPaciente = hospital.generarIdPaciente();
                    LocalDate fechaNacimiento = LocalDate.of(anioNacimiento,mesNacimiento,diaNacimiento);

                    Paciente paciente = new Paciente(idPaciente,nombre, apellidos,fechaNacimiento,tipoSangre,sexo,telefono);
                    hospital.registrarPaciente(paciente);
                    System.out.println("Paciente registrado exitosamente");
                    break;
                case 2:
                    //registrar medico
                    System.out.println("\n Seleccionaste la opcion de registrar a un medico");
                    scanner.nextLine();

                    System.out.println("Ingresa el nombre: ");
                    String nombreMedico = scanner.nextLine();


                    System.out.println("Ingresa los apellidos: ");
                    String apellidosMedico = scanner.nextLine();

                    System.out.println("Ingresa el año de nacimiento: ");
                    int anioNacimientoMedico = scanner.nextInt();

                    System.out.println("Ingresa el mes de nacimiento: ");
                    int mesNacimientoMedico = scanner.nextInt();

                    System.out.println("Ingresa el dia de nacimiento: ");
                    int diaNacimientoMedico = scanner.nextInt();
                    scanner.nextLine();

                    LocalDate fechaNacimientoMedico = LocalDate.of(anioNacimientoMedico,mesNacimientoMedico,diaNacimientoMedico);

                    System.out.println("Ingresa el telefono: ");
                    String telefonoMedico = scanner.nextLine();

                    System.out.println("Ingresa el RFC: ");
                    String rfc = scanner.nextLine();


                    String idMedico = hospital.generarIdMedico(apellidosMedico,String.valueOf(fechaNacimientoMedico));

                    Medico medico = new Medico(idMedico, nombreMedico,apellidosMedico,fechaNacimientoMedico,telefonoMedico,rfc);
                    hospital.registrarMedico(medico);
                    System.out.println("Medico registrado exitosamente");
                    break;
                case 3:
                    //registrar consultorio
                    System.out.println("\n Seleccionaste la opcion de registrar a un consultorio");

                    System.out.println("Ingresa el piso ");
                    int piso = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingresa el numero de consultorio: ");
                    int numeroConsultorio = scanner.nextInt();

                    String idConsultorio = hospital.generarIdConsultorio();

                    Consultorio consultorio = new Consultorio(idConsultorio,piso,numeroConsultorio);
                    hospital.registrarConsultorio(consultorio);
                    break;
                case 4:
                    //registrar consulta
                    System.out.println("\n Seleccionaste la opcion de registrar una consulta");
                    scanner.nextLine();
                    System.out.print("Ingresa el año de la consulta: ");
                    int anioConsulta = scanner.nextInt();
                    System.out.println("Ingresa el mes de la consulta: ");
                    int mesConsulta = scanner.nextInt();
                    System.out.println("Ingresa el dia de la consulta: ");
                    int diaConsulta = scanner.nextInt();
                    System.out.println("Ingresa la hora de la consulta: ");
                    int horaConsulta = scanner.nextInt();
                    System.out.println("Ingresa los minutos de la consulta: ");
                    int minutosConsulta = scanner.nextInt();
                    LocalDateTime fechaConsulta = LocalDateTime.of(anioConsulta,mesConsulta,diaConsulta,horaConsulta,minutosConsulta);
                    scanner.nextLine();

                    System.out.println("Ingresa el id del paciente: ");
                    String pacienteConsulta = scanner.nextLine();
                    Paciente pacienteParaConsulta = hospital.obtenerPacienteporId(pacienteConsulta);


                    System.out.println("Ingresa el id del medico: ");
                    String medicoConsulta = scanner.nextLine();
                    Medico medicoParaConsulta = hospital.obtenerMedicoPorId(medicoConsulta);


                    System.out.println("Ingresa el id del consultorio: ");
                    String consultorioConsulta = scanner.nextLine();
                    Consultorio consultorioParaConsulta = hospital.obtenerConsultorioPorId(consultorioConsulta);

                    Consulta consulta = new Consulta(fechaConsulta,pacienteParaConsulta,medicoParaConsulta,consultorioParaConsulta);

                    hospital.registrarConsulta(consulta);

                    break;
                case 5:
                    //mostrar pacientes
                    System.out.println("\n--Seleccionaste la opción de mostrar pacientes--");
                    hospital.mostrarPacientes();
                    break;
                case 6:
                    //mostrar medicos
                    System.out.println("\n--Seleccionaste la opción de mostrar medicos--");
                    hospital.mostrarMedicos();
                    break;
                case 7:
                    //mostrar consultorios
                    System.out.println("\n--Seleccionaste la opción de mostrar consultorios--");
                    hospital.mostrarConsultorio();
                    break;
                case 8:
                    //mostrar consultas
                    hospital.mostrarConsultas();
                    break;
                case 9:
                    // Buscar pacientes por Id
                    System.out.println("\nAccediste a la opcion de buscar paciente por su Id: ");
                    System.out.print("Ingresa el Id del paciente: ");
                    scanner.nextLine();
                    String idPacienteBuscar = scanner.nextLine();
                    hospital.mostrarPacienteID(idPacienteBuscar);
                    break;
                case 10:
//                    mostrar medicos por el id
                    System.out.println("\nAccediste a la opcion de mostrar medicos por su Id");
                    System.out.print("Ingresa el Id del medico: ");
                    scanner.nextLine();
                    String idMedicoBuscar = scanner.nextLine();
                    hospital.mostrarMedicoID(idMedicoBuscar);
                    break;
                case 11:
//                    mostrarConsultorio por ID
                    System.out.println("\nAccediste a la opcion de mostrar consultorio por su Id");
                    System.out.print("Ingresa el Id del consultorio: ");
                    scanner.nextLine();
                    String idConsultorioBuscar = scanner.nextLine();
                    hospital.mostrarConsultorioID(idConsultorioBuscar);
                    break;
                case 12:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Numero no esta dentro de las opciones");
            }
        }
    }
}