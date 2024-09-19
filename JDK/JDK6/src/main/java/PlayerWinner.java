/**
 * Игрок использующий выигрышную стратегию со сменой дверей
 */
public class PlayerWinner extends Player{

    protected PlayerWinner(Doors doors) {
        super(doors);
    }

    @Override
    public boolean play() {
        int choseDoor = random.nextInt(3);
        int showDoor = doors.firstChose(choseDoor);
        return doors.secondChose(3 - choseDoor - showDoor);

    }
}
