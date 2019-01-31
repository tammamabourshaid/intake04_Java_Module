package Exercises.Week05.Ex01;

public class Circle implements Shape {
    @Override
    public String getName() {
        return "circle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
