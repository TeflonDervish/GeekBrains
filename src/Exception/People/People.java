package Exception.People;

import Exception.Exceptions.IncorrectBirthdayException;
import Exception.Exceptions.IncorrectPhoneNumberException;

import java.time.LocalDate;
import java.util.Date;

public class People {
    String surname, name, middleName;
    LocalDate birthday;
    int phoneNumber;
    boolean gender;

    public People(String surname, String name, String middleName, LocalDate birthday, int phoneNumber, boolean gender) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;

        if (birthday.isBefore(LocalDate.now())) throw new IncorrectBirthdayException("Нерпавильно введена дата рождения");
        this.birthday = birthday;

        if (Integer.toString(phoneNumber).length() != 11) throw  new IncorrectPhoneNumberException("Неправильно введеный номер телефона");
        this.phoneNumber = phoneNumber;

        this.gender = gender;
    }
}
