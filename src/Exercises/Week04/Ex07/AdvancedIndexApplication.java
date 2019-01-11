package Exercises.Week04.Ex07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AdvancedIndexApplication {
    public static void main(String[] args) {
        Map<Integer, List<Topic>> index = new HashMap<>();
        System.out.println("Index: " + index);

        Integer page1 = 1;
        Integer page2 = 2;
        Topic connecting = new Topic("connecting");
        Topic possitiveThings = new Topic("possitive things");
        Topic ecologicEconomy = new Topic("ecologic economy");
        List<Topic> topic1 = new ArrayList<>();
        List<Topic> topic2 = new ArrayList<>();
        topic1.add(connecting);
        topic2.add(ecologicEconomy);
        topic2.add(possitiveThings);
        index.put(page1, topic1);
        index.put(page2, topic2);
        System.out.println("The Index :" + index);
        System.out.println("The Map Keys :" + index.keySet());
        System.out.println("The Map Values :" + index.values());
        System.out.println("Index entry sets: " + index.entrySet());
        Topic teaching = new Topic("teaching methods");

    }


}
