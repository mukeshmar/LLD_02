package live.mukeshtechlab.decorator.pizza.pizzaBase;

import live.mukeshtechlab.decorator.pizza.Pizza;

public class Pepperoni implements Pizza {
    @Override
    public Integer getCost() {
        return 180;
    }

    @Override
    public String getDescription() {
        return "Pepperoni";
    }
}
