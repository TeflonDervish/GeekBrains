package OOP.task2.Classes;

/**
 * Класс, представляющий обычного клиента в системе магазина.
 */
public class OrdinaryClient extends Actor {

    /**
     * Создает нового обычного клиента с указанным именем.
     *
     * @param name Имя клиента.
     */
    public OrdinaryClient(String name) {
        super(name);
    }

    /**
     * Проверяет, взял ли клиент свой заказ.
     *
     * @return true, если клиент взял заказ, в противном случае - false.
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Проверяет, сделал ли клиент заказ.
     *
     * @return true, если клиент сделал заказ, в противном случае - false.
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Устанавливает статус "взял заказ" для клиента.
     *
     * @param val Значение, которое устанавливается.
     */
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    /**
     * Устанавливает статус "сделал заказ" для клиента.
     *
     * @param val Значение, которое устанавливается.
     */
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    /**
     * Получает объект клиента.
     *
     * @return Объект клиента.
     */
    public Actor geActor() {
        return this;
    }

    /**
     * Получает имя клиента.
     *
     * @return Имя клиента.
     */
    public String getName() {
        return super.name;
    }

    /**
     * Устанавливает имя клиента.
     *
     * @param name Новое имя клиента.
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Проверяет, вернул ли клиент заказ.
     *
     * @return true, если клиент вернул заказ, в противном случае - false.
     */
    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    /**
     * Устанавливает статус "вернул заказ" для клиента.
     *
     * @param isReturnOrder Значение, которое устанавливается.
     */
    @Override
    public void setReturnOrder(boolean isReturnOrder) {
        super.isReturnOrder = isReturnOrder;
    }
}
