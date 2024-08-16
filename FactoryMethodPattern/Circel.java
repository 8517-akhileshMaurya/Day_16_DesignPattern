package FactoryMethodPattern;

public class Circel implements Shape{
    private double radius;

    Circel(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with " + radius);
    }
}
