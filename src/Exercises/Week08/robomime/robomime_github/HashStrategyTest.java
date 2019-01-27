package Exercises.Week08.robomime.robomime_github;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HashStrategyTest {

    private DecryptionStrategy strategy = new HashStrategy();

    @Test
    void decrypt() {
        String ciphertext = "#####test######";
        String plaintext = strategy.decrypt(ciphertext);
        Assertions.assertEquals("test", plaintext);
    }
}