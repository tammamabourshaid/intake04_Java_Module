package Exercises.Week08.robomime.robomime_github;

public class AmpersandStrategy implements DecryptionStrategy {

    @Override
    public boolean isValid(String text) {
        return text.contains("&");
    }

    @Override
    public String decrypt(String text) {
        text = text.replaceAll("&", "");
        text = reverse(text);
        return text;
    }

    private String reverse(String plaintext) {
        return new StringBuilder(plaintext).reverse().toString();
    }
}
