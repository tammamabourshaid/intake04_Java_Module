package Exercises.Week04.worldhappiness;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HappinessApplication {

    public static void main(String[] args) {
        HappinessRecordReader reader = new HappinessRecordReader();
        List<HappinessRecord> records = reader.asList();
        Collections.sort(records, Comparator.comparing(HappinessRecord::getRank));

        int elements = 5;
        for (int position = 0; position < elements; position++) {
            HappinessRecord record = records.get(position);
            System.out.println("Rank: " + record.getRank() + " | Country: " + record.getCountry() + " | Score: " + record.getScore());
        }
    }

}
