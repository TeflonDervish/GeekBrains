package OOP.task6.n2;

/**
 * Класс для расчета разрешенной скорости транспортного средства.
 */
public class SpeedCalculation {

    /**
     * Рассчитывает разрешенную скорость для заданного транспортного средства.
     *
     * @param vehicle Транспортное средство, для которого нужно рассчитать разрешенную скорость.
     * @return Разрешенная скорость для указанного транспортного средства.
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}
