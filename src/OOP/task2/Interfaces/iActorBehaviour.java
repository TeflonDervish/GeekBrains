package OOP.task2.Interfaces;

import OOP.task2.Classes.Actor;

public interface iActorBehaviour {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean val);
    public void setMakeOrder(boolean val);
    public Actor geActor();
}