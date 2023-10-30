package DesignPatterns.Factorypattern;

public class CheesePizza extends Pizza
{
    public void prepare()
    {
        System.out.println("Preparing cheese pizza");
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


