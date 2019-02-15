package Exercises.Week08.robomime.robomime_github;

public class HashStrategy implements DecryptionStrategy {

    @Override
    public boolean isValid(String text) {
        return text.contains("#");
    }

    @Override
    public String decrypt(String text) {
        text = text.replaceAll("#", "");
        text = text.replaceAll("robomime", "");
        return text;
    }
}
