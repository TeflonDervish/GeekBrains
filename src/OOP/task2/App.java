package OOP.task2;

import OOP.task2.Classes.*;
import OOP.task2.Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new OrdinaryClient("masha");
        iActorBehaviour client3 = new SpecialClient("prezident", 1);
        iActorBehaviour client4 = new TaxInspector();


        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        magnit.update();
    }
}