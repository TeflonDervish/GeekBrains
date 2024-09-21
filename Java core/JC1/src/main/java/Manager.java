

public class Manager extends Employee {

    public static void raiseSalary(Employee[] employees, double amount) {
        for (Employee employee : employees) {
            employee.raiseSalary(amount);
        }
    }
}
