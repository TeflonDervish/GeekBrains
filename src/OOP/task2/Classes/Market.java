package OOP.task2.Classes;

import OOP.task2.Interfaces.iActorBehaviour;
import OOP.task2.Interfaces.iMarketBehaviour;
import OOP.task2.Interfaces.iQueueBehaviour;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий собой реализацию магазина, который обрабатывает входящих клиентов,
 * формирует очередь, принимает заказы, выдает заказы и освобождает клиентов из очереди.
 */
public class Market implements iMarketBehaviour, iQueueBehaviour {

    /**
     * Список клиентов в очереди.
     */
    private List<iActorBehaviour> queue;

    /**
     * Создает новый объект класса Market и инициализирует список клиентов в очереди.
     */
    public Market() {
        this.queue = new ArrayList<>();
    }

    /**
     * Принимает клиента в магазин и добавляет его в очередь.
     *
     * @param actor Клиент, который пришел в магазин.
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.geActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Добавляет клиента в очередь магазина.
     *
     * @param actor Клиент, который добавляется в очередь.
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.geActor().getName() + " клиент добавлен в очередь ");
    }

    /**
     * Освобождает клиентов из магазина и из очереди.
     *
     * @param actors Список клиентов, которые освобождаются из магазина.
     */
    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     * Обновляет состояние магазина, включая принятие заказов, выдачу заказов и освобождение клиентов из очереди.
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Выдает заказы клиентам, которые сделали заказ.
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    /**
     * Освобождает клиентов из очереди, которые получили заказ.
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.geActor());
                System.out.println(actor.geActor().getName() + " клиент ушел из очереди ");
            }
        }
        releseFromMarket(releaseActors);
    }

    /**
     * Принимает заказы от клиентов в очереди, которые еще не сделали заказ.
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.geActor().getName() + " клиент сделал заказ ");
            }
        }
    }
}
