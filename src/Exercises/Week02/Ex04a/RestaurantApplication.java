package Exercises.Week02.Ex04a;

import java.util.List;

public class RestaurantApplication {
    public static void main(String[] args) {
        Waiter waiter = new Waiter(new Menu());
        List<Meal> meals = waiter.menuList();
        for (Meal meal : meals) {
            System.out.println("meal : " + meal.getName());
            System.out.println("  " + meal.getPrice() + " euro");
        }
    }
}
