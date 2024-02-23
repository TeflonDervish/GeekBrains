package OOP.task2.Classes;

/**
 * Класс, представляющий специального клиента (VIP) в системе магазина.
 */
public class SpecialClient extends Actor {

    /**
     * Уникальный идентификатор VIP-клиента.
     */
    private int idVIP;

    /**
     * Создает нового специального клиента с указанным именем и уникальным идентификатором VIP.
     *
     * @param name  Имя специального клиента.
     * @param idVIP Уникальный идентификатор VIP.
     */
    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    /**
     * Получает уникальный идентификатор VIP-клиента.
     *
     * @return Уникальный идентификатор VIP-клиента.
     */
    public int getIdVIP() {
        return idVIP;
    }

    /**
     * Переопределение метода для получения имени специального клиента.
     *
     * @return Имя специального клиента.
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Переопределение метода для установки имени специального клиента.
     *
     * @param name Новое имя специального клиента.
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Переопределение метода для проверки, вернул ли специальный клиент заказ.
     *
     * @return true, если специальный клиент вернул заказ, в противном случае - false.
     */
    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    /**
     * Переопределение метода для установки статуса "вернул заказ" для специального клиента.
     *
     * @param isReturnOrder Значение, которое устанавливается.
     */
    @Override
    public void setReturnOrder(boolean isReturnOrder) {
        super.isReturnOrder = isReturnOrder;
    }

    /**
     * Переопределение метода для проверки, взял ли специальный клиент заказ.
     *
     * @return Значение, указывающее, взял ли специальный клиент заказ.
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Переопределение метода для проверки, сделал ли специальный клиент заказ.
     *
     * @return Значение, указывающее, сделал ли специальный клиент заказ.
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Переопределение метода для установки статуса "взял заказ" для специального клиента.
     *
     * @param val Значение, которое устанавливается.
     */
    @Override
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    /**
     * Переопределение метода для установки статуса "сделал заказ" для специального клиента.
     *
     * @param val Значение, которое устанавливается.
     */
    @Override
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    /**
     * Переопределение метода для возвращения объекта специального клиента.
     *
     * @return Объект специального клиента.
     */
    @Override
    public Actor geActor() {
        return this;
    }
}
