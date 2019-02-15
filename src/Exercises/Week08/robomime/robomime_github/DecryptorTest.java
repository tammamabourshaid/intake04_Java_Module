package Exercises.Week08.robomime.robomime_github;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class DecryptorTest {

    private Decryptor decryptor = new Decryptor();

    @Test
    void decryptAvailable() {
        testDecryption("!house");
        testDecryption("&house");
        testDecryption("#house");
    }

    private void testDecryption(String ciphertext) {
        Optional<String> plaintext = decryptor.decrypt(ciphertext);
        Assertions.assertTrue(plaintext.isPresent());
    }

    @Test
    void decryptNotAvailable() {
        String ciphertext = "house";
        Optional<String> plaintext = decryptor.decrypt(ciphertext);
        Assertions.assertFalse(plaintext.isPresent());
    }
}