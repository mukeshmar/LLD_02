package live.mukeshtechlab.decorator.iceCream;

import live.mukeshtechlab.decorator.iceCream.toppingDecorator.Cherry;
import live.mukeshtechlab.decorator.iceCream.toppingDecorator.PistaScoop;
import live.mukeshtechlab.decorator.iceCream.toppingDecorator.VanillaScoop;

public class Client {
    public static void main(String[] args) {

        IceCream iceCream = new OrangeCone();
        iceCream = new VanillaScoop(iceCream);
        iceCream = new PistaScoop(iceCream);
        iceCream = new Cherry(iceCream);

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());

    }
}
