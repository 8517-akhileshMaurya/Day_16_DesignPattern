package FactoryMethodPattern;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter you shape : ");
            String shape = sc.nextLine();
            Shape_Factory shapeFactory = new Shape_Factory();
            Shape obj1 = shapeFactory.getInstance(shape);
            System.out.println(obj1.calculateArea());
            obj1.draw();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}