package Refliction.Refliction_181207;

public class TvTable implements BuildATable {


        @Override
        public void perform(Table table) {
            System.out.println("Adding the Shelf");
            table.setSeat(true);
        }
    }

