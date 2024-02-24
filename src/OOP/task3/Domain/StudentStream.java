package OOP.task3.Domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс, представляющий поток студентов.
 */
public class StudentStream implements Iterable<StudentGroup> {

    /**
     * Список групп, входящих в поток.
     */
    List<StudentGroup> groupList;

    /**
     * Переменная для обозначения номера потока.
     */
    int flowNumber;

    /**
     * Конструктор класса.
     *
     * @param flowNumber Номер потока.
     * @param groupList  Список групп, входящих в поток.
     */
    public StudentStream(int flowNumber, List<StudentGroup> groupList) {
        this.groupList = groupList;
        this.flowNumber = flowNumber;
    }

    /**
     * Конструктор класса с пустым списком групп.
     *
     * @param flowNumber Номер потока.
     */
    public StudentStream(int flowNumber) {
        this.groupList = new ArrayList<>();
        this.flowNumber = flowNumber;
    }

    /**
     * Получить список групп в потоке.
     *
     * @return Список групп в потоке.
     */
    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    /**
     * Установить список групп в потоке.
     *
     * @param groupList Новый список групп в потоке.
     */
    public void setGroupList(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    /**
     * Получить номер потока.
     *
     * @return Номер потока.
     */
    public int getFlowNumber() {
        return flowNumber;
    }

    /**
     * Установить номер потока.
     *
     * @param flowNumber Новый номер потока.
     */
    public void setFlowNumber(int flowNumber) {
        this.flowNumber = flowNumber;
    }

    /**
     * Добавить группу в поток.
     *
     * @param studentGroup Группа для добавления.
     */
    public void addGroup(StudentGroup studentGroup) {
        groupList.add(studentGroup);
    }

    /**
     * Добавить список групп в поток.
     *
     * @param studentGroups Список групп для добавления.
     */
    public void addGroups(List<StudentGroup> studentGroups) {
        groupList.addAll(studentGroups);
    }

    /**
     * Итератор для перебора групп в потоке.
     *
     * @return Итератор по группам в потоке.
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return groupList.iterator();
    }
}
