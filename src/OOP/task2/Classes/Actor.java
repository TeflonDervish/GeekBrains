package OOP.task2.Classes;


import OOP.task2.Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
    public abstract void setName(String name);
}