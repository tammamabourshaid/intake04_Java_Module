package Exercises.Week05.Ex04;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {
    private List<Superhero> superheroes = Arrays.asList(new Superman(), new Batman(), new Spiderman());

    private Random random = new Random();

    public Superhero call(){
        int position = random.nextInt(superheroes.size());
        return superheroes.get(position);

    }
}
