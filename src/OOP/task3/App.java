package OOP.task3;

import OOP.task3.Domain.Student;
import OOP.task3.Domain.StudentGroup;
import OOP.task3.Domain.StudentStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {

        // Добавление студентов

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);


        List<Student> listForGroup1 = new ArrayList<>();

        listForGroup1.add(s1); listForGroup1.add(s2);
        listForGroup1.add(s3); listForGroup1.add(s4);

        StudentGroup group1 = new StudentGroup(listForGroup1, 1);


        List<Student> listForGroup2 = new ArrayList<>();

        listForGroup2.add(s5); listForGroup2.add(s6);

        StudentGroup group2 = new StudentGroup(listForGroup2, 2);


        StudentStream studentStream = new StudentStream(5);

        studentStream.addGroup(group1); studentStream.addGroup(group2);

        // Рализицая вывода через for

        System.out.println("Нормальный вывод");

        for (StudentGroup studentGroup: studentStream)
            System.out.println(studentGroup);

        // Реализицая сортировки

        System.out.println("Отсортированный вывод");

        Collections.sort(studentStream.getGroupList());

        for (StudentGroup studentGroup: studentStream)
            System.out.println(studentGroup);

    }
}