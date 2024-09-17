import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

    Scanner scanner = new Scanner(System.in);
    public ArrayList<Producto> listaPoductos = new ArrayList<Producto>();

    public void registrarProducto(Producto producto){
        this.listaPoductos.add(producto);
        System.out.println("Se registro un nuevo Producto");
    }

    public void eliminarProducto(int idProductoEliminar) {
        int longitudOrignal = this.listaPoductos.size();

        this.listaPoductos.removeIf((producto -> producto.getId() == idProductoEliminar));

        if (longitudOrignal != this.listaPoductos.size()){
            System.out.println("\nSe elimino el producto con el ID: " + idProductoEliminar);
        } else {
            System.out.println("\nNo existe el producto con el ID: " + idProductoEliminar);
        }
    }

    public void mostrarProductos() {
        System.out.println("\n** PRODUCTOS EN EL SISTEMA **");

        if (this.listaPoductos.isEmpty()){
            System.out.println("\nNo esxiste productos registrados");
        } else {

            for (Producto producto : this.listaPoductos) {
                System.out.println(producto.mostrarProductos());
            }

        }

    }

    public void modificarStock(int idProducModifStock, int cantidad, int opcion) {
        switch (opcion) {
            case 1:
                for (Producto producto : this.listaPoductos) {
                    if (idProducModifStock == producto.getId()) {
                        producto.aumentarStock(cantidad);
                        System.out.println("Se aumento el stock del producto con el ID " + idProducModifStock);
                    } else {
                        System.out.println("No existe el producto con el ID " + idProducModifStock);
                    }
                }
                break;
            case 2:
                for (Producto producto : this.listaPoductos) {
                    if (idProducModifStock == producto.getId()) {
                        producto.reducirStock(cantidad);
                        System.out.println("Se reducido el stock del producto con el ID " + idProducModifStock);
                    } else {
                        System.out.println("No existe el producto con el ID " + idProducModifStock);
                    }
                }
                break;
            default:
                System.out.println("Opción invalida");
                break;
        }
    }

}