package Exercises.Week02.one.Ex01;

import Exercises.Week02.one.Ex05.Magazine;

import java.util.List;

public class Printer {
    public void print(Article article) {
        System.out.println("Article title: " + article.getTitle());
        System.out.println("Article text: " + article.getText());

    }
    public void printMagazine (Magazine magazine){
        System.out.println("Magazine title: "+ magazine.getTitle());
        List<Article>articles=magazine.getArticles();
        for (Article article : articles) {
            print(article);
        }

    }
}
