package live.mukeshtechlab.decorator.pizza;

import live.mukeshtechlab.decorator.pizza.pizzaBase.BBQChicken;
import live.mukeshtechlab.decorator.pizza.pizzaToppingDecorator.Cheese;
import live.mukeshtechlab.decorator.pizza.pizzaToppingDecorator.Paneer;
import live.mukeshtechlab.decorator.pizza.pizzaToppingDecorator.Tomato;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new BBQChicken();
        pizza = new Tomato(pizza);
        pizza = new Cheese(pizza);
        pizza = new Paneer(pizza);

        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
    }
}
