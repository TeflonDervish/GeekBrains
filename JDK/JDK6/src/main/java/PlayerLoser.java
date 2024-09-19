

/**
 * Игрок использующий проигрышную стратегию без смены двери
 */
public class PlayerLoser extends Player{

    public PlayerLoser(Doors doors) {
        super(doors);
    }

    @Override
    public boolean play() {
        int choseDoor = random.nextInt(3);
        return doors.secondChose(choseDoor);
    }
}
