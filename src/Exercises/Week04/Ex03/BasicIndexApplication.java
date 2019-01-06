package Exercises.Week04.Ex03;

import java.util.HashMap;
import java.util.Map;

public class BasicIndexApplication {
    public static void main(String[] args) {
        Map<Integer,String> index = new HashMap<>();
        System.out.println("Index: "+index);
        Integer page1= 1;
        Integer page2= 2;
        Integer page3= 3;
        String Science= "Science";
        String Physics = "Physics";
        String Geology= "Geology";
        index.put(page3,Geology);
        index.put(page1,Science);
        index.put(page2,Physics);
        System.out.println("Index: "+index);
        System.out.println("Index keySet: "+index.keySet());
        System.out.println("Index value: "+index.values());
        System.out.println("Index entry Set: "+index.entrySet());
        String teaching = "teaching methods";
        index.put(page1, teaching);
        System.out.println("Index: " + index);
if (index.containsKey(page1)){
    System.out.println("The page number 1 exists as key");
    String topic = index.get(page3);
    System.out.println("The topic in page number " + page3 + " is " + topic);
    System.out.println("Index size: " + index.size());
}

    }

}
// Matilda just bought a new book about social impact and
// as she opens it, she sees the index
//  Create the BasicIndexApplication class and write
//  the following instructions in its main method:
// ● Create an empty index map connecting Integers
// for the page numbers and Strings for the book topics and
// display it.
// ● Create three Integers that represent three
// different page numbers.
// ● Create three Strings that represent three different
// book topics.
// ● Put them into the index map from biggest to smallest
// page number and display it to notice that the entries
//  are automatically arranged.
// ● Display the map keys.
// ● Display the map values.
// ● Create one String representing another book topic.
// ● Put this new topic into the same page number than
// an existing one and display the map to notice that the
//  previous one is replaced.
// ● Ask if one of the keys is contained in the map and
// display the answer.
// ● Get one of them by providing its name as an argument
// and display it.
// ● Display its size.