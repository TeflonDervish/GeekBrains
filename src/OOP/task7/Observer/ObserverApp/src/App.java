package OOP.task7.Observer.ObserverApp.src;

import OOP.task7.Observer.ObserverApp.src.Clients.Company;
import OOP.task7.Observer.ObserverApp.src.Interfaces.iPublisher;
import OOP.task7.Observer.ObserverApp.src.Observers.Junior;
import OOP.task7.Observer.ObserverApp.src.Observers.Master;
import OOP.task7.Observer.ObserverApp.src.Observers.Student;
import OOP.task7.Observer.ObserverApp.src.Publishers.JobAgency;

public class App {
    public static void main(String[] args) throws Exception {
        iPublisher jobAgency = new JobAgency();

        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);

        Master ivanov = new Master("Ivanov");
        Junior sidorov = new Junior("sidorov");
        Student petrov = new Student("Petrov");
 
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
 
        for (int i = 0; i < 5; i++) {
            google.needEmpoyee();
            geekBrains.needEmpoyee();
        }
    }
}
