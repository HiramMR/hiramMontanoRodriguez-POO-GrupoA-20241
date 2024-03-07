import java.util.ArrayList;
class Banco {
    private ArrayList<Employee> employees;

    public Banco() {
        this.employees = new ArrayList<>();
    }

    public void agregarEmpleado(Employee employee) {
        employees.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
