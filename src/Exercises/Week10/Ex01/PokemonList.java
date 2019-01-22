package Exercises.Week10.Ex01;

public class PokemonList {

    private String name;
    private String type1;
    private String type2;
    private Integer total;
    private Integer hp;
    private Integer attack;
    private Integer deffense;
    private Integer spAtk;
    private Integer spDef;
    private Integer speed;
    private Integer generation;
    private Boolean legendary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDeffense() {
        return deffense;
    }

    public void setDeffense(Integer deffense) {
        this.deffense = deffense;
    }

    public Integer getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(Integer spAtk) {
        this.spAtk = spAtk;
    }

    public Integer getSpDef() {
        return spDef;
    }

    public void setSpDef(Integer spDef) {
        this.spDef = spDef;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    public Boolean getLegendary() {
        return legendary;
    }

    public void setLegendary(Boolean legendary) {
        this.legendary = legendary;
    }


    public PokemonList(String name, String type1, String type2, Integer total, Integer hp, Integer attack, Integer deffense, Integer spAtk, Integer spDef, Integer speed, Integer generation, Boolean legendary) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.deffense = deffense;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
