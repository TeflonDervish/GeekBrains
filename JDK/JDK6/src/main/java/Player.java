import java.util.Random;

public abstract class Player {

    protected Doors doors;
    protected Random random;

    public Player(Doors doors) {
        random = new Random();
        this.doors = doors;
    }

    public abstract boolean play();
}
