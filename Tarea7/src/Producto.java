import java.util.Random;

public class Producto {

    private int id;
    private String nombre;
    private Double precio;
    private int stock;
    public Random random = new Random();

    public Producto(String nombre, Double precio, int stock) {
        this.id = this.random.nextInt(1,100001);
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String nombre, Double precio) {
        this.id = this.random.nextInt(1,100001);
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 0;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) throw new IllegalArgumentException("El nombre no puede ser vacio o nulo");
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        if (precio < 0) throw new IllegalArgumentException("El precio no puede ser negativo");
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("El stock no puede ser negativo");
        this.stock = stock;
    }

    public void aumentarStock(int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        setStock(stock + cantidad);
    }

    public void reducirStock(int cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("La cantidad a reducir debe ser mayor a cero");
        if (cantidad > stock) throw new IllegalArgumentException("La cantidad a reducir no puede ser mayor al stock actual");
        setStock(stock - cantidad);
    }

    public String mostrarProductos() {
        return String.format("ID: %d  |  Nombre: %s  |  Precio: %f  |  Stock: %d",
                getId(),
                getNombre(),
                getPrecio(),
                getStock());
    }

}