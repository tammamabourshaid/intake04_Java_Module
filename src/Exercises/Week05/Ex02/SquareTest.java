package Exercises.Week05.Ex02;

import Exercises.Week05.Ex01.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getName() {
        String expected="square";
        Square square = new Square();
        assertEquals(expected,square.getName());

        Shape shape = new Square();
        assertEquals(expected,shape.getName());
    }
}