package Exercises.Week04.Ex10;

import Exercises.Week04.Ex07.Topic;
import Exercises.Week04.Ex09.FileReader;

import java.util.ArrayList;
import java.util.List;

public class TopicReader {
   private FileReader fileReader = new FileReader();

    public List<Topic> getTopics() {
        List<String> lines = readAllLines();
        List<Topic> topics = parseTopics(lines);
        return topics;
    }

    private List<String> readAllLines() {
        String filePath = "Exercises/Week04/Ex10/topics.txt";
        return fileReader.asLines(filePath);
    }

    private List<Topic> parseTopics(List<String> lines) {
        List<Topic> topics = new ArrayList<>();
        for (String line : lines) {
            topics.add(new Topic(line));
        }
        return topics;
    }

    }

//    Create the ​ TopicReader class that has a ​ FileReader
//    as an attribute.
//    It has the ​ getTopics method that uses
//    the ​ File Reader ​ to read the ​ topics.txt ​ file,
//    transform every line into one ​ Topic ​ and returns
//    the list of topics.