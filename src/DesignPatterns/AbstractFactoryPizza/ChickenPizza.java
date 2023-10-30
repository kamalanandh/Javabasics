package DesignPatterns.AbstractFactoryPizza;

public class ChickenPizza implements Pizza
{
    @Override
    public String getPizza() {
        return "Chicken pizza prepared";
    }
}
