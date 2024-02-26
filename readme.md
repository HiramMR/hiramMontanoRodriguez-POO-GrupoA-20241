# TAREAS POO
# Hiram Montaño-A
![](https://sgi-2018.tepexirguez.tecnm.mx/Imagenes/TecNM.jpg)

Se creó una clase llamada Rectangulo la cual puede calcular el área y el perimetro. Se consideró que el usuario puede ingresar enteros o doubles, por lo que se utilizó la sobrecarga de métodos para que existan funciones con el mismo nombre pero realicen una función diferente.

Se creó una clase Empleado y métodos llamados calcularSalario para poder calcular el salario de la persona.
El / Los métodos pueden recibir hasta 3 parámetros: sueldoBase, bonificación y horas extras.
Si el usuario manda por parámetro solo el sueldo, se retorna solo eso.
Si el usuario manda por parámetro sueldo y bonificación, se retorna sueldo + bonificación.
Si el usuario manda por parámetro sueldo, bonificación y horas extras, se retorna sueldo + bonificación + (horas * 20)
Todos los métodos deben de llamarse igual para usar la sobrecarga de métodos.

Se creó una clase llamada CalculadoraImpuestos que cuenta con un método llamado calcularImpuestos.
Este método puede recibir hasta 4 parámetros, ingresos (int), porcentajeImpuestos (double), dividendos (double) y exención (double).
Si el usuario manda solo los ingresos, se retorna ingresos + 0.15
Si el usuario manda ventas y porcentajeImpuesto se retorna ventas * (porcentajeImpuesto / 100)
Si el usuario manda dividendos, porcentajeImpuesto y exención.
-Se calculan los impuestos = dividendos * (porcentajeImpuesto / 100)
-Si los impuestos son mayores que la exención se retorna los impuestos menos la exención, sino se retorna 0.
