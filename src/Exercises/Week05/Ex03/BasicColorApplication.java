package Exercises.Week05.Ex03;

import Exercises.Week05.Ex01.Shape;

import java.util.Arrays;
import java.util.List;

public class BasicColorApplication {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Color: " + rectangle.getColor());

        System.out.println("Name: " + rectangle.getName());

        Colored colored = (Colored) rectangle;
        System.out.println("Colored: " + colored.getColor());

        Shape shape = (Shape) rectangle;
        System.out.println("Shape: " + shape.getName());

//        ArrayList<Rectangle> rectangles = new ArrayList<>();
//        rectangles.add(rectangle);
//        //        rectangles.add(colored);
////        rectangles.add(shape);
//
//        ArrayList<Colored> coloreds = new ArrayList<>();
//        coloreds.add(rectangle);
//        coloreds.add(colored);
////        coloreds.add(shape);
//
//        ArrayList<Shape> shapes = new ArrayList<>();
//        shapes.add(rectangle);
//        shapes.add(shape);
////        shapes.add(colored);

        List<Rectangle> rectangles = Arrays.asList(rectangle);
        List<Colored> coloreds = Arrays.asList(rectangle, colored);
        List<Shape> shapes = Arrays.asList(rectangle, shape);

        System.out.println(rectangles);
        System.out.println(coloreds);
        System.out.println(shapes);
    }

}
