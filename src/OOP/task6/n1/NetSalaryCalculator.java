package OOP.task6.n1;

/**
 * Класс для расчета чистой зарплаты сотрудника.
 */
public class NetSalaryCalculator {

    /**
     * Рассчитывает чистую зарплату сотрудника.
     *
     * @param employee Сотрудник, для которого нужно рассчитать чистую зарплату.
     * @return Чистая зарплата сотрудника.
     */
    public int calculateNetSalary(Employee employee) {
        int baseSalary = employee.getBaseSalary();
        // Рассчитываем налоги (предполагаем другой способ расчета)
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}
