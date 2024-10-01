package hospital;

import consultas.Consulta;
import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Hospital {
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public ArrayList<Medico> listaMedicos = new ArrayList<>();
    public ArrayList<Consulta> listaConsultas = new ArrayList<>();
    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();
    private ValidadorHospital validador = new ValidadorHospital();



    Random random = new Random();

//    metodos
    public void registrarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico) {
        this.listaMedicos.add(medico);
    }

    public void registrarConsulta(Consulta consulta) {
        // paciente no tenga consulta en esa fecha

        if(!validador.validarDispolnibilidadEnFechaConsulta(consulta.getFechaHora().toString(),consulta.getConsultorio().getNumeroConsultorio(), this.listaConsultas)){
            System.out.println("Ya existe una consulta registrada para esa fecha");
            return;
        }
        /**
         * 1. No existe una consulta en la fecha indicafa en el consultorio indicado
         * 2. Fecha valida
         * 3. Medico no tenga una consulta en esa fecha en otro consultorio
         * 4. Paciente no tenga una consulta en esa fecha
         */

        if(!validador.validarDisponibilidadMedico(consulta.getFechaHora().toString(),consulta.getMedico().getId(),this.listaConsultas)){
            System.out.println("El medico no tiene disponibilidad en esa fecha");
            return;
        }

        this.listaConsultas.add(consulta);
    }



    public void registrarConsultorio(Consultorio consultorio) {
        this.listaConsultorios.add(consultorio);
    }

//    metods para mostrar datos
    public void mostrarPacientes() {
        System.out.println("\n** Pacientes del Hospital **");
        for (Paciente paciente : this.listaPacientes) {
            System.out.println(paciente.mostrarDatos());
        }
    }
    public void mostrarMedicos() {
        for(Medico medico : this.listaMedicos) {
            System.out.println(medico.mostrarDatos());
        }
    }
    public void mostrarConsultorio() {
        for(Consultorio consultorio : this.listaConsultorios) {
            System.out.println(consultorio.mostrarDatos());
        }
    }
    public void mostrarConsultas() {
        for(Consulta consulta : this.listaConsultas) {
            System.out.println(consulta.mostrarDatos());
        }
    }


//    metodo para generar el id del medico
    public String generarIdMedico(String apellido, String fechaNacimiento) {
        LocalDate fecha = LocalDate.now();
        Random random = new Random();
        String ap = apellido.substring(0, 2).toUpperCase();
        char ultimoDigito = fechaNacimiento.charAt(fechaNacimiento.length()-1);
        int yearActual = fecha.getYear();
        int aleatorio = random.nextInt(51,70001);
        int lista = listaMedicos.size()+1;
        return String.format("M-%s-%s-%d-%d-%d",
                ap,
                ultimoDigito,
                yearActual,
                aleatorio,
                lista);
    }

//    metodo para generar el id del paciente
    public String generarIdPaciente() {
        Random random = new Random();
        LocalDate fecha = LocalDate.now();
        int anioActual = fecha.getYear();
        int mesActual = fecha.getMonthValue();
        int longitudPacienteMasUno = this.listaPacientes.size()+1;
        int numeroAleatorio = random.nextInt();

        return String.format("P%d%d%d%d", anioActual, mesActual, longitudPacienteMasUno, numeroAleatorio);
    }

//    metodo para generar el id del consultorio
    public String generarIdConsultorio(){
        //C-{longitud de la lista de consultorios + 1}-{dia actual}-{año actual}-{numero aleatorio entre 1 y 500000}
        LocalDate fecha = LocalDate.now();
        int anioActual = fecha.getYear();
        int diaActual = fecha.getDayOfMonth();
        int longitudConsultorio = this.listaConsultorios.size() + 1;
        int NumAleatorio = random.nextInt(500000);
        return String.format("C%d%d%d%d",longitudConsultorio,diaActual,anioActual,NumAleatorio);
    }


//    metodos para buscar pacientes por id
    public Paciente obtenerPacienteporId(String idPaciente) {
        return listaPacientes.stream().filter(p -> p.getId().equals(idPaciente)).findFirst().orElse(null);
    }

    public void mostrarPacienteID(String idPaciente) {
        Paciente paciente = obtenerPacienteporId(idPaciente);
        if (paciente != null) {
            System.out.println("✓    -Paciente encontrado-     ✓");
            System.out.println(paciente.mostrarDatos());
        } else {
            System.out.println("No se encontro el paciente");
        }
    }

//    metodos para buscar al medico por su id
    public Medico obtenerMedicoPorId(String idMedico) {
        return listaMedicos.stream().filter(m -> m.getId().equals(idMedico)).findFirst().orElse(null);
    }

    public void mostrarMedicoID(String medicoID) {
        Medico medico = obtenerMedicoPorId(medicoID);
        if (medico != null) {
            System.out.println("✓    -Medico encontrado-     ✓");
            System.out.println(medico.mostrarDatos());
        } else {
            System.out.println("No se encontro el medico");
        }
    }


//    mostrar consultorio por Id
    public Consultorio obtenerConsultorioPorId(String idConsultorio) {
        return listaConsultorios.stream().filter(c -> c.getId().equals(idConsultorio)).findFirst().orElse(null);
    }

    public void mostrarConsultorioID(String idConsultorio) {
        Consultorio consultorio = obtenerConsultorioPorId(idConsultorio);

        if (consultorio!= null) {
            System.out.println("✓    -Consultorio encontrado-     ✓");
            System.out.println(consultorio.mostrarDatos());
        } else {
            System.out.println("No se encontro el consultorio");

        }
    }

//    metodos privados

}

