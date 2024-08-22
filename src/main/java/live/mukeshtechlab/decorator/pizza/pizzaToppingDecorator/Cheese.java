package live.mukeshtechlab.decorator.pizza.pizzaToppingDecorator;

import live.mukeshtechlab.decorator.pizza.Pizza;

public class Cheese extends PizzaToppingDecorator {

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Integer getCost() {
        return pizza.getCost() + 80;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Cheese";
    }
}
