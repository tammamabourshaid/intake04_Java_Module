package Refliction.Refliction_181207;

public class TvTableBuilder implements BuildATable {

        @Override
        public void perform (Table table){
            System.out.println("Adding one leg...");
            Integer legs = table.getLegs();
            table.setLegs(legs + 1);
        }
    }
