package OOP.task2.Interfaces;

import OOP.task2.Classes.Actor;

import java.util.List;

/**
 * Описывает поведение магазина
 */
public interface iMarketBehaviour {
    /**
     * Добавляет покупателя в список
     * @param actor - покупатель
     */
    public void acceptToMarket(iActorBehaviour actor);

    /**
     * Добавляет список покупателей
     * @param actors
     */
    public void releseFromMarket(List<Actor> actors);

    /**
     * Обрабатывает покупателей
     */
    public void update();
}