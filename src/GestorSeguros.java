public class GestorSeguros {

    public GestorSeguros() {
        // Instancias de SeguroAuto
        SeguroAuto seguroAuto1 = new SeguroAuto("Juan Perez", 10000, 20);
        SeguroAuto seguroAuto2 = new SeguroAuto("Ana Gomez", 15000, 30);
        SeguroAuto seguroAuto3 = new SeguroAuto("Carlos Ruiz", 20000, 22);

        // Instancias de SeguroVida
        SeguroVida seguroVida1 = new SeguroVida("Maria Lopez", 50000, 65);
        SeguroVida seguroVida2 = new SeguroVida("Luis Fernandez", 75000, 55);
        SeguroVida seguroVida3 = new SeguroVida("Elena Martinez", 60000, 70);

        // Instancias de SeguroHogar
        SeguroHogar seguroHogar1 = new SeguroHogar("Pedro Sanchez", 100000, "zona de riesgo");
        SeguroHogar seguroHogar2 = new SeguroHogar("Laura Diaz", 120000, "zona segura");
        SeguroHogar seguroHogar3 = new SeguroHogar("Miguel Torres", 90000, "zona de riesgo");

        // Mostrar detalles de cada seguro
        seguroAuto1.detallesSeguro();
        seguroAuto2.detallesSeguro();
        seguroAuto3.detallesSeguro();

        seguroVida1.detallesSeguro();
        seguroVida2.detallesSeguro();
        seguroVida3.detallesSeguro();

        seguroHogar1.detallesSeguro();
        seguroHogar2.detallesSeguro();
        seguroHogar3.detallesSeguro();
    }
}