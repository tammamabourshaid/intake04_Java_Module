package Refliction_181109;

import java.util.Scanner;

public class DerekRestaurantTreat {
    public static void main(String[] args) {
        Integer money=getMoney();
        Integer debt=getFriendsDebt();
        concludeWhetherDerekCanInviteHisFriends(money,debt);
    }

    private static void concludeWhetherDerekCanInviteHisFriends(Integer money, Integer debt) {
        boolean canInvite=money>=debt;
        if (!canInvite){
            System.out.println("Sorry, I can not invite!");
        }


    }

    private static Integer getFriendsDebt() {
        Scanner scanner=new Scanner(System.in);
        Integer numberOfFriends=getNumberOfFriends();
        Integer debt=0;
        for (int times = 0; times < numberOfFriends; times++) {
            System.out.println("How much do you Have to Pay?");
            Integer money=scanner.nextInt();
            debt=debt+money;

        }
        return debt;
    }

    private static Integer getNumberOfFriends() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many Friends are there?");
        return scanner.nextInt();
    }

    private static Integer getMoney() {
        System.out.println("How much money do I Have?");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }

}
