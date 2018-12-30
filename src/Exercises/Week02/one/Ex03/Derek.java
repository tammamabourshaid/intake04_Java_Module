package Exercises.Week02.one.Ex03;

public class Derek {
    private Tool tool;


    public void hangPainting() {
        if (canHangingPainting()) {
            System.out.println("I will hang the painting");
        } else {
            System.out.println("I am missing the hammer");
        }
    }

    private boolean canHangingPainting() {
        return tool != null && tool.getName().equals("hammer");
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
