package Exercises.Week02.Ex05;

import Exercises.Week02.Ex01.Printer;

public class MagazineApplication {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Magazine magazine = editor.writeMagazine();
        Printer printer = new Printer();
        printer.printMagazine(magazine);


    }

}
