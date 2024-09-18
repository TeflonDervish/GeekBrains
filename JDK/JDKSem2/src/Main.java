import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Pair<Integer, Double> numberPair = new Pair<>(10, 20.5);
        System.out.println(PairUtils.sumOrConcat(numberPair));

        Pair<String, String> stringPair = new Pair<>("Hello, ", "World!");
        System.out.println(PairUtils.sumOrConcat(stringPair));

        Pair<Integer, String> mixedPair = new Pair<>(42, "Answer");
        System.out.println(PairUtils.sumOrConcat(mixedPair));



    }
}