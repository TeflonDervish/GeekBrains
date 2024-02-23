package OOP.task2.Classes;


import OOP.task2.Interfaces.iActorBehaviour;
import OOP.task2.Interfaces.iReturnOrder;

/** Абстрактный класс Actor, который описывает основные методы и поля
 * поведения клиента
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {
    /** @name переменная для хранения имени посетителя
     */
    protected String name;
    /**
     * @isTakeOrder показатель того, что заказ взят
     */
    protected boolean isTakeOrder;
    /**
     * @isMakeOrder показатель того что заказ оплачен
     */
    protected boolean isMakeOrder;
    /**
     * @isReturnOrder показатель того, что заказ отменен
     */
    protected boolean isReturnOrder;

    /**
     * Конструктор для класса Actor
     * @param name - имя покупателя
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Метод для возврата значение имени посетителя
     * @return возвращает имя покупателя
     */
    public abstract String getName();

    /**
     * Метод для изменения поля name
     * @param name изменненое значени
     */
    public abstract void setName(String name);

}