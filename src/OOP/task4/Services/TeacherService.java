package OOP.task4.Services;

import OOP.task4.Domain.Employee;
import OOP.task4.Domain.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы с объектами класса Teacher.
 * Реализует интерфейс iPersonService, предоставляя функционал для управления учителями.
 */
public class TeacherService implements iPersonService<Teacher> {

    /**
     * Счетчик учителей.
     */
    private int count;

    /**
     * Список учителей.
     */
    private List<Teacher> teachers;

    /**
     * Конструктор класса TeacherService. Инициализирует список учителей.
     */
    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    /**
     * Получает список всех учителей.
     *
     * @return Список всех учителей, или null, если список пуст.
     */
    @Override
    public List<Teacher> getAll() {
        return teachers.isEmpty() ? null : new ArrayList<>(teachers);
    }

    /**
     * Создает нового учителя с указанным именем, возрастом и статусом "basic".
     * Увеличивает счетчик учителей и добавляет учителя в список.
     *
     * @param name Имя нового учителя.
     * @param age  Возраст нового учителя.
     */
    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "basic");
        count++;
        teachers.add(teacher);
    }
}
