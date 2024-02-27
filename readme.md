# TAREAS POO
# Hiram Montaño-A
![](https://sgi-2018.tepexirguez.tecnm.mx/Imagenes/TecNM.jpg)

Se creó una clase llamada Producto que representa un artículo en un inventario. La clase tiene los atributos privados:
-Nombre. Una cadena que representa el nombre del producto
-Precio. Un número de punto flotante que representa el precio del producto
-Stock. Un número entero que representa la cantidad de existencias disponibles del producto.

Se proporcionan los métodos:
1.- Constructores:
    Un constructor con 3 parámetros (Nombre, precio y stock) para inicializar todos los atributos del producto.
    Un constructor que toma dos parámetros(Nombre y precio) y establece el stock en 0 por defecto.

2.- Getters y Setters:
    getNombre() y setNombre()
    getPrecio() y setPrecio()
    getStock() y setStock()

3.- Métodos adicionales:
    aumentarStock(int cantidad): Aumenta el stock del producto en la cantidad especificada, con validación para asegurarse que la cantidad sea mayor que 0.
    reducirStock(int cantidad): Reduce el stock del producto en la cantidad especificada, con validación para asegurarse de que la cantidad sea mayor que cero y menor o igual al stock actual.

Además, se utilizaron las siguientes validaciones en los setters:
    El precio y el stock no pueden ser negativos.
    El nombre no puede ser nulo.
    La cantidad a reducir del stock debe ser menor o igual al stock actual.