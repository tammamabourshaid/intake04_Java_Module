package Exercises.Week05.Ex02;

import Exercises.Week05.Ex01.Circle;
import Exercises.Week05.Ex01.Shape;

import java.util.ArrayList;

public class BasicShapesApplication {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Shape: "+ circle);

        Square square = new Square();
        System.out.println("Shape: "+square);

        Triangle triangle = new Triangle();
        System.out.println("Shape: "+triangle);

//        ArrayList<Circle> circles = new ArrayList<>();
//        circles.add(circle);
//        circles.add(square);
//        circles.add(triangle);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(square);
        System.out.println("Shape: "+shapes);

        for (Shape shape : shapes) {
         String name=shape.getName();
            System.out.println("Shape name: "+ name);
        }
    }
}
