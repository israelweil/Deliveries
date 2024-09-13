public class Rectangulo {
    public int base;
    public int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public int calcularArea() {
        return this.base * this.altura;
    }
    public int calcularPerimetro() {
        return this.base * 2 + this.altura * 2;
    }
    public double calcularArea(double base, double altura) {
        return base * altura;
    }
    public double calcularPerimetro(double base, double altura) {
        return base * 2 + altura * 2;
    }


    // GETTERS
    public int getBase() {
        return base;
    }
    public int getAltura() {
        return altura;
    }
}
