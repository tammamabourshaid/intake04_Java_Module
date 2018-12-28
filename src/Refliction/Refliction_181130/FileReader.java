package Refliction_181130;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileReader {


    @Override
    public String toString() {
        return "FileReader11{}";
    }

    public FileReader() {
    }

    public List<String> gettext(String filePath) {
        try {
            URI uri = ClassLoader.getSystemResource(filePath).toURI();
            Path path = Paths.get(uri);
            return Files.readAllLines(path);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }


    }
}