package Exercises.Week06.Ex01;

public class HotAirBalloonApplication {

    public static void main(String[] args) {
        System.out.println("smallBalloon --");
        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        smallBalloon.liftUp();
        smallBalloon.land();

        System.out.println("bigBalloon --");
        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        bigBalloon.liftUp();
        bigBalloon.land();

        System.out.println("small --");
        HotAirBalloon small = smallBalloon;
        small.liftUp();
        small.land();

        System.out.println("big --");
        HotAirBalloon big = bigBalloon;
        big.liftUp();
        big.land();
    }

}
