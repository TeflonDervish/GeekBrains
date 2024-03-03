package OOP.task6.n2;

/**
 * Класс, представляющий автобус, наследник класса Vehicle.
 */
public class Bus extends Vehicle {

    /**
     * Конструктор для создания экземпляра автобуса с указанной максимальной скоростью.
     *
     * @param maxSpeed Максимальная скорость автобуса.
     */
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    /**
     * Рассчитывает разрешенную скорость для автобуса.
     *
     * @return Разрешенная скорость для автобуса (например, 60% от максимальной).
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}
