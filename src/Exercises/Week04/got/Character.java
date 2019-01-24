package Exercises.Week04.got;

public class Character {

    private String name;
    private String bookOfDeath;
    private String gender;

    public Character(String name, String bookOfDeath, String gender) {
        this.name = name;
        this.bookOfDeath = bookOfDeath;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "{name : " + name +
                " | book of death : " + bookOfDeath +
                " | gender : " + gender +
                '}';
    }
}
