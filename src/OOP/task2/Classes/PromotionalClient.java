package OOP.task2.Classes;

/**
 * Класс, представляющий промо-клиента в системе магазина.
 */
public class PromotionalClient extends Actor {

    /**
     * Название акции, связанной с промо-клиентом.
     */
    private String actionName;

    /**
     * Счетчик клиентов.
     */
    private static int clientCount = 0;

    /**
     * Уникальный идентификатор клиента.
     */
    private int idClient;

    /**
     * Создает нового промо-клиента с указанным именем и увеличивает счетчик клиентов.
     *
     * @param name Имя промо-клиента.
     */
    public PromotionalClient(String name) {
        super(name);
        clientCount++;
    }

    /**
     * Получает уникальный идентификатор клиента.
     *
     * @return Уникальный идентификатор клиента.
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * Получает название акции, связанной с промо-клиентом.
     *
     * @return Название акции.
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Устанавливает название акции для промо-клиента.
     *
     * @param actionName Название акции.
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * Получает общее количество промо-клиентов.
     *
     * @return Общее количество промо-клиентов.
     */
    public static int getClientCount() {
        return clientCount;
    }

    /**
     * Переопределение метода для получения имени промо-клиента.
     *
     * @return Имя промо-клиента.
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Переопределение метода для установки имени промо-клиента.
     *
     * @param name Новое имя промо-клиента.
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Переопределение метода для проверки, вернул ли промо-клиент заказ.
     *
     * @return true, если промо-клиент вернул заказ, в противном случае - false.
     */
    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    /**
     * Переопределение метода для установки статуса "вернул заказ" для промо-клиента.
     *
     * @param isReturnOrder Значение, которое устанавливается.
     */
    @Override
    public void setReturnOrder(boolean isReturnOrder) {
        super.isReturnOrder = isReturnOrder;
    }

    /**
     * Переопределение метода для проверки, взял ли промо-клиент заказ.
     *
     * @return Всегда возвращает false, поскольку промо-клиент не берет заказы.
     */
    @Override
    public boolean isTakeOrder() {
        return false;
    }

    /**
     * Переопределение метода для проверки, сделал ли промо-клиент заказ.
     *
     * @return Всегда возвращает false, поскольку промо-клиент не делает заказы.
     */
    @Override
    public boolean isMakeOrder() {
        return false;
    }

    /**
     * Переопределение метода для установки статуса "взял заказ" для промо-клиента.
     *
     * @param val Значение, которое устанавливается (в данном случае, игнорируется).
     */
    @Override
    public void setTakeOrder(boolean val) {
        // Игнорируется, поскольку промо-клиент не берет заказы.
    }

    /**
     * Переопределение метода для установки статуса "сделал заказ" для промо-клиента.
     *
     * @param val Значение, которое устанавливается (в данном случае, игнорируется).
     */
    @Override
    public void setMakeOrder(boolean val) {
        // Игнорируется, поскольку промо-клиент не делает заказы.
    }

    /**
     * Переопределение метода для возвращения объекта промо-клиента.
     *
     * @return Всегда возвращает null, так как промо-клиент не является обычным клиентом.
     */
    @Override
    public Actor geActor() {
        return null;
    }
}
