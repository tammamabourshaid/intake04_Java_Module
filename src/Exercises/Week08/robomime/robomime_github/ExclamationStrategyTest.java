package Exercises.Week08.robomime.robomime_github;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExclamationStrategyTest {

    private DecryptionStrategy strategy = new ExclamationStrategy();

    @Test
    void decrypt() {
        String ciphertext = "!!!!!!solsticeFormulor!!!!!!";
        String plaintext = strategy.decrypt(ciphertext);
        Assertions.assertEquals("solsticeFormulor", plaintext);
    }
}