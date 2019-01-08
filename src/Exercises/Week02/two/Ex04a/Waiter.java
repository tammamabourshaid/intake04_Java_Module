package Exercises.Week02.two.Ex04a;

import java.util.List;

public class Waiter {
    private Menu menu;

    public Waiter(Menu menu) {
        this.menu = menu;
    }

    public Waiter() {

    }

    public List<Meal> menuList() {
        return menu.menuList();
    }

    public void showPrice(String mealName) {
        List<Meal>meals=menu.menuList();
        for (Meal meal: meals) {
          if (meal.getName().equals(mealName)){
              System.out.println("the price "+ mealName + " is " + meal.getPrice()+ "Euro");
          return;
          }
        }
    }

}


// The Waiter can receive one order from
// a customer (typing the name of the desired
// Meal), then the Waiter will show
// how much the customer has to pay for
// that Meal.
