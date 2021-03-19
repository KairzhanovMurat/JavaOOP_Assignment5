package kz.aitu.oop.practice.assignment5.entities;

public class Stone {

    private Integer carats;
    private String type;

    public Stone() {
    }

    public Stone(Integer carats, String type) {
        this.carats = carats;
        this.type = type;
    }

    public Integer getCarats() {
        return carats;
    }

    public void setCarats(Integer carats) {
        this.carats = carats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
