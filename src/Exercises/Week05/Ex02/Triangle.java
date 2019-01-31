package Exercises.Week05.Ex02;

import Exercises.Week05.Ex01.Shape;

public class Triangle implements Shape {
    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
