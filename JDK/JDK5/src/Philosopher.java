import java.util.concurrent.Semaphore;

public class Philosopher extends Thread{

    private final int id;
    private final Semaphore[] forks;

    public Philosopher(int id, Semaphore[] forks) {
        this.id = id;
        this.forks = forks;
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();

                if (id == forks.length - 1) {
                    forks[(id + 1) % forks.length].acquire();
                    forks[id].acquire();
                } else {
                    forks[id].acquire();
                    forks[(id + 1) % forks.length].acquire();
                }
                eat();

                forks[id].release();
                forks[(id + 1) % forks.length].release();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void think() throws InterruptedException {
        System.out.println("Философ " + id + " размышляет.");
        Thread.sleep((long) (Math.random() * 1000));
    }

    private void eat() throws InterruptedException {
        System.out.println("Философ " + id + " ест.");
        Thread.sleep((long) (Math.random() * 1000));
    }
}
