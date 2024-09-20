package consultas;

import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.util.Random;

public class Consulta {
    public int id;
    public String fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;

    Random random = new Random();

//    constructor
    public Consulta(int id, String fechaHora, Paciente paciente, Medico medico, Consultorio consultorio) {
        this.id = this.random.nextInt(1,10001);
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }



//    getter

    public int getId() {
        return id;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }
}

