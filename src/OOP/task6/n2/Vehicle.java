package OOP.task6.n2;

/**
 * Базовый класс, представляющий транспортное средство.
 */
public class Vehicle {
    int maxSpeed;
    String type;

    /**
     * Конструктор для создания экземпляра транспортного средства с указанной максимальной скоростью и типом.
     *
     * @param maxSpeed Максимальная скорость транспортного средства.
     * @param type     Тип транспортного средства.
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     * Получение максимальной скорости транспортного средства.
     *
     * @return Максимальная скорость транспортного средства.
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Получение типа транспортного средства.
     *
     * @return Тип транспортного средства.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Рассчитывает разрешенную скорость для транспортного средства.
     *
     * @return Разрешенная скорость для транспортного средства (по умолчанию 0.0).
     */
    public double calculateAllowedSpeed() {
        return 0.0; // Реализация по умолчанию
    }
}
