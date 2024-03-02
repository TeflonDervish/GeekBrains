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

/**
 * Класс контроллера, отвечающий за взаимодействие между моделью и представлением.
 */
public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private List<Student> bufferStudentList = new ArrayList<Student>();

    /**
     * Конструктор класса контроллера.
     *
     * @param model Объект, реализующий интерфейс iGetModel, представляющий модель данных студентов.
     * @param view  Объект, реализующий интерфейс iGetView, представляющий представление для отображения информации.
     */
    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Проверяет, есть ли тестовые данные для отображения.
     *
     * @param students Список студентов для проверки.
     * @return true, если есть данные, false - если нет.
     */
    private boolean testData(List<Student> students) {
        return !students.isEmpty();
    }

    /**
     * Обновляет информацию и отображает список студентов.
     */
    public void update() {
        bufferStudentList = model.getAllStudents();
        if (testData(bufferStudentList)) {
            view.printAllStudents(bufferStudentList);
        } else {
            System.out.println("Список студентов пуст!");
        }
    }

    /**
     * Запускает основной цикл программы.
     */
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
                    if (model.getClass().equals(ModelClass.class)) {
                        if (n < 0 || n > ((ModelClass) model).getAllStudents().size())
                            System.out.println("Нет студента с таким номером");
                        else {
                            ((ModelClass) model).getAllStudents().remove(n);
                        }
                    } else if (model.getClass().equals(ModelClassHash.class)) {
                        if (!((ModelClassHash) model).containsKey(n))
                            System.out.println("Нет студента с таким номером");
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
