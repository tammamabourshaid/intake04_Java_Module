package Exercises.Week09.Ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CaesarTest {
    private Caesar caesar= new Caesar();

    @Test
    void testUppercase() {
        String actual = caesar.cipher("HELLO",1);
        String expected = "IFMMP";
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void testLowercase (){
        String actual = caesar.cipher("hello, nacs",13);
        String expected = "uryyb, anpf";
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testLongSentence (){
        String longsentence= "Hello Everybody I’m in NACS";
        String  actual = caesar.cipher(longsentence,13);
        String expected = "Uryyb Rirelobql V’z va ANPF";
        Assertions.assertEquals(actual,expected);

    }

}