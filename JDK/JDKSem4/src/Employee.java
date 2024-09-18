

public class Employee {

    public int ID; // табельный номер
    public String phoneNumber; // телефонный номер
    public String name; // имя сотрудника
    public int seniority; // стаж сотрудника

    public Employee(int ID, String phoneNumber, String name, int seniority) {
        this.ID = ID;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", seniority=" + seniority +
                '}';
    }
}
