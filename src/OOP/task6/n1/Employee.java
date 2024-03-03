package OOP.task6.n1;

import java.sql.Date;

/**
 * Класс, представляющий сотрудника.
 */
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    /**
     * Конструктор для создания экземпляра сотрудника.
     *
     * @param name       Имя сотрудника.
     * @param dob        Дата рождения сотрудника.
     * @param baseSalary Базовая зарплата сотрудника.
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * Получение информации о сотруднике.
     *
     * @return Строка с информацией о сотруднике.
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    /**
     * Получение базовой зарплаты сотрудника.
     *
     * @return Базовая зарплата сотрудника.
     */
    public int getBaseSalary() {
        return baseSalary;
    }
}
