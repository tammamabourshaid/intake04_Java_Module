package Exercises.Week08.robomime.robomime_github;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ArchiveTest {

    private Archive archive = new Archive();

    @Test
    void displayUniqueTricks() {
        List<String> tricks = Arrays.asList("sing", "dance", "sing", "dance");
        List<String> unique = archive.displayUniqueTricks(tricks);
        List<String> expected = Arrays.asList("sing", "dance");
        Assertions.assertEquals(expected, unique);
    }
}