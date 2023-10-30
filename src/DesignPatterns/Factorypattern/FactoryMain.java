package DesignPatterns.Factorypattern;

public class FactoryMain {
    public static void main(String[] args) {
       SimplePizzaFactory pizza = new SimplePizzaFactory();
       pizza.createPizza("cheese");

        PizzaStore pizzaStore = new PizzaStore(pizza);
        pizzaStore.orderPizza("veggie");
    }

}
