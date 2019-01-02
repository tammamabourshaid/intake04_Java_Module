package Exercises.Week03.Ex01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScreenTest {
Screen screen= new Screen();

    @Test
    void testBusinessCustomer() {
Customer mrTammam=new Customer("Mr.tammam","business");
String mrTammamFromat= screen.formatName(mrTammam);
assertEquals("MR.TAMMAM",mrTammamFromat);
    }

    @Test
    void testEconimicCustomer(){
        Customer mrYazan=new Customer("Mr.yazan", "original");
        String mrYazanFormat= screen.formatName(mrYazan);
        assertEquals("mr.yazan",mrYazanFormat);
    }
}