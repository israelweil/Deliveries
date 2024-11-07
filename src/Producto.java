import java.util.ArrayList;

public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;

    ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double calcularValorTotal() {
        return cantidad * precio;
    }

    public void mostrarDetalles() {
        System.out.println("---    Inventario    ---");
        for (Producto producto : this.listaProductos) {

            System.out.printf("\n\nNombre: %s\nCantidad: %d\nPrecio: %.2f\n",
                    producto.getNombre(),
                    producto.getCantidad(),
                    producto.getPrecio());
            }
        System.out.println("\n");
    }
    public void agregarProducto(Producto producto) {
        this.listaProductos.add(producto);
        System.out.println("Producto agregado correctamente");
    }










    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
}
