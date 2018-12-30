package Exercises.Week02.two.Ex07a;

public class PrimesApplication {
    public static void main(String[] args) {
        First100PrimesCalculator first100PrimesCalculator = new First100PrimesCalculator();
        Integer sum = first100PrimesCalculator.getSumOfThe100FirstPrimeNumbers();
        System.out.println("The Sum of The First 100 Prime Numbers is : " + sum);
    }
}
