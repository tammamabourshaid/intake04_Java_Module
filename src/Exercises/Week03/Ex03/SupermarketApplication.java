package Exercises.Week03.Ex03;

public class SupermarketApplication {
    public static void main(String[] args) {
        NumberCorrector numberCorrector = new NumberCorrector();
        Integer correctedNumber;
        correctedNumber = numberCorrector.correct(-5.5);

        System.out.println(correctedNumber);
    }
}
