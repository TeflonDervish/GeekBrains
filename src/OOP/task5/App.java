package OOP.task5;

import OOP.task5.Controller.ControllerClass;
import OOP.task5.Controller.Interfaces.iGetView;
import OOP.task5.Model.FileModelClass;
import OOP.task5.Model.Domain.Student;
import OOP.task5.Model.ModelClassHash;
import OOP.task5.View.ViewClass;
import OOP.task5.View.ViewClassEng;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Student student1 = new Student("Ivan", 21);
        Student student2 = new Student("Anna", 25);
        Student student3 = new Student("Vasya", 22);
        Student student4 = new Student("Nastya", 27);
        Student student5 = new Student("Vasilisa", 26);
        Student student6 = new Student("Karina", 25);
        Student student7 = new Student("Andrey", 22);
        Student student8 = new Student("Masha", 27);
        Student student9 = new Student("Irina", 28);
        Student student10 = new Student("Nikolay", 30);

//        List<Student> studList = new ArrayList<>();
//        studList.add(student1);
//        studList.add(student2);
//        studList.add(student3);
//        studList.add(student4);
//        studList.add(student5);
//        studList.add(student6);
//        studList.add(student7);
//        studList.add(student8);
//        studList.add(student9);
//        studList.add(student10);
//
//        FileModelClass fmClass = new FileModelClass("StudentDB.csv");
//        //fmClass.saveAllStudentToFile(studList);
//
//        iGetView view = new ViewClass();
//        //iGetModel model = new ModelClass(studList);
//
//        ControllerClass controller = new ControllerClass(fmClass, view);
//
//        //controller.update();
//        controller.run();

        // Task 5

        ViewClassEng viewEng = new ViewClassEng();

        ModelClassHash classHash = new ModelClassHash();

        classHash.putStudent(1, student1);
        classHash.putStudent(2, student2);
        classHash.putStudent(3, student3);
        classHash.putStudent(4, student4);
        classHash.putStudent(5, student5);

        ControllerClass controllerEng = new ControllerClass(classHash, viewEng);

        controllerEng.run();
    }
}