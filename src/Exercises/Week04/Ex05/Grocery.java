package Exercises.Week04.Ex05;

public class Grocery {

    private String name;

    public String getName() {
        return name;
    }



    public Grocery(String name) {
        this.name = name;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grocery grocery = (Grocery) o;
        return name.equals(grocery.name);
    }

    @Override
    public String toString() {
        return "name=" + name ;
    }
}
