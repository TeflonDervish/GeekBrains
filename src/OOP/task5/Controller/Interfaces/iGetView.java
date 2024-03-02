package OOP.task5.Controller.Interfaces;

import OOP.task5.Model.Domain.Student;

import java.util.Collection;
import java.util.List;

public interface iGetView {
    public void printAllStudents(Collection<Student> students);
    public String prompt(String msg);
}