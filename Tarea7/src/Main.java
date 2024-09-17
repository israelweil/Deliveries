import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion = 0;

        while(true){
            System.out.println("\n*** BIENVENIDO ***");
            System.out.println("1.- Registrar Productos");
            System.out.println("2.- Eliminar Producto");
            System.out.println("3.- Mostrar Productos");
            System.out.println("4.- Cambiar Stock De Producto");
            System.out.println("5.- Salir");

            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion){

                case 1:
                    System.out.println("\nSeleccionaste la opción para registrar un producto");

                    System.out.print("\nIngresa el Nombre del producto: ");
                    String nombre = scanner.nextLine();

                    scanner.nextLine();

                    System.out.print("\nIngresa el Precio del producto: ");
                    Double precio = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.print("Quieres poner stock ( Si: 1 ): ");
                    int band = scanner.nextInt();
                    if (band == 1){
                        System.out.print("\nIngresa el Stock del producto: ");
                        int stock = scanner.nextInt();

                        Producto producto = new Producto(nombre, precio, stock);
                        inventario.registrarProducto(producto);
                    } else {
                        Producto producto = new Producto(nombre, precio);
                        inventario.registrarProducto(producto);
                    }

                    break;

                case 2:
                    System.out.println("\nSeleccionaste la opción para eliminar un producto");

                    System.out.print("\nIngresa el ID del producto:");
                    int id = scanner.nextInt();

                    inventario.eliminarProducto(id);

                    break;

                case 3:
                    inventario.mostrarProductos();
                    break;

                case 4:
                    System.out.println("\nSeleccionaste la opción para modificar el stock de un producto");

                    System.out.println("Quieres aumentar o reducir el stock del producto");
                    System.out.println("1.- Aumentar stock");
                    System.out.println("2.- Redicur stock ");
                    System.out.print("Selecciona una opción: ");
                    int op = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Dame el ID del producto: ");
                    int idProducto = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Dame la cantidad: ");
                    int cantidad = scanner.nextInt();

                    scanner.nextLine();

                    inventario.modificarStock(idProducto, cantidad, op);
                    break;

                case 5:
                    System.out.println("\nAdios");
                    return;
            }
        }
    }
}