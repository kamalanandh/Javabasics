package DesignPatterns.Factorypattern;

public class PepperoniPizza extends Pizza
{
    public void prepare()
    {
        System.out.println("Preparing pepperoni pizza");
    }
    public void bake()
    {
        System.out.println("Baking pizza");
    }

    public void cut()
    {
        System.out.println("Cutting pizza");
    }
    public void box()
    {
        System.out.println("Boxing pizza");
    }


}
