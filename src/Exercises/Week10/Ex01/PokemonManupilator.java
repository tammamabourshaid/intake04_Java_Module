package Exercises.Week10.Ex01;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PokemonManupilator {


private List<PokemonList> pokemonLists= readPokemon();

    private List<PokemonList> readPokemon(){
        return new PokemonFile().getPokemon("Exercises/Week10/Ex01/pokemon.csv");

    }

        public Set<PokemonList> collectwithCollectorstoSet (){
        return pokemonLists.stream()
                .filter(e->Boolean.valueOf(e.getLegendary()==true))
                .filter(e->Integer.valueOf(e.getDeffense())>100)
                .limit(5)
//                .map(e->e.getName())
                .collect(Collectors.toSet());

}

    public Map<String,List<PokemonList>> collectwithCollectorsgrouppingByandCollectorscounting_type1() {
        return pokemonLists.stream()
                .collect(Collectors.groupingBy(e->e.getType1(),Collectors.toList()));
    }

    public Map<String,List<PokemonList>>collectwithCollectorsgrouppingByandCollectorscounting_type2(){
        return pokemonLists.stream()
                .collect(Collectors.groupingBy(e->e.getType2(),Collectors.toList()));
    }

    public Map<String , Long> counting_getType1(){
        return pokemonLists.stream()
                .collect(Collectors.groupingBy(e->e.getType1(),Collectors.counting()));
    }

    public Map<String,Long> counting_getType2() {
        return pokemonLists.stream()
                .collect(Collectors.groupingBy(e->e.getType2(),Collectors.counting()));
    }
}






