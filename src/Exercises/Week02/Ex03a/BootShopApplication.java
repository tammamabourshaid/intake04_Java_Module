package Exercises.Week02.Ex03a;

import java.util.List;

public class BootShopApplication {
    public static void main(String[] args) {
     BootShopAssistant assistant=new BootShopAssistant();

        Hansel hansel = new Hansel();
        List<HikingBoot> recommendatoins=assistant.getHikingBootRecommendations();
        hansel.tryHikingBoots(recommendatoins);
        
    }
}
