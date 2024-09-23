import lombok.Data;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

@Data
public class Employee implements Comparator<LocalDate> {

    private static final int CURRENT_YEAR = 2022;

    private String name;
    private String midName;
    private String surName;
    private String position;
    private String phone;
    private double salary;
    private LocalDate birth;
    private Gender gender;


    public Employee(String surName, String name, Gender gender){
        this.surName = surName;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public int compare(LocalDate o1, LocalDate o2) {
        return o1.compareTo(o2);
    }

    public void raiseSalary(double amount){
        salary += amount;
    }

    enum Gender{
        MALE,
        FEMALE
    }

}
