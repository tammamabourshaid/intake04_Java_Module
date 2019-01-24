package Exercises.Week10.Ex04;

public class ChractersList {

    private String name;
    private String allegiances;
    private String deathYear;
    private String bookOfDeath;
    private String deathChapter;
    private String bookIntroChapter;
    private Integer gender;
    private Integer nobility;
    private Integer goT;
    private Integer coK;
    private Integer soS;
    private Integer ffC;
    private Integer dwD;

    public ChractersList(String name, String allegiances, String deathYear, String bookOfDeath, String deathChapter, String bookIntroChapter, Integer gender, Integer nobility, Integer goT, Integer coK, Integer soS, Integer ffC, Integer dwD) {
        this.name = name;
        this.allegiances = allegiances;
        this.deathYear = deathYear;
        this.bookOfDeath = bookOfDeath;
        this.deathChapter = deathChapter;
        this.bookIntroChapter = bookIntroChapter;
        this.gender = gender;
        this.nobility = nobility;
        this.goT = goT;
        this.coK = coK;
        this.soS = soS;
        this.ffC = ffC;
        this.dwD = dwD;
    }

    public String getName() {
        return name;
    }

    public String getAllegiances() {
        return allegiances;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    public String getDeathChapter() {
        return deathChapter;
    }

    public String getBookIntroChapter() {
        return bookIntroChapter;
    }

    public Integer getGender() {
        return gender;
    }

    public Integer getNobility() {
        return nobility;
    }

    public Integer getGoT() {
        return goT;
    }

    public Integer getCoK() {
        return coK;
    }

    public Integer getSoS() {
        return soS;
    }

    public Integer getFfC() {
        return ffC;
    }

    public Integer getDwD() {
        return dwD;
    }
}
