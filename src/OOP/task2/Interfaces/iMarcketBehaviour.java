package OOP.task2.Interfaces;

import OOP.task2.Classes.Actor;

import java.util.List;


public interface iMarcketBehaviour {
    public void acceptToMarket(iActorBehaviour actor);
    public void releseFromMarket(List<Actor> actors);
    public void update();
}