public class EnvioNacional extends Envio{
    private int distanciaKm;
    private double costoAdicional;
    private int entrega;

    public EnvioNacional(double costoBase, double peso, int distanciaKm) {
        super(costoBase, peso);
        this.distanciaKm = distanciaKm;
    }

    @Override
    public String calcularTiempoYCostoEntrega() {
        if (super.getPeso() > 5) {
            costoAdicional = super.getCostoBase() * 0.05;
        }

        entrega = (int) distanciaKm / 200;

        return String.format("""
                        - Envio Nacional -\s
                        Costo Total: %f\s
                        Tiempo de Entrega: %d día/s""",
                (super.getCostoBase() + costoAdicional),
                entrega);
    }
}