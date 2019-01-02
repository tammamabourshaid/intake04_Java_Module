package Refliction.Refliction_181123.two;

import java.util.Scanner;

public class NumberMirrorApplication {
    public static void main(String[] args) {
        NumberMirror numberMirror = new NumberMirror();
        System.out.println("Write your Number : ");
        Scanner input = new Scanner(System.in);
        Integer inputNumber = input.nextInt();
        Integer mirrorNumber = numberMirror.mirror(inputNumber);
        System.out.println("Original: " + inputNumber);
        System.out.println("Mirror: " + mirrorNumber);
    }
}
