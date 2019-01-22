package Exercises.Week10.Ex02;

public class StudentsList {
    private String gender;
    private String parentalLevelOfEducation;
    private Integer mathScore;
    private Integer readingScore;
    private Integer writingScore;


    public StudentsList(String gender, String parentalLevelOfEducation, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.parentalLevelOfEducation = parentalLevelOfEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getParentalLevelOfEducation() {
        return parentalLevelOfEducation;
    }

    public void setParentalLevelOfEducation(String parentalLevelOfEducation) {
        this.parentalLevelOfEducation = parentalLevelOfEducation;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public void setMathScore(Integer mathScore) {
        this.mathScore = mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public void setReadingScore(Integer readingScore) {
        this.readingScore = readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }

//    @Override
//    public String toString() {
//
//        return gender + parentalLevelOfEducation + mathScore + readingScore + writingScore ;
//    }

    public void setWritingScore(Integer writingScore) {
        this.writingScore = writingScore;

    }
}
