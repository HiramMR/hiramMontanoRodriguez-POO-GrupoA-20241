import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
System.out.println("********** Rectangle Area & Perimeter calculator **********");
        System.out.println("Enter the rectangle's base: ");
        Double base = leer.nextDouble();
        System.out.println("Enter the rectangle's height: ");
        Double height = leer.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, height);

        System.out.println("Rectangle's Area: "+rectangulo.Area());
        System.out.println("Rectangle's perimeter: "+rectangulo.Perim()+"\n");
///////////////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println("********** Employee's Salary Calculator **********");
        System.out.println("Employee's salary: ");
        double salary = leer.nextDouble();
        System.out.println("Enter the employee's bonus payment: ");
        double bonus = leer.nextDouble();
        System.out.println("Enter the employee's extra hours: ");
        double extraHours = leer.nextDouble();

        Empleado empleado = new Empleado(salary,bonus,extraHours);
        
        System.out.println("Employee's Total Salary: "+empleado.calcularSalario(bonus,extraHours));
///////////////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println("********** Taxes Calculator **********");
        System.out.println("Enter income: ");
        int incomes = leer.nextInt();
        System.out.println("Enter taxPorcentage: ");
        double taxPorcent = leer.nextDouble();
        System.out.println("Enter dividend: ");
        double dividend = leer.nextDouble();
        System.out.println("Enter excemption: ");
        double excemption = leer.nextDouble();
        CalculadoraImpuestos calculadora = new CalculadoraImpuestos(incomes,taxPorcent,dividend,excemption);
        
        System.out.println(calculadora.calcularImpuestos(taxPorcent, dividend, excemption));
    }
    
}