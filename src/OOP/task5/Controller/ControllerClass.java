package OOP.task5.Controller;

import OOP.task5.Controller.Interfaces.iGetModel;
import OOP.task5.Controller.Interfaces.iGetView;
import OOP.task5.Model.Domain.Student;
import OOP.task5.Model.ModelClass;
import OOP.task5.Model.ModelClassHash;
import OOP.task5.View.ViewClassEng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private List<Student> bufferStudentList = new ArrayList<Student>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students) {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        // MVC
        // view.printAllStudent(model.getStudents());

        // MVP
        bufferStudentList = model.getAllStudents();
        if (testData(bufferStudentList)) {
            view.printAllStudents(bufferStudentList);
        } else {
            System.out.println("Список студентов пуст!");
        }

    }

    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case DELETE:

                    Scanner in = new Scanner(System.in);
                    int n = in.nextInt();

                    if (model.getClass().equals(ModelClass.class)){

                        if (n < 0 || n > ((ModelClass) model).getAllStudents().size()) System.out.println("There's no student with that number");
                        else {
                            ((ModelClass) model).getAllStudents().remove(n);
                        }

                    }else if (model.getClass().equals(ModelClassHash.class)){

                        if (!((ModelClassHash) model).containsKey(n)) System.out.println("There's no student with that number");
                        else {
                            ((ModelClassHash) model).removeStudent(n);
                        }

                    }
                    break;

                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
            }
        }
    }

}