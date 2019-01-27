package Exercises.Week08.robomime.robomime_github;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Archive {

    public List<String> displayUniqueTricks(List<String> tricks) {
        Set<String> unique = new HashSet<>(tricks);
        System.out.println("Number of unique tricks: " + unique.size());
        System.out.println("Tricks: " + unique);
        return new ArrayList<>(unique);
    }

}
