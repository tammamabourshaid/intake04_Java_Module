package Exercises.Week02.Ex06;

import Exercises.Week02.Ex03.Tool;

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

    public void addtool(Tool tool) {
        tools.add(tool);


    }

    public Toolbox(String color) {
        this.color = color;
    }
}
