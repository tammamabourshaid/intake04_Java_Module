package Exercises.Week04.Ex05;

import java.util.ArrayList;
import java.util.List;

public class AdvancedShoppingApplication {
    public static void main(String[] args) {
        List<Grocery> groceries = new ArrayList<>();
        System.out.println("Groceries1: " + groceries);
        Grocery bananas = new Grocery("bananas");
        Grocery oranges = new Grocery("oranges");
        Grocery tomatoes = new Grocery("tomatoes");
        groceries.add(bananas);
        groceries.add(oranges);
        groceries.add(tomatoes);
        System.out.println("Groceries2: " + groceries);
        Grocery otherfood=new Grocery("oranges");
        groceries.remove(otherfood);
        System.out.println("Groceries3: " + groceries);
        groceries.add(tomatoes);
        groceries.add(tomatoes);
        System.out.println("Groceries4: " + groceries);
        groceries.remove(2);
        System.out.println("Groceries5: " + groceries);
        System.out.println("Groceries size: " + groceries.size());
    }

}
//Create the Grocery class that has one name .
//  ● Create an empty groceries list of Grocery and display it.
//  ● Create three different Grocery objects.
//  ● Add them to the groceries list and display it. To display the Grocery
//  class create the toString method.
//  ● Create a new Grocery with the same name as a previous one and use it to
//  remove the original one from the
//   list. To remove a Grocery automatically you need to create the equals method
//   in the Grocery class. Specify
//   that two Grocery are the same if their name is the same.
//  ● Add one of the existing groceries twice and display the list.
//  ● Remove the third element of the list by providing its position and display it.
//  ● Display its size.