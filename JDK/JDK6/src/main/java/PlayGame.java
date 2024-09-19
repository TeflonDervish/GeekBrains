import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class PlayGame {

    private static final int COUNT_GAMES = 1000;

    public static void main(String[] args) {

        Doors doors = new Doors();

        int countWinners = 0, countLosers = 0;

        Map<Integer, List<Boolean>> result = new HashMap<>();

        PlayerWinner playerWinner = new PlayerWinner(doors);
        PlayerLoser playerLoser = new PlayerLoser(doors);

        // Запускаем цикл на 1000 повторений и
        // смотрим чья стратегия принесет больше победных очко
        for (int i = 0; i < COUNT_GAMES; i++) {

            result.put(i, new ArrayList<>(Arrays.asList(false, false)));

            if (playerWinner.play()) {
                countWinners++;
                result.get(i).set(0, true);
            }
            if (playerLoser.play()) {
                countLosers++;
                result.get(i).set(1, true);
            }
            doors.initialize();

        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {

            for (int i = 0; i < COUNT_GAMES; i++) {
                writer.write(
                        String.format("%4d: %10s | %10s\n",
                                i ,
                                (result.get(i).get(0) ? "Победа" : "Поражение"),
                                (result.get(i).get(1) ? "Победа" : "Поражение")));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Кол-во побед выигрышной стратегии: " + countWinners);
        System.out.println("Кол-во побед проигрышной стратегии: " + countLosers);

    }
}
