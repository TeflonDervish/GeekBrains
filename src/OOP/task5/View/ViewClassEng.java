package OOP.task5.View;

import OOP.task5.Controller.Interfaces.iGetView;
import OOP.task5.Model.Domain.Student;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import java.util.Collection;
import java.util.Scanner;

/**
 * Реализация интерфейса {@code iGetView} для отображения информации и взаимодействия с пользователями на английском языке.
 */
public class ViewClassEng implements iGetView {

    /**
     * Выводит детали всех студентов из предоставленной коллекции.
     *
     * @param students Коллекция объектов Student, которые будут отображены.
     */
    @Override
    public void printAllStudents(Collection<Student> students) {
        System.out.println("_____Список студентов_____");

        // Выводит детали каждого студента в коллекции
        System.out.println("students = " + students);

        System.out.println("______________________");
    }

    /**
     * Выводит сообщение пользователю и ожидает ввода пользователя.
     *
     * @param msg Сообщение, которое будет отображено пользователю.
     * @return Строка, содержащая ввод пользователя.
     */
    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);

        // Отображает сообщение пользователю
        System.out.println(msg);

        // Считывает и возвращает ввод пользователя
        return in.nextLine();
    }
}
