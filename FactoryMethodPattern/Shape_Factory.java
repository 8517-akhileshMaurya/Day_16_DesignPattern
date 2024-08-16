package FactoryMethodPattern;

import java.util.Scanner;

public class Shape_Factory {
    Scanner sc = new Scanner(System.in);
    public Shape getInstance(String shapeType){
        if(shapeType.equals("circle")){
            System.out.println("Enter radious : ");
            int rad = sc.nextInt();
            return new Circel(rad);
        }
        else if(shapeType.equals("square")){
            System.out.println("Enter side : ");
            int side = sc.nextInt();
            return new Square(side);
        }
        else {
            System.out.println("Invalid input");
        }
        return null;
    }
}
