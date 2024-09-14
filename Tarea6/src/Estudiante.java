import java.util.ArrayList;
import java.util.Random;

public class Estudiante {
//    atributos
    public String nombre;
    public String idEstudiante;
    public  ArrayList<Curso> cursos;

    Random ran = new Random();

//    constructor
    public Estudiante(String nombre, String idEstudiante) {
        this.nombre = nombre;
        this.idEstudiante = idEstudiante;
        this.cursos = new ArrayList<Curso>();
    }

//    metodo agregar curso
    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }
    public void mostrarInformacion() {

        System.out.println("    Nombre del estudiante: " + this.getNombre());
        System.out.println("            Id del estudiante: " + this.getIdEstudiante());
        System.out.println("        Cursos: ");
        for (Curso curso : this.getCursos()) {
            System.out.print("           Nombre del curso: " + curso.getNombreCurso());
            System.out.print("           Codigo del curso: " + curso.getCodigoCurso());
            System.out.print("           Instructor: " + curso.getInstructor());
        System.out.println("");
        }
    }

//    getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
}
