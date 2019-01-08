package Exercises.Week03.Ex02;

import Exercises.Week03.Ex01.Customer;

public class InsuranceApplication {
    public static void main(String[] args) {
        TemplateChooser templateChooser = new TemplateChooser();
        Customer tommy = new Customer("Mr.Tommy", "business");
        Customer anderson = new Customer("Ms.Anderson", "economic");
        Customer hokopoko = new Customer("Hokopoko", "business");

        String text1 = templateChooser.chooseTemplate(tommy);
        String text2 = templateChooser.chooseTemplate(anderson);
        String text3 = templateChooser.chooseTemplate(hokopoko);

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
    }
}
