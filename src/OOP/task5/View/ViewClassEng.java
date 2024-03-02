package OOP.task5.View;

import OOP.task5.Controller.Interfaces.iGetView;
import OOP.task5.Model.Domain.Student;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ViewClassEng implements iGetView {
    @Override
    public void printAllStudents(Collection<Student> students) {

        System.out.println("_____Student list_____");

        System.out.println("students = " + students);

        System.out.println("______________________");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
