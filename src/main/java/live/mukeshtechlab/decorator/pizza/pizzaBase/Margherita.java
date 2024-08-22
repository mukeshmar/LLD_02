package live.mukeshtechlab.decorator.pizza.pizzaBase;

import live.mukeshtechlab.decorator.pizza.Pizza;

public class Margherita implements Pizza {
    @Override
    public Integer getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Margherita";
    }
}
