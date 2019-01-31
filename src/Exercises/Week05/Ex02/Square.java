package Exercises.Week05.Ex02;

import Exercises.Week05.Ex01.Shape;

public class Square implements Shape {
    @Override
    public String getName() {
        return "square";
    }

    @Override
    public String toString() {
        return getName();
    }
}
