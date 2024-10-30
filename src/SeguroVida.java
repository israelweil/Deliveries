public class SeguroVida extends Seguro {
    private int edadTitular;
    private double recargo = 0.0;

    public SeguroVida(String nombreTitular, double valorAsegurado, int edadTitular) {
        super(nombreTitular, valorAsegurado);
        this.edadTitular = edadTitular;
    }

    @Override
    public double calcularPrima() {
        double valorBase = 400;
        double prima = valorBase + super.getValorAsegurado()*0.015;
        if(edadTitular > 60) {
            recargo = prima * 0.25;
            prima = prima  + recargo;
        }
        return prima;
    }

    @Override
    public void detallesSeguro() {
        if(edadTitular > 60) {
            recargo = calcularPrima() * 0.25 / 1.25;
        }
        System.out.printf("""
                Seguro de vida
                
                    Nombre del titular: %s
                    Valor asegurado: %.2f
                    Edad del titular: %d
                    Recargo por edad: %.2f
                    Prima calculada: %.2f
                
                *************       ****        *************
                """,
                getNombreTitular(),
                getValorAsegurado(),
                edadTitular,
                recargo,
                calcularPrima());
    }
}
