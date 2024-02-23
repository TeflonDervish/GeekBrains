package OOP.task2.Classes;

import OOP.task2.Interfaces.iActorBehaviour;

/**
 * Класс, представляющий налогового инспектора в системе магазина.
 */
public class TaxInspector implements iActorBehaviour {

    /**
     * Имя налогового инспектора.
     */
    private String name;

    /**
     * Статус "взял заказ" для налогового инспектора.
     */
    private boolean isTakeOrder;

    /**
     * Статус "сделал заказ" для налогового инспектора.
     */
    private boolean isMakeOrder;

    /**
     * Создает нового налогового инспектора с именем "Tax Audit".
     */
    public TaxInspector() {
        this.name = "Tax Audit";
    }

    /**
     * Получает имя налогового инспектора.
     *
     * @return Имя налогового инспектора.
     */
    public String getName() {
        return name;
    }

    /**
     * Переопределение метода для проверки, взял ли налоговый инспектор заказ.
     *
     * @return Значение, указывающее, взял ли налоговый инспектор заказ.
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * Переопределение метода для проверки, сделал ли налоговый инспектор заказ.
     *
     * @return Значение, указывающее, сделал ли налоговый инспектор заказ.
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * Переопределение метода для установки статуса "взял заказ" для налогового инспектора.
     *
     * @param val Значение, которое устанавливается.
     */
    @Override
    public void setTakeOrder(boolean val) {
        isTakeOrder = val;
    }

    /**
     * Переопределение метода для установки статуса "сделал заказ" для налогового инспектора.
     *
     * @param val Значение, которое устанавливается.
     */
    @Override
    public void setMakeOrder(boolean val) {
        isMakeOrder = val;
    }

    /**
     * Переопределение метода для возвращения объекта обычного клиента, представляющего налогового инспектора.
     *
     * @return Объект обычного клиента с именем "Tax Audit".
     */
    @Override
    public Actor geActor() {
        return new OrdinaryClient(name);
    }
}
