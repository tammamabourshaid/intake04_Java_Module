package Exercises.Week04.Ex08;

public class Box {
    private String content;

    public Box(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "gift content= " + content;
    }
}
