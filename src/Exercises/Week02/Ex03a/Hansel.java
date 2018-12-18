package Exercises.Week02.Ex03a;

import java.util.List;

public class Hansel {
    private Integer footSize = 41;

    private boolean isRightSize(HikingBoot boot) {
        return footSize.equals(boot.getSize());
    }

    public void tryHikingBoots(List<HikingBoot> boots) {
        for (HikingBoot boot : boots) {
            if (isRightSize(boot)) {
                System.out.println("I will buy this one.");
                return;
            }
            System.out.println("does not fit.");
        }
    }
}

//    Define in the Hansel class an isRightSize method
//    that receives a HikingBoot and compares
//    its size with his footSize and returns
//    if they are the same.
//    This method has private visibility so that only
//    the Hansel class can use it.

//Define in the Hansel class a tryHikingBoots method
// that receives a list of HikingBoot
// and tries them one by one.
// If the HikingBoot doesn’t have the right size,
// he will say “This one does not fit, sorry.”
// and continue with the next.
// If it is 41 he will say
// “I’m buying this one, thanks!” and stop trying more boots.