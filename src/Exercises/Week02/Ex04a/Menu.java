package Exercises.Week02.Ex04a;

import java.util.ArrayList;
import java.util.List;

public class Menu {


    public List<Meal> menuList () {

        List<Meal> menus = new ArrayList<>();
        menus.add(new Meal("couscous", 8.5));
        menus.add(new Meal("tajin ", 9.5));
        menus.add(new Meal("hummus ", 3.5));
        menus.add(new Meal("falafel  ", 4));
        return menus;
    }
}