package kz.aitu.oop.practice.assignment5.entities;

import java.util.UUID;

public class Necklace {

    private UUID necklaceId;
    private String name;
    private Integer weight;
    private Double price;
    private Stone[] stones;

    public Necklace() {
    }

    public Necklace(UUID necklaceId, String name, Integer weight, Double price, Stone[] stones) {
        this.necklaceId = necklaceId;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.stones = stones;
    }

    public UUID getNecklaceId() {
        return necklaceId;
    }

    public void setNecklaceId(UUID necklaceId) {
        this.necklaceId = necklaceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Stone[] getStones() {
        return stones;
    }

    public void setStones(Stone[] stones) {
        this.stones = stones;
    }

}
