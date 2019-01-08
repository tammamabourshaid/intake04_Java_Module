package Exercises.Week03.Ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCorrectorTest {
NumberCorrector numberCorrector= new NumberCorrector();
    @Test
    void testCorrect() {
        int correctedNumber=numberCorrector.correct(-9.3);
        assertEquals(9,correctedNumber);
    }
}