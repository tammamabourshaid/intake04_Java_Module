package Exercises.Week02.one.Ex06;

import Exercises.Week02.one.Ex03.Tool;

import java.util.List;

public class ShopAssistant {

    public Toolbox findToolbox(String color, List<String> toolsName){
Toolbox toolbox=new Toolbox(color);
        for (String toolName : toolsName) {
            Tool tool=new Tool (toolName);
            toolbox.add(tool);
        }
    return toolbox;
    }

}
