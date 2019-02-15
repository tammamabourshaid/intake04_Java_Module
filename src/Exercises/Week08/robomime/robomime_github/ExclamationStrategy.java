package Exercises.Week08.robomime.robomime_github;

public class ExclamationStrategy implements DecryptionStrategy {

    @Override
    public boolean isValid(String text) {
        return text.contains("!");
    }

    @Override
    public String decrypt(String text) {
        return text.replaceAll("!", "");
    }
}
