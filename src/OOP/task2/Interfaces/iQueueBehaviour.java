package OOP.task2.Interfaces;

/**
 * Описывает поведение очереди
 */
public interface iQueueBehaviour {
    /**
     * Добавляет в очередь
     * @param actor - покупатель
     */
    public void takeInQueue(iActorBehaviour actor);

    /**
     * Освобождение из очереди
     */
    public void releaseFromQueue();

    /**
     * Принимает заказ
     */
    public void takeOrder ();

    /**
     * Выдает заказ
     */
    public void giveOrder ();
    // public void geActor ();
}