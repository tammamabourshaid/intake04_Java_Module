package Exercises.Week02.two.Ex03a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BootShopAssistant {


    public List<HikingBoot> getHikingBootRecommendations() {
        List<HikingBoot> boots = new ArrayList<>();
        boots.add(new HikingBoot(40));
        boots.add(new HikingBoot(41));
        boots.add(new HikingBoot(42));
        Collections.shuffle(boots);
        return boots;
    }

}
//    Define the BootShopAssistant agent class that has a
//    getHikingBootRecommendations method that returns
//    a list of three different hiking boots
//    with sizes 40, 41 and 42 in random order.