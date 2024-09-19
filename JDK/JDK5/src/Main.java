import java.util.concurrent.Semaphore;

public class Main {

    private static final int NUM_PHILOSOPHERS = 5;
    private static final Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];
    private static final Semaphore[] forks = new Semaphore[NUM_PHILOSOPHERS];

    public static void main(String[] args) {

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new Semaphore(1);
        }

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            philosophers[i] = new Philosopher(i, forks);
            new Thread(philosophers[i]).start();
        }
    }
}
