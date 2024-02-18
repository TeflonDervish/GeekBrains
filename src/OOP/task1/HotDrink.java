package OOP.task1;

public class HotDrink extends Product{

    private int temperature;

    public HotDrink(String name, int weight, int cost, int temperature) {
        super(name, weight, cost);
        this.temperature = temperature;
    }

    public HotDrink(String name, int weight) {
        this(name, weight, 100, 100);
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "temperature=" + temperature +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }
}
