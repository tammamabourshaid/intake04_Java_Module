package Exercises.Week02.two.Ex07a;

import java.util.List;

public class First100PrimesCalculator {
    private NumberGenerator generator= new NumberGenerator();
    private PrimeFinder primeFinder=new PrimeFinder();
    private NumberAccumulator numberAccumulator=new NumberAccumulator();

    public Integer getSumOfThe100FirstPrimeNumbers(){
        List<Integer>numbers= generator.generate550numbers();
        List<Integer>primes= primeFinder.findFirst100Primes(numbers);
        return numberAccumulator.accumlate(primes);
    }
}

//The First100PrimesCalculator class is responsible for
// the orchestration of the interaction of the previous
// classes. It has a getSumOfThe100FirstPrimeNumbers
// method that has public visibility.