package Exercises.Week08.robomime.robomime_Me;

public interface DecryptionStrategy {

    boolean isValid(String text);

    String decrypt(String text);
}

