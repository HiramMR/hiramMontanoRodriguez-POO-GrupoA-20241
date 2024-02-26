public class Empleado {

    double payment;
    double bonus;
    double extraHours;

    public Empleado(double payment, double bonus, double extraHours){
        this.payment = payment;
        this.bonus = bonus;
        this.extraHours = extraHours;
    }

    public double calcularSalario(){
        return payment;
    }

    public double calcularSalario(double bonus){
        return payment+bonus;
    }

    public double calcularSalario(double bonus, double extraHours){
        return payment+bonus+(extraHours*20);
    }
}