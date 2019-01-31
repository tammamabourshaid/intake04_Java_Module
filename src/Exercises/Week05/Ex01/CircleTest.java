package Exercises.Week05.Ex01;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class CircleTest {

    @Test
    void getName() {
        String expected = "circle";

        Circle circle = new Circle();
        Assert.assertEquals(expected, circle.getName());

        Shape shape = new Circle();
        Assert.assertEquals(expected, shape.getName());
    }

}