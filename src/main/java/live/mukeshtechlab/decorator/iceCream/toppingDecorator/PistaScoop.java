package live.mukeshtechlab.decorator.iceCream.toppingDecorator;

import live.mukeshtechlab.decorator.iceCream.IceCream;

public class PistaScoop extends ToppingDecorator {

    public PistaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public Double getCost() {
        return this.iceCream.getCost() + 60.0;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription() + ", Pista Scoop";
    }
}
