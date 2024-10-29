import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EnvioNacional envioNacional = new EnvioNacional(250.0, 12.0, 700);
        envioNacional.validarPeso();
        System.out.println(envioNacional.calcularTiempoYCostoEntrega());

        System.out.println("\n**\n");

        EnvioInternacional envioInternacional = new EnvioInternacional(820.0, 26.0, "Tailandia");
        envioInternacional.validarPeso();
        System.out.println(envioInternacional.calcularTiempoYCostoEntrega());

    }

}