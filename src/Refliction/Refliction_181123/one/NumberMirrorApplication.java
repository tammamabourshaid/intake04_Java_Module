package Refliction.Refliction_181123.one;

import java.util.Scanner;

public class NumberMirrorApplication {

    public static void main(String[] args)         {
        Integer mirrornumber, reverse = 0;

        System.out.println("What's your number ?");
        Scanner number = new Scanner(System.in);
        mirrornumber = number.nextInt();

        while(mirrornumber != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + mirrornumber%10;
            mirrornumber = mirrornumber/10;
        }

        System.out.println("The Mirror number is:  " + reverse);
    }

}