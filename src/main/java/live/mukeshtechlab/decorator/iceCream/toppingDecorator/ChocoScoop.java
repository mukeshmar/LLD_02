package live.mukeshtechlab.decorator.iceCream.toppingDecorator;

import live.mukeshtechlab.decorator.iceCream.IceCream;

public class ChocoScoop extends ToppingDecorator {

    public ChocoScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public Double getCost() {
        return this.iceCream.getCost() + 80.0;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription() + ", Choco Scoop";
    }
}
