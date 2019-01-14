package Exercises.Week08.robomime;

public interface DecryptionStrategy {

    boolean isValid(String text);

    String decrypt(String text);
}

