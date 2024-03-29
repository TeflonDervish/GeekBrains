package Exception.People;

import Exception.Exceptions.IncorrectBirthdayException;
import Exception.Exceptions.IncorrectGenderException;
import Exception.Exceptions.IncorrectPhoneNumberException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class People {
    String surname, name, middleName;
    LocalDate birthday;
    String phoneNumber;
    boolean gender;

    public People() {}

    public People(String surname, String name, String middleName, LocalDate birthday, String phoneNumber, boolean gender) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;

        if (birthday.isAfter(LocalDate.now())) throw new IncorrectBirthdayException("Нерпавильно введена дата рождения");
        this.birthday = birthday;

        if (phoneNumber.length() != 11) throw  new IncorrectPhoneNumberException("Неправильно введеный номер телефона");
        this.phoneNumber = phoneNumber;

        this.gender = gender;
    }

    public void readPeople(Scanner in){

        System.out.println("Введите свои личные данные в формате\n" +
                        "Фамилия Имя Отчество дата_рождения номер_телефона пол");
        surname = in.next();
        name = in.next();
        middleName = in.next();

        String[] birthdayString = in.next().split("\\.");
        birthday = LocalDate.of(Integer.parseInt(birthdayString[2]),
                                Integer.parseInt(birthdayString[1]),
                                Integer.parseInt(birthdayString[0]));

        if (birthday.isAfter(LocalDate.now())) throw new IncorrectBirthdayException("Нерпавильно введена дата рождения");

        phoneNumber = in.next();
        if (phoneNumber.length() != 11) throw  new IncorrectPhoneNumberException("Неправильно введеный номер телефона");

        switch (in.next()){
            case ("f") :
                gender = false;
                break;
            case ("m"):
                gender = true;
                break;
            default:
                throw new IncorrectGenderException("Неправильно введен пол");
        }
    }

    public void writeToFile(){

        String fileName = "src/Exception/Files/" + surname + ".txt";

        if ((new File(fileName)).exists()){

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {

                writer.write("\n" + surname + "; ");
                writer.write(name + "; ");
                writer.write(middleName + "; ");
                writer.write(birthday.toString() + "; ");
                writer.write(phoneNumber + "; ");
                writer.write(gender ? "m" : "f" + ";");

            } catch (IOException e) {
                e.printStackTrace();
            }

        }else {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

                writer.write(surname + "; ");
                writer.write(name + "; ");
                writer.write(middleName + "; ");
                writer.write(birthday.toString() + "; ");
                writer.write(phoneNumber + "; ");
                writer.write(gender ? "m" : "f" + ";");

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
