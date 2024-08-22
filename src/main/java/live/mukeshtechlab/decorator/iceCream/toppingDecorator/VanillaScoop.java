package live.mukeshtechlab.decorator.iceCream.toppingDecorator;

import live.mukeshtechlab.decorator.iceCream.IceCream;

public class VanillaScoop extends ToppingDecorator {

    public VanillaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public Double getCost() {
        return this.iceCream.getCost() + 70.0;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription() + ", Vanilla Scoop";
    }
}
