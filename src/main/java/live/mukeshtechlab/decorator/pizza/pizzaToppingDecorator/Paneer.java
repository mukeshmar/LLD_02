package live.mukeshtechlab.decorator.pizza.pizzaToppingDecorator;

import live.mukeshtechlab.decorator.pizza.Pizza;

public class Paneer extends PizzaToppingDecorator{

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Integer getCost() {
        return pizza.getCost() + 60;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Paneer";
    }
}
