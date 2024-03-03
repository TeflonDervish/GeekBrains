package OOP.task6.n3;

// Круг реализует только интерфейс AreaCalculable, поскольку он не имеет объема
/**
 * Класс, представляющий круг и реализующий интерфейс AreaCalculable для расчета площади.
 */
public class Circle implements AreaCalculable {
    private double radius;

    /**
     * Конструктор для создания экземпляра круга с указанным радиусом.
     *
     * @param radius Радиус круга.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Рассчитывает площадь круга.
     *
     * @return Площадь круга.
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
