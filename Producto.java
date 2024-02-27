public class Producto {
    private String nombre;
    private float precio;
    private int stock;
    
    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre==null){
            System.out.println("El nombre no puede ser nulo!");
        }else{
            this.nombre = nombre;
        }
       
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if(stock<0){
            System.out.println("El precio no puede ser negativo");
        }else{
            this.precio= precio;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock<0){
            System.out.println("El stock no puede ser negativo");
        }else{
            this.stock = stock;
        }
    }

    public void aumentarStock(int cantidad){
       if(cantidad>0){
        stock =stock+cantidad;
        
       }else{
        System.out.println("No se pueden agregar 0 productos!");
       }
        
    }

    public void reducirStock(int cantidad){
        if(cantidad>0 && cantidad <=stock){
         stock =stock-cantidad;
        
        }else{
         System.out.println("No se puede reducir el stock en 0 o reducir más de lo almacenado.");
        }
         
     }
}
