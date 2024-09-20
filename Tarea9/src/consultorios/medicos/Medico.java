package medicos;

import java.util.Random;

public class Medico {
    public int id;
    public String nombre;
    public String apellidos;
    public String fechaNacimiento;
    private String telefono;
    private String rfc;

    Random random = new Random();

    //constructor
    public Medico(String nombre, String apellidos, String fechaNacimiento, String telefono, String rfc) {
        this.id = this.random.nextInt(1,10001);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.rfc = rfc;
    }

    public String mostrarDatos() {
        return String.format("Id: %d, nombre: %s, apellidos: %s, fecha de nacimiento: %s, teléfono: %s, RFC: %s",
                id,
                nombre,
                apellidos,
                fechaNacimiento,
                telefono,
                rfc
        );
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRfc() {
        return rfc;
    }
}
