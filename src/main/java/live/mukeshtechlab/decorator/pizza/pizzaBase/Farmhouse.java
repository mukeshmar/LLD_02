package live.mukeshtechlab.decorator.pizza.pizzaBase;

import live.mukeshtechlab.decorator.pizza.Pizza;

public class Farmhouse implements Pizza {
    @Override
    public Integer getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "Farmhouse";
    }
}
