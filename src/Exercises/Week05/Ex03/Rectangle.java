package Exercises.Week05.Ex03;

import Exercises.Week05.Ex01.Shape;

public class Rectangle implements Colored, Shape {
    @Override
    public String getColor() {
        return "violet";
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public String toString() {
        return getColor()+ " " +getName();
    }
}
