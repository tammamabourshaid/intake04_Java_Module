package Exercises.Week09.Ex03;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    public String cipher(String plaintext, Integer key) {

        return Stream.of(plaintext.split(""))
                .map(e -> e.charAt(0))
                .map(e -> shiftLetter(e, key))
                .collect(Collectors.joining())
                ;
    }

    private String shiftLetter(Character letter, Integer key) {
        if (!Character.isAlphabetic(letter)) {
            return letter.toString();
        }
        return shift(letter, key);
    }

    private String shift(Character letter, Integer key) {
        int shiftedAsciiCode = letter + key;
        if (Character.isUpperCase(letter)) {
            shiftedAsciiCode = (shiftedAsciiCode - 65) % 26 + 65;
        } else {
            shiftedAsciiCode = (shiftedAsciiCode - 97) % 26 + 97;
        }
        Character cipher = (char) shiftedAsciiCode;
        return cipher.toString();
    }
}

//    Create the ​ Caesar class. It has the ​ cipher method
//    that receives the ​ plaintext ​ and the ​ key and returns
//    the ciphertext.
