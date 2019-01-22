package Exercises.Week10.Ex01;

public class PokemonApp {
    public static void main(String[] args) {
        PokemonManupilator pokemonManupilator = new PokemonManupilator();

        System.out.println("1- collectwithCollectorstoSet" + pokemonManupilator.collectwithCollectorstoSet());

        System.out.println("\n2- collectwithCollectorsgrouppingByandCollectorscounting"
                + pokemonManupilator.collectwithCollectorsgrouppingByandCollectorscounting_type1());

        System.out.println("\n3- collectwithCollectorsgrouppingByandCollectorscounting"
                + pokemonManupilator.collectwithCollectorsgrouppingByandCollectorscounting_type2());

        System.out.println("\n4- Counting getType1"
                + pokemonManupilator.counting_getType1());

        System.out.println("\n5- Counting getType2"
                + pokemonManupilator.counting_getType2());
    }
}
