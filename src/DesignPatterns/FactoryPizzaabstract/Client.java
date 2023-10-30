package DesignPatterns.FactoryPizzaabstract;

public class Client {
    public static void main(String[] args) {
        Pizza pizza;
        pizza = PizzaFactory.orderpizza("Cheese");
        System.out.println(pizza.getPizza());
    }

}