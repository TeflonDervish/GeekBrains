package OOP.task5.Model.Domain;


import OOP.task5.Controller.Interfaces.iGetModel;

import java.util.List;

public class ModelClass implements iGetModel {

    private List<Student> students;

    public ModelClass(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}