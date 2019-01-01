package Exercises.Week03.Ex01;

public class ScreenApplication {
    public static void main(String[] args) {
        Customer business = new Customer("Tammam", "business");
        Customer economy = new Customer("YaZan", "economic");
        Screen screen = new Screen();
        screen.display(business);
        screen.display(economy);
    }
}


// In the ScreenApplication class main method,
// create a business class Customer , an economic class
//Customer, a Screen and display them the screen .