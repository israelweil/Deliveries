public class SeguroHogar extends Seguro {
    private String zona;
    private double recargo = 0.0;

    public SeguroHogar(String nombreTitular, double valorAsegurado, String zona) {
        super(nombreTitular, valorAsegurado);
        this.zona = zona;
    }

    @Override
   public double calcularPrima() {
        zona = zona.toLowerCase();
        boolean zonaRiesgo;
        if (zona.contains("riesgo")) {
            zonaRiesgo = true;
        } else {
            zonaRiesgo = false;
        }
        double valorBase = 500;
        double prima = valorBase + super.getValorAsegurado() * 0.02;
        if (zonaRiesgo) {
            recargo = prima*0.2;
            prima = prima + recargo;
        }
        return prima;
    }

    @Override
    public void detallesSeguro() {
        if (zona.contains("riesgo")) {
            recargo = calcularPrima() * 0.2 / 1.2;
        }
        System.out.printf("""
                Seguro de hogar
                
                    Nombre del titular: %s
                    Valor asegurado: %.2f
                    Zona de la vivienda: %s
                    Recargo por la zona: %.2f
                    Prima calculada: %.2f
                
                
                *************       ****        *************
                """,
                getNombreTitular(),
                getValorAsegurado(),
                zona,
                recargo,
                calcularPrima());
    }
}