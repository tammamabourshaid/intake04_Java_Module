package Exercises.Week09.Ex04;

public class HappinessRecord {
    private Integer Rank;
    private String Country;
    private Double Score;

    public HappinessRecord(Integer rank, String country, Double score) {
        Rank = rank;
        Country = country;
        Score = score;
    }

    public Integer getRank() {
        return Rank;
    }

    public String getCountry() {
        return Country;
    }

    public Double getScore() {
        return Score;
    }


}
