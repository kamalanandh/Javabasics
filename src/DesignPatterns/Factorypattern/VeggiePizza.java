package DesignPatterns.Factorypattern;

public class VeggiePizza extends Pizza
    {
        public void prepare()
        {
            System.out.println("Preparing vegie pizza");
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
