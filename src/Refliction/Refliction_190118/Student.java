package Refliction.Refliction_190118;

public class Student {

    String gender;
    String levelOfEducation;
    long mathScore;
    Integer readingScore;
    Integer writingScore;



    public Student(String gender, String levelOfEducation, long mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.levelOfEducation = levelOfEducation;
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

    public String getLevelOfEducation() {
        return levelOfEducation;
    }

    public void setLevelOfEducation(String levelOfEducation) {
        this.levelOfEducation = levelOfEducation;
    }

    public long getMathScore() {
        return mathScore;
    }

    public void setMathScore(long mathScore) {
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

    public void setWritingScore(Integer writingScore) {
        this.writingScore = writingScore;
    }
}
