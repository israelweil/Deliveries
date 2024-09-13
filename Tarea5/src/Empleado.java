public class Empleado {
    public double sueldoBase;
    public double bonificacion;
    public double horasExtra;

    public Empleado(double sueldoBase, double bonificacion, double horasExtra) {
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
        this.horasExtra = horasExtra;
    }
    public String mostrarDatos() {
        return String.format("Sueldo: %.2f, Bonificacion: %.2f, Horas Extra: %.2f",
                sueldoBase,
                bonificacion,
                horasExtra);
    }
    public double calcularSalario(double sueldoBase) {
        return sueldoBase;
    }
    public double calcularSalario(double sueldoBase, double bonificacion) {
        return sueldoBase + bonificacion;
    }
    public double calcularSalario(double sueldoBase, double bonificacion, double horasExtra) {
        return sueldoBase + bonificacion + horasExtra*20;
    }

}
