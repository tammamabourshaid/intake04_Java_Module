package Exercises.Week02.one.Ex05;

import Exercises.Week02.one.Ex01.Article;

public class Editor {

    public Magazine writeMagazine() {
        Magazine magazine = new Magazine("My Magazine");
        magazine.add(new Article("The ", " World "));
        magazine.add(new Article("The ", " Science"));
        magazine.add(new Article("The ", " Geography"));
        return magazine;
    }
}


