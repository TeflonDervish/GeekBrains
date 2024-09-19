import java.util.Random;

public class Doors {

    private int winNumber; // Выигрышная дверь
    private final Random rnd;

    public Doors() {
        rnd = new Random();
        winNumber = rnd.nextInt(3); // Выбираем выигрышную дверь
    }

    public void initialize() {
        winNumber = rnd.nextInt(3);
    }

    public int firstChose(int choseNumber) {

        int showDoor = 3 - choseNumber - ((choseNumber + 1) % 3);

        if (showDoor == winNumber)
            showDoor = 3 - choseNumber - (choseNumber - 1) % 3;

        return showDoor;
    }

    public boolean secondChose(int choseNumber) {
        return choseNumber == winNumber;
    }

}
