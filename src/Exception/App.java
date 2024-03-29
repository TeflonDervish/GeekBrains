package Exception;

import Exception.People.People;

import java.time.LocalDate;
import java.util.Scanner;

public class App {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        People people = new People();
        people.readPeople(in);
        people.writeToFile();

        People newPeople = new People("Фамилия", "Что", "то",
                        LocalDate.of(2011, 10, 10), "89373329237", false);
        newPeople.writeToFile();
    }

}
