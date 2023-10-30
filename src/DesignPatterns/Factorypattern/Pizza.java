package DesignPatterns.Factorypattern;

abstract public class Pizza {
   String pizza = "pizza created";

    public String getPizza() {
        return "pizza created";
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }
    abstract public void prepare();
    abstract public void bake();
    abstract public void cut();
    abstract public void box();

}
