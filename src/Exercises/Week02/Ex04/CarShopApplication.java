package Exercises.Week02.Ex04;

public class CarShopApplication {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Car car1 = new Car("Mazda");
        Car car2 = new Car("Nissan");
        Car car3 = new Car("Golf");
        seller.describe(car1);
        seller.describe(car2);
        seller.describe(car3);


    }

}
