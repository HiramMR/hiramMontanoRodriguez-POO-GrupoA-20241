import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar todos los empleados y sus cuentas");
            System.out.println("3. Mostrar información de un empleado en específico");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    scanner.nextLine(); // Consumir la nueva línea después del número
                    String nombreEmpleado = scanner.nextLine();
                    Employee nuevoEmpleado = new Employee(nombreEmpleado);
                    
                    System.out.print("Ingrese la cantidad de cuentas bancarias del empleado: ");
                    int cantidadCuentas = scanner.nextInt();
                    for (int i = 0; i < cantidadCuentas; i++) {
                       
                        System.out.println("Ingrese el tipo de cuenta: ");
                        scanner.nextLine();
                        String tipoCuenta = scanner.nextLine();

                        System.out.print("Ingrese el número de cuenta " + (i + 1) + ": ");
                        int numeroCuenta = scanner.nextInt();

                        System.out.print("Ingrese el saldo de la cuenta " + (i + 1) + ": ");
                        double saldoCuenta = scanner.nextDouble();

                        BankAccount cuenta = new BankAccount(numeroCuenta, saldoCuenta,tipoCuenta);
                        if(tipoCuenta.equalsIgnoreCase("A")){
                            cuenta.depositA(tipoCuenta, saldoCuenta);
                    }else if(tipoCuenta.equals("B")){
                            cuenta.depositB(tipoCuenta, saldoCuenta);
                    }else if(tipoCuenta.equals("C")){
                            cuenta.depositC(tipoCuenta, saldoCuenta);
                    }else{
                            System.out.println("Tipo de cuenta incorrecta.");
                            System.exit(0);
                    }

                        nuevoEmpleado.agregarCuenta(cuenta);
                    }

                    banco.agregarEmpleado(nuevoEmpleado);
                    break;
                case 2:
                    System.out.println("Empleados y sus cuentas:");
                    for (Employee empleado : banco.getEmployees()) {
                        System.out.println("Nombre: " + empleado.getNombre());
                        for (BankAccount cuenta : empleado.getAccounts()) {
                            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
                            System.out.println("Saldo: " + cuenta.getSaldoCuenta());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del empleado: ");
                    scanner.nextLine(); // Consumir la nueva línea después del número
                    String nombre = scanner.nextLine();
                    boolean encontrado = false;
                    for (Employee empleado : banco.getEmployees()) {
                        if (empleado.getNombre().equals(nombre)) {
                            System.out.println("Empleado encontrado:");
                            System.out.println("Nombre: " + empleado.getNombre());
                            for (BankAccount cuenta : empleado.getAccounts()) {
                                System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
                                System.out.println("Saldo: " + cuenta.getSaldoCuenta());
                            }
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Fin.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
