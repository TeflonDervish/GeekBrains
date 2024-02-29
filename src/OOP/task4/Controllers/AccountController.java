package OOP.task4.Controllers;

import OOP.task4.Domain.Person;
import OOP.task4.Domain.WorkingPerson;

import java.util.List;

public class AccountController {

    public static <T extends WorkingPerson> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    //Загатовка для метода averageAge
    public static <T extends Person> double averageAge(List<T> persons) {
        double sum_age = 0;

        for (int i = 0; i < persons.size(); i++) {
            sum_age += persons.get(i).getAge();
        }

        return sum_age / persons.size();

    }

}