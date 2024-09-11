public class Coche {
    public String marca;
    public String modelo;
    public int year;
    public int yearActual = 2024;

    public Coche() {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
    }
    public int calcularEdadDelCoche(int year) {
        year = yearActual;
        int edad = year - this.year;
        return edad;
    }
    public void mostrarDatos() {
        System.out.println("\n Marca: " + this.marca  +
                "   Modelo: " + this.modelo +
                "   Año: " + this.year);
        System.out.println("    Edad del coche: " + calcularEdadDelCoche(year) + " años");
    }

}
