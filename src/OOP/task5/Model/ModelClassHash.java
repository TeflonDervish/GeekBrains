package OOP.task5.Model;

import OOP.task5.Controller.Interfaces.iGetModel;
import OOP.task5.Model.Domain.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Реализация интерфейса {@code iGetModel} для работы с данными студентов с использованием хеш-таблицы.
 */
public class ModelClassHash implements iGetModel {

    /** Хеш-таблица для хранения студентов по их уникальным ключам. */
    HashMap<Integer, Student> hashOfStudent;

    /**
     * Конструктор класса, инициализирующий хеш-таблицу.
     */
    public ModelClassHash() {
        hashOfStudent = new HashMap<>();
    }

    /**
     * Получает список всех студентов из хеш-таблицы.
     *
     * @return Список всех студентов.
     */
    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(hashOfStudent.values());
    }

    /**
     * Добавляет студента в хеш-таблицу с указанным ключом.
     *
     * @param key    Уникальный ключ для студента.
     * @param object Объект класса Student, который будет добавлен.
     */
    public void putStudent(int key, Student object) {
        hashOfStudent.put(key, object);
    }

    /**
     * Удаляет студента из хеш-таблицы по указанному ключу.
     *
     * @param key Уникальный ключ студента для удаления.
     */
    public void removeStudent(int key) {
        hashOfStudent.remove(key);
    }

    /**
     * Проверяет, содержится ли студент с указанным ключом в хеш-таблице.
     *
     * @param key Уникальный ключ студента.
     * @return true, если студент с указанным ключом существует в хеш-таблице, в противном случае - false.
     */
    public boolean containsKey(int key) {
        return hashOfStudent.containsKey(key);
    }
}
