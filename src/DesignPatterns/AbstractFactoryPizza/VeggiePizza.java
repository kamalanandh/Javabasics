package DesignPatterns.AbstractFactoryPizza;

public class VeggiePizza implements Pizza
{
    @Override
    public String getPizza() {
        return "Veggie pizza prepared";
    }
}
