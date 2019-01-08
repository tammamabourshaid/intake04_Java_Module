package Exercises.Week03.Ex04;

import java.util.*;

public class Encryptor {
    private Random random = new Random();
    private List<String> symbols = Arrays.asList("!@#%&-=".split(" "));

    public String encrypt(String text) {
        String replaced = replaceVowels(text);
        String rubbish = addRubbish(replaced);
        return rubbish;
    }

    private String replaceVowels(String text) {

        text = text.replaceAll("A", "4");
        text = text.replaceAll("a", "4");
        text = text.replaceAll("E", "3");
        text = text.replaceAll("e", "3");
        text = text.replaceAll("I", "1");
        text = text.replaceAll("i", "1");
        text = text.replaceAll("O", "8");
        text = text.replaceAll("o", "8");
        text = text.replaceAll("U", "9");
        text = text.replaceAll("u", "9");

        return text;
    }

    private String addRubbish(String text) {
        List<String> encrypted = new ArrayList<>();
        List<String> letters = Arrays.asList(text.split(" "));
        for (String letter : letters) {
            encrypted.add(letter);
            encrypted.add(getRubbish());
        }
        return String.join("", encrypted);
    }

    private String getRubbish() {
        int amount = random.nextInt(5) + 1;
        String rubbish = " ";
        for (int times = 0; times < amount; times++) {
            Collections.shuffle(symbols);
            String symbol = symbols.get(0);
            rubbish += symbol;
        }
        return rubbish;
    }
}
