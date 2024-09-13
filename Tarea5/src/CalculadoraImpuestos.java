public class CalculadoraImpuestos {
    public int ingresos;
    public double porcentajeImpuestos;
    public double dividendos;
    public double exencion;

//    metodo constructor
    public CalculadoraImpuestos(int ingresos, double porcentajeImpuestos, double dividendos, double exencion){
        this.ingresos = ingresos;
        this.porcentajeImpuestos = porcentajeImpuestos;
        this.dividendos = dividendos;
        this.exencion = exencion;
    }

    public int calcularImpuestos(int ingreso){
        return (int)(ingreso + 0.15);
    }
    public double calcularImpuestos(int ingresos, double porcentajeImpuestos){
        return ingresos * (porcentajeImpuestos / 100);
    }
    public double calcularImpuestos(double dividendos, double porcentajeImpuestos, double exencion) {
        double resultado;
        double impuesto;
        impuesto = dividendos * (porcentajeImpuestos / 100);
        if (impuesto > exencion) {
            resultado = impuesto - exencion;
        } else {
            resultado = 0;
        }
        return resultado;
    }

    public String mostrarImpuestos() {
        return String.format("Ingresos: %d, Porcentaje de Impuestos: %.2f, Dividendos: %.2f, Exencion: %.2f",
                ingresos,
                porcentajeImpuestos,
                dividendos,
                exencion);
    }


    public int getIngresos() {
        return ingresos;
    }

    public double getPorcentajeImpuestos() {
        return porcentajeImpuestos;
    }

    public double getDividendos() {
        return dividendos;
    }

    public double getExencion() {
        return exencion;
    }
}
