public class PagoPaypal extends Pago{
    private String numeroDeCuenta;
    private String email;

    public PagoPaypal(int monto, String numeroDeCuenta, String email) {
        super(monto);
        this.numeroDeCuenta = numeroDeCuenta;
        this.email = email;
    }

    @Override
    public void procesarPago() {
        validarPago();
        if (!email.contains("@")) {
            System.out.println("Correo invalido");
        } else {
            System.out.println("Pago completado");
            System.out.println("Monto: " + super.getMonto() * obtenerDescuento(super.getMonto()));
            System.out.println("Correo del usuario: " + email);
            System.out.println("Numero de cuenta: " + numeroDeCuenta);
        }
    }

    @Override
    public Double obtenerDescuento(int monto) {
        if (monto > 100) {
            if (numeroDeCuenta.contains("001")) {
                return 1.0;
            }
        }
        return 0.2;
    }
}
