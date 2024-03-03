package OOP.task6.n4;

/**
 * Класс, представляющий прямоугольник.
 */
public class Rectangle {
    private int width;
    private int height;

    /**
     * Устанавливает ширину прямоугольника.
     *
     * @param width Ширина прямоугольника.
     * @throws IllegalArgumentException если передано отрицательное значение.
     */
    public void setWidth(int width) {
        if (width >= 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width should be a non-negative value.");
        }
    }

    /**
     * Устанавливает высоту прямоугольника.
     *
     * @param height Высота прямоугольника.
     * @throws IllegalArgumentException если передано отрицательное значение.
     */
    public void setHeight(int height) {
        if (height >= 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height should be a non-negative value.");
        }
    }

    /**
     * Рассчитывает площадь прямоугольника.
     *
     * @return Площадь прямоугольника.
     */
    public int area() {
        return this.width * this.height;
    }
}
