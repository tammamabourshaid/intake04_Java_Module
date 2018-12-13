package Exercises.Week06.Ex02;

public class IceCreamApplication {

    public static void main(String[] args) {
        IceCream cone = new ConeIceCream("Chocolate", "Oreo");
//        String response = cone.eat();
        System.out.println(cone.eat());

        IceCream cup = new CupIceCream("Vanilla", "Cookies");
//        String response2 = cup.eat();
        System.out.println(cup.eat());
    }
}
