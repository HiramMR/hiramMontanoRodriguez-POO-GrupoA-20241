import java.util.ArrayList;
class Employee {
    private String nombre;
    private ArrayList<BankAccount> accounts;

    public Employee(String nombre) {
        this.nombre = nombre;
        this.accounts = new ArrayList<>();
    }

    public void agregarCuenta(BankAccount account) {
        accounts.add(account);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
}