package consultorios;

public class Consultorio {
    public int id;
    public int piso;
    public int numeroConsultorio;


//    constructor

    public Consultorio(int id, int piso, int numeroConsultorio) {
        this.id = id;
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
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
