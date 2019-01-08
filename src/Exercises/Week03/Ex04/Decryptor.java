package Exercises.Week03.Ex04;

import java.util.Arrays;
import java.util.List;

public class Decryptor {
    public String decrypt (String message){
        message= removeRubbish (message);
        message= replaceNumbers (message);
        return message;
    }

    private String replaceNumbers(String message) {
        message= message.replaceAll("4","a");
        message= message.replaceAll("3","e");
        message= message.replaceAll("1","i");
        message= message.replaceAll("8","o");
        message= message.replaceAll("9","u");

        return message;
    }

    private String removeRubbish(String message) {
        List<String> symbols = Arrays.asList("!@#%&-=".split(""));
        for (String symbol : symbols) {
            message=message.replaceAll(symbol,"");
        }
        message= message.replaceAll("\\*","");
        message= message.replaceAll("\\+","");
        message= message.replaceAll("\\$","");

        return message;
    }



}
