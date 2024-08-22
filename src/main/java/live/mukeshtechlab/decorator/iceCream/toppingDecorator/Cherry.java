package live.mukeshtechlab.decorator.iceCream.toppingDecorator;

import live.mukeshtechlab.decorator.iceCream.IceCream;

public class Cherry extends ToppingDecorator {

    public Cherry(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public Double getCost() {
        return this.iceCream.getCost() + 5.0;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription() + ", Cherry";
    }
}
