public abstract class Seguro {
    private String nombreTitular;
    private double valorAsegurado;

    public Seguro(String nombreTitular, double valorAsegurado) {
        this.nombreTitular = nombreTitular;
        this.valorAsegurado = valorAsegurado;
    }

    public abstract double calcularPrima();

    public abstract void detallesSeguro();

    public String getNombreTitular() {
        return nombreTitular;
    }
    public double getValorAsegurado() {
        return valorAsegurado;
    }
}
