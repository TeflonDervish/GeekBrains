package OOP.task4.Services;

import OOP.task4.Domain.Employee;
import OOP.task4.Domain.Teacher;

import java.util.List;

public class TeacherService implements iPersonService<Teacher>{

    private int count;

    private List<Teacher> teachers;

    public TeacherService(int count) {
        this.count = count;
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {

    }
}
