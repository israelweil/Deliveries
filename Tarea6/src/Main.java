//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java", "1Q2M3", "Juan Mendez");
        Curso curso2 = new Curso("Python", "1Y4T3", "Porfirio Santino");
        Curso curso3 = new Curso("Lenguajes Automatas", "1R4B3", "Evelio Fernandez");

        Estudiante estudiante = new Estudiante("Antonio Lopez", "12r3j4");
        Estudiante estudiante2 = new Estudiante("Paloma Toscano", "62u1z3");


        estudiante.agregarCurso(curso3);
        estudiante.agregarCurso(curso2);
        estudiante2.agregarCurso(curso);
        estudiante2.agregarCurso(curso2);

        System.out.println("\n***INFORMACION DE ESTUDIANTES***");
        estudiante.mostrarInformacion();
        estudiante2.mostrarInformacion();
    }
}