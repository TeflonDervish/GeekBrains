package OOP.task6.n5;

// Класс автомобиля, зависящий от абстракции Engine
/**
 * Класс, представляющий автомобиль.
 */
public class Car {
    private Engine engine;

    /**
     * Конструктор для создания экземпляра автомобиля с указанным двигателем.
     *
     * @param engine Двигатель, который будет установлен в автомобиль.
     */
    public Car(Engine engine) {
        this.engine = engine;
    }

    /**
     * Запускает автомобиль, используя свой двигатель.
     */
    public void start() {
        this.engine.start();
    }
}
