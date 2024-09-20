package hospital;

import consultas.Consulta;

import java.util.ArrayList;

public class ValidadorHospital {

    public boolean validarDispolnibilidadEnFechaConsulta(String fechaDeseada, int numeroConsultorio, ArrayList<Consulta> listaConsultas) {
        for(Consulta consulta : listaConsultas) {
            if(consulta.getFechaHora().equalsIgnoreCase(fechaDeseada) && numeroConsultorio == consulta.getConsultorio().getNumeroConsultorio()) {
                return false;
            }
        }
        return true;
    }

    public boolean validarDisponibilidadMedico(String FechaDeseada, int idMedico, ArrayList<Consulta> listaConsultas) {
        for(Consulta consulta : listaConsultas) {
            if(consulta.getFechaHora().equalsIgnoreCase(FechaDeseada) && consulta.getMedico().getId() == idMedico) {
                return false;
            }
        }
        return true;
    }
}
