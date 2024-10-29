import java.time.LocalDate;

public class PagoTarjeta extends Pago{
    private LocalDate fechaVencimientoTarjeta;
    private String numeroTarjeta;

    public PagoTarjeta(int monto, LocalDate fechaVencimientoTarjeta, String numeroTarjeta) {
        super(monto);
        this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        validarPago();
        if (fechaVencimientoTarjeta.isBefore(LocalDate.now())) {
            System.out.println("No se pudo procesar el pago, tarjeta vencida");
        } else {
            System.out.println("Pago completado");
            System.out.println("Monto: " + super.getMonto() * obtenerDescuento(super.getMonto()));
            System.out.println("Numero de tarjeta: " + numeroTarjeta);
        }
    }

    @Override
    public Double obtenerDescuento(int monto) {
        if (fechaVencimientoTarjeta.isAfter(LocalDate.of(2030, 1, 1))) {
            return 0.5;

        } else if (fechaVencimientoTarjeta.isBefore(LocalDate.of(2028, 1, 1))) {
            if (numeroTarjeta.contains("999")) {
                return 0.8;
            } else {
                return 0.3;
            }
        } else {
            return 0.1;
        }
    }
}
