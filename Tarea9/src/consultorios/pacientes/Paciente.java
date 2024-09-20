package pacientes;

import java.util.Random;

public class Paciente {
    public int id;
    public String nombre;
    public String apellidos;
    public String fechaNacimiento;
    public String tipoSangre;
    public char sexo;
    private String telefono;

    Random random = new Random();
//constructor
    public Paciente(String nombre, String apellidos, String fechaNacimiento, String tipoSangre, char sexo, String telefono) {
        this.id = this.random.nextInt(1,10001);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    public String mostrarDatos() {
        return String.format("Id: %d, nombre: %s, apellidos: %s, fecha de nacimiento: %s, tipo de sangre: %s, sexo: %c, teléfono: %s",
                id,
                nombre,
                apellidos,
                fechaNacimiento,
                tipoSangre,
                sexo,
                telefono
        );
    }
}
