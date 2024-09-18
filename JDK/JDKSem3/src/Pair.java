

public class Pair <K, V>{

    private K key;
    private V value;

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}
