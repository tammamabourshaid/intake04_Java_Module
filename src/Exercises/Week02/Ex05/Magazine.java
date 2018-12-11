package Exercises.Week02.Ex05;

import Exercises.Week02.Ex01.Article;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private String title;

    private List<Article> articles = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void add(Article article) {
        articles.add(article);
    }

    public List<Article> getArticles() {
        return articles;
    }

    public Magazine(String title) {
        this.title = title;
    }
}
