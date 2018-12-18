package Exercises.Week02.Ex01a;

import java.util.ArrayList;
import java.util.List;

public class Hike {

    private Gatherer gatherer= new Gatherer();

    private List<Hiker>hikers= new ArrayList<>();

    public void signUp(){
        hikers=gatherer.signUp();
    }

    public void showHikers() {
        for (Hiker hiker:hikers) {
            System.out.println("Hiker: "+ hiker.getName());
        }
    }
}
