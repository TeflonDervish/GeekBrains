package OOP.task5.Model;

import OOP.task5.Controller.Interfaces.iGetModel;
import OOP.task5.Model.Domain.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModelClassHash implements iGetModel {

    HashMap<Integer, Student> hashOfStudent;

    public ModelClassHash() {
        hashOfStudent = new HashMap<>();
    }


    @Override
    public List<Student> getAllStudents() { return new ArrayList<>(hashOfStudent.values()); }

    public void putStudent(int key, Student object){ hashOfStudent.put(key, object); }

    public void removeStudent(int key) { hashOfStudent.remove(key); }

    public boolean containsKey(int key) { return  hashOfStudent.containsKey(key); }
}
