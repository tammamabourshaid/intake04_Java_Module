package Exercises.Week08.robomime.robomime_github;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Decryptor {

    private List<DecryptionStrategy> strategies = Arrays.asList(
            new ExclamationStrategy(), new AmpersandStrategy(), new HashStrategy()
    );

    public List<String> decrypt(List<String> ciphertexts) {
        List<String> plaintexts = new ArrayList<>();
        for (String ciphertext : ciphertexts) {
            Optional<String> plaintext = decrypt(ciphertext);
            if (plaintext.isPresent()) {
                plaintexts.add(plaintext.get());
            }
        }
        return plaintexts;
    }

    Optional<String> decrypt(String ciphertext) {
        for (DecryptionStrategy strategy : strategies) {
            if (strategy.isValid(ciphertext)) {
                String plaintext = strategy.decrypt(ciphertext);
                return Optional.of(plaintext);
            }
        }
        return Optional.empty();
    }

}
