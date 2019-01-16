package Exercises.Week09.Ex05;

public class Film {
    String title;
    Double score;
    Integer votecount;
    Integer runtime;
    Integer budget;
    Long revenue;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getVotecount() {
        return votecount;
    }

    public void setVotecount(Integer votecount) {
        this.votecount = votecount;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    public Film(String title, Double score, Integer votecount, Integer runtime, Integer budget, Long revenue) {
        this.title = title;
        this.score = score;
        this.votecount = votecount;
        this.runtime = runtime;
        this.budget = budget;
        this.revenue = revenue;
    }


}
