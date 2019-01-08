package Exercises.Week03.Ex02;

import Exercises.Week03.Ex01.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemplateChooserTest {
    TemplateChooser templateChooser = new TemplateChooser();

    @Test
    void testManTemplate() {
        Customer mrTammam = new Customer("Mr.tammam","business");
        String mrTammamTemplate=templateChooser.chooseTemplate(mrTammam);
        assertEquals("man",mrTammamTemplate);
    }

    @Test
    void testWomanTemplate() {
        Customer msAnderson = new Customer("Ms.anderson","economic");
        String msAndersonTemplate=templateChooser.chooseTemplate(msAnderson);
        assertEquals("woman",msAndersonTemplate);
    }
}