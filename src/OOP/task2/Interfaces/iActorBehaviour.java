package OOP.task2.Interfaces;

import OOP.task2.Classes.Actor;


/**
 * Интерфейс описывает принцип поведения клиента
 *
 */
public interface iActorBehaviour {
    /**
     * Возвращает состояние isTakeOrder
     * @return isTakeOrder
     */
    public boolean isTakeOrder();
    /**
     * Возвращает состояние isMakeOrder
     * @return isMakeOrder
     */
    public boolean isMakeOrder();
    /**
     * Позволяет изменить значение isTakeOrder
     * @param val
     */
    public void setTakeOrder(boolean val);
    /**
     * Позволяет изменить значение isMakeOrder
     * @param val
     */
    public void setMakeOrder(boolean val);

    /**
     * Возвращет ссылку на покупателя
     * @return
     */
    public Actor geActor();
}