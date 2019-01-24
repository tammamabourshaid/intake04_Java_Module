package Exercises.Week10.Ex03;

public class SmsList {
    private String valueOne;
    private String valueTwo;

    public SmsList(String valueOne, String valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public String getValueOne() {
        return valueOne;
    }

    public String getValueTwo() {
        return valueTwo;
    }


    @Override
    public String toString() {
        return  valueOne  ;
    }
//    }
}

