import lombok.Data;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

@Data
public class Employee implements Comparator<LocalDate> {

    private static final int CURRENT_YEAR = 2022;
    String name;
    String midName;
    String surName;
    String position;
    String phone;
    double salary;
    int birth;

    @Override
    public int compare(LocalDate o1, LocalDate o2) {
        return o1.compareTo(o2);
    }

    public void raiseSalary(double amount){
        salary += amount;
    }


}
