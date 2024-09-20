package hospital;

import consultas.Consulta;
import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.util.ArrayList;

public class Hospital {
    public ArrayList<Paciente> listaPacientes = new ArrayList<>();
    public ArrayList<Medico> listaMedicos = new ArrayList<>();
    public ArrayList<Consulta> listaConsultas = new ArrayList<>();
    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();
    private ValidadorHospital validador = new ValidadorHospital();

//    metodos
    public void registrarPaciente(Paciente paciente) {
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico) {
        this.listaMedicos.add(medico);
    }

    public void registrarConsulta(Consulta consulta) {
        // paciente no tenga consulta en esa fecha

        if(!validador.validarDispolnibilidadEnFechaConsulta(consulta.getFechaHora(),consulta.getConsultorio().getNumeroConsultorio(), this.listaConsultas)){
            System.out.println("Ya existe una consulta registrada par esa fecha");
            return;
        }


        /**
         * 1. No existe una consulta en la fecha indicafa en el consultorio indicado
         * 2. Fecha valida
         * 3. Medico no tenga una consulta en esa fecha en otro consultorio
         * 4. Paciente no tenga una consulta en esa fecha
         */

        if(!validador.validarDisponibilidadMedico(consulta.getFechaHora(),consulta.getMedico().getId(),this.listaConsultas)){
            System.out.println("El medico no tiene disponibilidad en esa fecha");
            return;
        }

        this.listaConsultas.add(consulta);
    }



    public void registrarConsultorio(Consultorio consultorio) {
        this.listaConsultorios.add(consultorio);
    }

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

//    metodos privados



}

