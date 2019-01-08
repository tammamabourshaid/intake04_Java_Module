package Refliction.Refliction_181219;


import java.util.*;

public class FileApplication {

        public static void main(String[] args) {
            FileReader reader = new FileReader();
            List<String> lines = reader.asLines("Refliction/Refliction_181219/employees.csv");
            for (String line : lines) {
                System.out.println(line);
            }
        }


}
