class BankAccount {
    private int numeroCuenta;
    private double saldoCuenta;
    private String tipoCuenta; 

    public BankAccount(int numeroCuenta, double saldoCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }


    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public String getTipoCuenta(){
        return tipoCuenta;
    }

    public void depositA (String tipoCuenta, double saldoCuenta){
        if(tipoCuenta.equalsIgnoreCase("A")){

            if(saldoCuenta>50000){
                System.out.println("No se puede depositar más de 50,000 en una cuenta de tipo A");
                setSaldoCuenta(0);
            }else{
                setSaldoCuenta(saldoCuenta);
            }
        }
    }

    public void depositB (String tipoCuenta, double saldoCuenta){
        if(tipoCuenta.equalsIgnoreCase("B")){

            if(saldoCuenta>100000){
                System.out.println("No se puede depositar más de 100,000 en una cuenta de tipo B");
                setSaldoCuenta(0);
            }else{
                setSaldoCuenta(saldoCuenta);
            }
        }
    }

    
    public void depositC (String tipoCuenta, double saldoCuenta){
        if(tipoCuenta.equalsIgnoreCase("C")){
                setSaldoCuenta(saldoCuenta);
            
        }
    }
}