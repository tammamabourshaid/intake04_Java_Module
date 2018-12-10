package Refliction.Refliction_181207;

public class Table {
    private Integer legs = 0;
    private Boolean seat = false;


    public boolean isFinished() {
        return legs == 4 && seat;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public Boolean getSeat() {
        return seat;
    }

    public void setSeat(Boolean seat) {
        this.seat = seat;
    }
}