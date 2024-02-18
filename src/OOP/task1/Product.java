package OOP.task1;

public class Product {

    protected long id;
    protected String name;
    protected int weight;
    protected int cost;

    public Product(String name, int weight, int cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public Product(String name, int weight) {
        this(name, weight, 100);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }
}
