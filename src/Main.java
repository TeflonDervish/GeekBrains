import OOP.task1.HotDrink;
import OOP.task1.Product;

import javax.xml.stream.events.ProcessingInstruction;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Milk", 100, 50);
        Product product2 = new Product("Bread", 120, 40);

        System.out.println("Milk = " + product1);
        System.out.println("Bread = " + product2);

        Product hotDrink1 = new HotDrink("Coffee", 100, 50, 80);
        Product hotDrink2 = new HotDrink("Tea", 120, 40, 70);

        System.out.println("Coffee = " + hotDrink1);
        System.out.println("Tea = " + hotDrink2);

    }
}
