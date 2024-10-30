public class SeguroAuto extends Seguro{
    private int aniosTitular;
    private double recargo = 0.0;

    public SeguroAuto(String nombreTitular, double valorAsegurado, int aniosTitular) {
        super(nombreTitular, valorAsegurado);
        this.aniosTitular = aniosTitular;
    }

    @Override
    public double calcularPrima() {
        double valorBase = 300;
        double  prima = valorBase + super.getValorAsegurado() * 0.05;
        if (aniosTitular < 25) {
            recargo  = prima * 0.15;
            prima  = prima + recargo;
        }
        return prima;
    }



    @Override
    public void detallesSeguro() {
        if(aniosTitular < 25) {
            recargo  = calcularPrima() * 0.15 / 1.15 ;
        }
        System.out.printf("""
                Seguro de auto
                    Nombre del titular: %s
                    Valor asegurado: %.2f
                    Años como titular: %d
                    Recargo por Años como titular: %.2f
                    Prima calculada: %.2f
                
                
                *************       ****        *************
                """,
                getNombreTitular(),
                getValorAsegurado(),
                aniosTitular,
                this.recargo,
                calcularPrima());
    }

    public int getEdadTitular() {
        return aniosTitular;
    }
}
