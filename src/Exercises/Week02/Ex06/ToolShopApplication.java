package Exercises.Week02.Ex06;

import Exercises.Week02.Ex03.Tool;

import java.util.ArrayList;
import java.util.List;

public class ToolShopApplication {
    public static void main(String[] args) {
        String tool1="hammer";
        String tool2="Screw";
        String tool3="driller";
        List<String> toolsName = new ArrayList <>();
        toolsName.add(tool1);
        toolsName.add(tool2);
        toolsName.add(tool3);
        ShopAssistant shopAssistant = new ShopAssistant();
        Toolbox toolbox = shopAssistant.findToolbox("red",toolsName);
        System.out.println("Toolbox color: "+ toolbox.getColor());

        List<Tool> tools = toolbox.getTools();
        for (Tool tool : tools) {
            System.out.println("toolbox has: "+ tool.getName());
        }

    }
}


//    In the ToolShopApplication class main method,
//    create a list of String with three tool names inside,
//    create a ShopAssistant and use it
//    to find a red Toolbox with those three tools inside.