package OOP.task6.n2;

/**
 * Класс, представляющий легковой автомобиль, наследник класса Vehicle.
 */
public class Car extends Vehicle {

    /**
     * Конструктор для создания экземпляра легкового автомобиля с указанной максимальной скоростью.
     *
     * @param maxSpeed Максимальная скорость легкового автомобиля.
     */
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    /**
     * Рассчитывает разрешенную скорость для легкового автомобиля.
     *
     * @return Разрешенная скорость для легкового автомобиля (например, 80% от максимальной).
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}
