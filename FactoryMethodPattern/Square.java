package FactoryMethodPattern;

public class Square implements Shape{
    private double side;

    Square(double side){
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square with " + side);
    }
}
