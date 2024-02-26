public class CalculadoraImpuestos {
    
    int incomes;
    double taxPorcent;
    double dividend;
    double excemption;

    public CalculadoraImpuestos(int incomes, double taxPorcent, double dividend, double excemption){
        this.incomes = incomes;
        this.taxPorcent = taxPorcent;
        this.dividend = dividend;
        this.excemption = excemption;

    }

    public double calcularImpuestos(){
        return incomes+0.15;
    }

    public double calcularImpuestos(double taxPorcent){
        return incomes*(taxPorcent/100);
    }

    public double calcularImpuestos(double taxPorcent, double dividend, double excemption){
        double taxes = dividend* (taxPorcent/100);
        if(taxes>excemption){
            return taxes-excemption;
        }else{
            System.out.println("There's no taxes");
            return 0;
        }
    }
}
