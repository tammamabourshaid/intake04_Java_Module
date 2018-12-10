package Exercises.Week02.Ex01;

public class Printer {
    public void print(Article article) {
        System.out.println("Article title: " + article.getTitle());
        System.out.println("Article text: " + article.getText());

    }
}
