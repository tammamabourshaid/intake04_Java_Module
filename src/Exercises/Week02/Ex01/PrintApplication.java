package Exercises.Week02.Ex01;

public class PrintApplication {
    public static void main(String[] args) {
        Article article = new Article("NACS", "intake04");
        Printer printer = new Printer();
        printer.print(article);
    }
}
