
public class Main {

    public static void main(String[] args) {
        StaffDirectory staffDirectory = new StaffDirectory();

        Employee employee1 = new Employee(1, "123", "Oleg", 10);
        Employee employee2 = new Employee(2, "234", "Igor", 5);
        Employee employee3 = new Employee(3, "345", "Andrey", 20);
        Employee employee4 = new Employee(4, "456", "Slava", 25);

        staffDirectory.addEmployee(employee1);
        staffDirectory.addEmployee(employee2);
        staffDirectory.addEmployee(employee3);
        staffDirectory.addEmployee(employee4);

        System.out.println(staffDirectory.getEmployeesBySeniority(10));
        System.out.println(staffDirectory.getPhoneNumberByName("Oleg"));
        System.out.println(staffDirectory.getEmployeeById(3));

    }
}
