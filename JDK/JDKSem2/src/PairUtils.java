
public class PairUtils {

    public static <T, U> String sumOrConcat(Pair<T, U> pair) {
        if (pair.getFirst() instanceof Number && pair.getSecond() instanceof Number) {
            Number firstNumber = (Number) pair.getFirst();
            Number secondNumber = (Number) pair.getSecond();
            return String.valueOf(firstNumber.doubleValue() + secondNumber.doubleValue());
        } else if (pair.getFirst() instanceof String && pair.getSecond() instanceof String) {
            String firstString = (String) pair.getFirst();
            String secondString = (String) pair.getSecond();
            return firstString + secondString;
        } else {
            return pair.toString();
        }
    }
}
