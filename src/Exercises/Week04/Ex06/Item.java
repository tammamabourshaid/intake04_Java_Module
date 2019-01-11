package Exercises.Week04.Ex06;

import java.util.Objects;

public class Item {
    private String name;

    public String getName() {
        return name;
    }

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name= " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
