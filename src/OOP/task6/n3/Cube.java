package OOP.task6.n3;

// Куб реализует оба интерфейса - AreaCalculable и VolumeCalculable
/**
 * Класс, представляющий куб и реализующий интерфейсы AreaCalculable и VolumeCalculable для расчета площади и объема.
 */
public class Cube implements AreaCalculable, VolumeCalculable {
    private int edge;

    /**
     * Конструктор для создания экземпляра куба с указанной длиной ребра.
     *
     * @param edge Длина ребра куба.
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * Рассчитывает площадь поверхности куба.
     *
     * @return Площадь поверхности куба.
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    /**
     * Рассчитывает объем куба.
     *
     * @return Объем куба.
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
