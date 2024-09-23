import java.time.LocalDate;
import java.time.Month;

public class Main {

    enum Holiday {
        NO_HOLIDAY("как дела?)))"),
        NEW_YEAR("с новым годом!!!"),
        MARCH_8("с 8 мартом"),
        FEBRUARY_23("с 23 февраля");

        public String getGreeting() {
            return greeting;
        }

        private String greeting;

        Holiday(String greeting){
            this.greeting = greeting;
        }

        public static Holiday getDate(LocalDate localDate){
            if (localDate.getMonth() == Month.DECEMBER && localDate.getDayOfMonth() == 31) return Holiday.NEW_YEAR;
            else if (localDate.getMonth() == Month.MARCH && localDate.getDayOfMonth() == 8) return Holiday.MARCH_8;
            else if (localDate.getMonth() == Month.FEBRUARY && localDate.getDayOfMonth() == 23) return Holiday.FEBRUARY_23;
            else return Holiday.NO_HOLIDAY;

        }
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Sergeev", "Igor", Employee.Gender.MALE);
        Employee employee2 = new Employee("Gazizova", "Sabina", Employee.Gender.FEMALE);
        Employee employee3 = new Employee("Shripov", "Nail", Employee.Gender.MALE);

        Employee[] employees = {employee1, employee2, employee3};

        String s;

        switch (Holiday.getDate(LocalDate.now())){
            case MARCH_8 -> {
                for (Employee employee : employees) {
                    if (employee.getGender() == Employee.Gender.FEMALE)
                        System.out.printf("%s %s с 8 мартом\n", employee.getSurName(), employee.getName());
                }
            }
            case FEBRUARY_23 -> {
                for (Employee employee : employees) {
                    if (employee.getGender() == Employee.Gender.MALE)
                        System.out.printf("%s %s с 23 февраля\n", employee.getSurName(), employee.getName());
                }
            }
            case NEW_YEAR -> {
                for (Employee employee : employees) {
                        System.out.printf("%s %s с новым годом!!!\n", employee.getSurName(), employee.getName());
                }
            }
            case NO_HOLIDAY -> {
                for (Employee employee : employees) {
                    System.out.printf("%s %s как дела?)))\n", employee.getSurName(), employee.getName());
                }
            }
        }

    }
}
