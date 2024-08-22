package live.mukeshtechlab.decorator.pizza.pizzaToppingDecorator;

import live.mukeshtechlab.decorator.pizza.Pizza;

public class Olive extends PizzaToppingDecorator {

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Integer getCost() {
        return pizza.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Olive";
    }
}
