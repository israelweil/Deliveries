import consultas.Consulta;
import consultorios.Consultorio;
import hospital.Hospital;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        Paciente paciente1 = new Paciente("P202491247952219","Jose Israel","Olvera Bucio", LocalDate.of(2005,04,19),"O+",'M',"4436431778");
        Medico medico1 = new Medico("M-ZE-3-2024-21843-1","Sofia","Zendejas Quintana",LocalDate.of(2007,01,23),"7861278729","1230");
        Consultorio consultorio1 = new Consultorio("C1302024240177",3,56);

        hospital.listaPacientes.add(paciente1);
        hospital.listaMedicos.add(medico1);
        hospital.listaConsultorios.add(consultorio1);
        while (true) {
            System.out.println("\n*** SISTEMA HOSPITAL*");
            System.out.println("\n** Menu **");
            System.out.println("1.- Registrar Pacientes");
            System.out.println("2.- Registrar Medicos");
            System.out.println("3.- Registrar Consultorio");
            System.out.println("4.- Registrar Consulta");
            System.out.println("5.- Mostrar Pacientes");
            System.out.println("6.- Mostrar Medicos");
            System.out.println("7.- Mostrar Consultas");
            System.out.println("8.- Mostrar Consultorio");
            System.out.println("9.- Buscar Paciente por Id");
            System.out.println("10. Buscar Medico por Id");
            System.out.println("11. Buscar Consultorio por Id");
            System.out.println("12. Salir");

            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--Seleccionaste la opción de registrar pacientes--");

                    String id = hospital.generarIdPaciente();

                    System.out.print("\nIngresa el nombre del paciente: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingresa el apellido: ");
                    String apellido = scanner.nextLine();

                    System.out.print("Ingresa el año de nacimiento del paciente: ");
                    int anio = scanner.nextInt();

                    System.out.print("Ingresa el mes de nacimiento del paciente: ");
                    int mes = scanner.nextInt();

                    System.out.print("Ingresa el día de nacimiento del paciente: ");
                    int dia = scanner.nextInt();

                    LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

                    System.out.print("Ingresa el tipo de sangre: ");
                    String tipoSangre = scanner.nextLine();

                    System.out.print("Ingresa el sexo: ");
                    String sexo2 = scanner.nextLine();
                    char sexo = sexo2.charAt(0);

                    System.out.print("Ingresa el numero de telefono: ");
                    String telefono = scanner.nextLine();

                    Paciente paciente = new Paciente(id, nombre, apellido, fechaNacimiento, tipoSangre, sexo, telefono);
                    hospital.registrarPacientes(paciente);

                    System.out.println("Paciente registrado exitosamente :D");
                    break;
                case 2:
                    System.out.println("\n--Seleccionaste la opción de registrar medicos--");

                    System.out.print("\nIngresa el nombre del medico: ");
                    String nombreMedico = scanner.nextLine();

                    System.out.print("Ingresa el apellido: ");
                    String apellidoMedico = scanner.nextLine();

                    System.out.print("Ingresa el año de nacimiento del médico: ");
                    int anioMedico = scanner.nextInt();

                    System.out.print("Ingresa el mes de nacimiento del médico: ");
                    int mesMedico = scanner.nextInt();

                    System.out.print("Ingresa el día de nacimiento del médico: ");
                    int diaMedico = scanner.nextInt();
                    scanner.nextLine();

                    LocalDate fechaNaciMedico = LocalDate.of(anioMedico, mesMedico, diaMedico);

                    System.out.print("Ingresa el telefono del medico: ");
                    String telMedico = scanner.nextLine();

                    System.out.print("Ingresa el rfc del medico: ");
                    String rfcMedico = scanner.nextLine();

                    String idMedico= hospital.generarIdMedico(apellidoMedico, String.valueOf(fechaNaciMedico.getYear()));

                    Medico medico=new Medico(idMedico,nombreMedico,apellidoMedico,fechaNaciMedico,telMedico,rfcMedico);
                    hospital.registrarMedico(medico);

                    System.out.println("Medico registrado exitosamente :D");
                    break;
                case 3:
                    System.out.println("\n--Seleccionaste la opción de registrar consultorio--");

                    String idConsultorio=hospital.generarIdConsultorio();

                    System.out.print("\nIngrese el piso del consultorio: ");
                    int pisoConsultorio =scanner.nextInt();

                    System.out.print("Ingrese el numero de consultorio: ");
                    int numeroConsultorio = scanner.nextInt();

                    Consultorio consultorio=new Consultorio(idConsultorio,pisoConsultorio,numeroConsultorio);
                    hospital.registrarConsultorio(consultorio);

                    System.out.println("Consultorio registrado exitosamente :D");
                    break;
                case 4:
                    //registrar consulta
                    System.out.println("\n Seleccionaste la opcion de registrar una consulta");
                    System.out.println("Ingresa el año de la consulta: ");
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
                    Paciente pacienteParaConsulta = hospital.obtenerPacientePorId(pacienteConsulta);


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
                    System.out.println("\n--Seleccionaste la opción de mostrar pacientes--");
                    hospital.mostrarPacientes();
                    break;
                case 6:
                    System.out.println("\n--Seleccionaste la opción de mostrar medicos--");
                    hospital.mostrarMedicos();
                    break;
                case 7:
                    System.out.println("\n--Seleccionaste la opción de mostrar consultas--");
                    hospital.mostrarConsultas();
                    return;
                case 8:
                    System.out.println("\n--Seleccionaste la opción de mostrar consultorios--");
                    hospital.mostrarConsultorio();
                    break;
                case 9:
                    System.out.println("\n--Seleccionaste la opción de buscar Paciente mediante la ID--");

                    System.out.println("\nIngresa el Id del paciente que deseas buscar");
                    String idPaciente = scanner.nextLine();

                    hospital.mostrarPacienteID(idPaciente);
                    break;
                case 10:
                    System.out.println("\n--Seleccionaste la opción de buscar medicos mediante la ID--");

                    System.out.println("Ingresa el Id del medico que deseas buscar: ");
                    String idMedico2 = scanner.nextLine();

                    hospital.mostrarMedicoPorId(idMedico2);
                    break;
                case 11:
                    System.out.println("\nAccediste a la opcion de mostrar consultorio por su Id");
                    System.out.print("Ingresa el Id del consultorio: ");
                    String idConsultorioBuscar = scanner.nextLine();
                    hospital.mostrarConsultorioID(idConsultorioBuscar);
                    break;
                case 12:
                    System.out.println("\n--Seleccionaste la opcion de salir--");
                    System.out.println("HASTA LUEGO");
                    return;
            }
        }
    }
}
// git ls-tree -r tarea11/unidad2 --name-only