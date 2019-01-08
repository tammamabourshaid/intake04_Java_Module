package Exercises.Week03.Ex04;

public class HackerApplication {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        String ciphertext= messenger.send("Tammam");
        String plaintext= messenger.receive(ciphertext);
        System.out.println(ciphertext);
        System.out.println(plaintext);
    }
}
