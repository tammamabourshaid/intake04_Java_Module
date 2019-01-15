package Exercises.Week09.Ex04;

public class HappinessRecord {
    Integer Rank;
    String Country;
    Double Score;

    public Integer getRank() {
        return Rank;
    }

    public String getCountry() {
        return Country;
    }

    public Double getScore() {
        return Score;
    }



    public HappinessRecord(Integer rank, String country, Double score) {
        Rank = rank;
        Country = country;
        Score = score;
    }



}
