package Exercises.Week05.Ex02;

import Exercises.Week05.Ex01.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getName() {
        String expected= "triangle";

        Triangle triangle = new Triangle();
        assertEquals(expected,triangle.getName());

        Shape shape = new Triangle();
        assertEquals(expected,shape.getName());
    }
}