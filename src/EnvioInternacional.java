public class EnvioInternacional extends Envio{
    private double costoAdicional;
    private int entrega = 10;
    private String pais;

    public EnvioInternacional(double costoBase, double peso, String pais) {
        super(costoBase, peso);
        this.pais = pais;
    }

    @Override
    public String calcularTiempoYCostoEntrega() {
        if (super.getPeso() > 10) {
            entrega += 3;
        }

        costoAdicional = super.getCostoBase() * 0.20;

        return String.format("""
                        - Envio Internacional - \s
                        Costo Total: %f \s
                        Lugar de entrega: %s \s
                        Tiempo de Entrega: %d día/s""",
                (super.getCostoBase() + costoAdicional),
                pais,
                entrega);
    }
}