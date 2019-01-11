package Exercises.Week04.Ex07;

import java.util.Objects;

public class Topic {
    private String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return text.equals(topic.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "text= " + text;
    }

    public String getText() {
        return text;
    }

    public Topic(String text) {
        this.text = text;
    }
}
