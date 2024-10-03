import consultas.Consulta;
import consultorios.Consultorio;
import hospital.Hospital;
import medicos.Medico;
import menu.Menu;
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

        Menu menu = new Menu();
        menu.login();
    }
}