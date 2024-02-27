import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);


        Producto producto = new Producto("iPhones", 5000);

System.out.println("Stock: "+ producto.getStock());
        System.out.println("Ingresa la cantidad a aumentar en el stock: ");
        int cantidad = read.nextInt();
        producto.aumentarStock(cantidad);
System.out.println("Stock nuevo: "+ producto.getStock());

        System.out.println("Ingresa la cantidad a reducir en el stock: ");
        cantidad = read.nextInt();
        producto.reducirStock(cantidad);
System.out.println("Stock nuevo: "+ producto.getStock());
System.out.println("Precio por pieza: "+ producto.getPrecio());
   
            
    }
}