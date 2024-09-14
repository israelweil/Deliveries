public class Curso {
//    atributos
    public String nombreCurso;
    public String codigoCurso;
    public String instructor;

//    constructor
    public Curso(String nombreCurso, String codigoCurso, String instructor) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.instructor = instructor;
    }

//    metodo para mostrar lo datos
    public void mostrarInfoCurso() {
        System.out.println("\n***INFORMACION DEL CURSO***");
        System.out.print("    Nombre del curso: " + this.getNombreCurso());
        System.out.print("    Codigo del curso: " + this.getCodigoCurso());
        System.out.print("    Instructor: " + this.getInstructor());
    }

    // getter y setter

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}

