import java.util.ArrayList;
import java.util.List;

public class StaffDirectory {

    public List<Employee> employees;

    public StaffDirectory() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployeesBySeniority(int seniority){
        List<Employee> result = new ArrayList<>();
        for (Employee employee: employees) {
            if(employee.seniority == seniority){
                result.add(employee);
            }
        }
        return result;
    }

    public List<String> getPhoneNumberByName(String name) {
        List<String> result = new ArrayList<>();
        for (Employee employee: employees) {
            if(employee.name.equals(name)){
                result.add(employee.phoneNumber);
            }
        }
        return result;
    }

    public Employee getEmployeeById(int ID) {
        for (Employee employee: employees) {
            if(employee.ID == ID){
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }



}
