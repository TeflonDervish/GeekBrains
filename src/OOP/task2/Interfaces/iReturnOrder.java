package OOP.task2.Interfaces;

/**
 * Интерфейс поведения по возврату заказа
 */
public interface iReturnOrder {

    /**
     * Состояние возврата заказа
     * @return возвращает isReturnOrder
     */
    public boolean isReturnOrder();

    /**
     * Позволяет изменять значение isReturnOrder
     * @param val - значение на, которое надо изменить
     */
    public void setReturnOrder(boolean val);
}
