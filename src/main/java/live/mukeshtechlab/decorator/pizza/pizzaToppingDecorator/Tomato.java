package live.mukeshtechlab.decorator.pizza.pizzaToppingDecorator;

import live.mukeshtechlab.decorator.pizza.Pizza;

public class Tomato extends PizzaToppingDecorator {

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Integer getCost() {
        return pizza.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Tomato";
    }
}
