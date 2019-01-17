package Exercises.Week09.Ex03;

public class App {
    public static void main(String[] args) {
        Caesar caesar = new Caesar();
      String type =   caesar.cipher("Hello Everybody I’m in NACS",13);
        System.out.println(type);
    }
}
