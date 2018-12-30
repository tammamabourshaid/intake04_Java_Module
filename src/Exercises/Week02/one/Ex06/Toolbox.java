package Exercises.Week02.one.Ex06;

import Exercises.Week02.one.Ex03.Tool;

import java.util.ArrayList;
import java.util.List;

public class Toolbox {

    private String color;
    private List<Tool> tools = new ArrayList<>();

    public String getColor() {
        return color;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void add(Tool tool) {
        tools.add(tool);


    }

    public Toolbox(String color) {
        this.color = color;
    }
}
