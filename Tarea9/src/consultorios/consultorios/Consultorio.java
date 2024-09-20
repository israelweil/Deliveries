package consultorios;

import java.util.Random;

public class Consultorio {
    public int id;
    public int piso;
    public int numeroConsultorio;

    Random random = new Random();

//    constructor

    public Consultorio(int piso, int numeroConsultorio) {
        this.id = this.random.nextInt(1,10001);
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }

    public String mostrarDatos(){
        return String.format("Id: %d, Piso: %d, Numero de Consultorio: %d",
                id,
                piso,
                numeroConsultorio);
    }

//    getter

    public int getId() {
        return id;
    }

    public int getPiso() {
        return piso;
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }
}
