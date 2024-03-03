package OOP.task6.n4;

/**
 * Класс, представляющий квадрат, наследник класса Rectangle.
 */
public class Square extends Rectangle {

    /**
     * Устанавливает ширину и высоту квадрата.
     *
     * @param width Ширина и высота квадрата.
     */
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    /**
     * Устанавливает ширину и высоту квадрата.
     *
     * @param height Ширина и высота квадрата.
     */
    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
