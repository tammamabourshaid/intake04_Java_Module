package Exercises.Week02.two.Ex07a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {
    List<Integer> findFirst100Primes (List<Integer> numbers){
        Integer FoundPrimes=0;
        List<Integer> primes= new ArrayList<>();
        for (Integer number : numbers) {
            if (isPrime(number)){
                primes.add(number);
                FoundPrimes++;
                if (FoundPrimes==100){
                    return primes;
                }
            }
        }
        return primes;
    }

    private boolean isPrime(Integer number) {
        BigInteger potentialPrime= BigInteger.valueOf(number);
        return potentialPrime.isProbablePrime(100);
    }
}


//One class is responsible for receiving a list of Integer
// numbers and returns a list of Integer that contains from
// those numbers only the first 100 primes.
// This method has a default visibility and should not be possible to
// use it from the main method.