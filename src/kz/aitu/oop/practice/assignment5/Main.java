package kz.aitu.oop.practice.assignment5;

import kz.aitu.oop.practice.assignment5.entities.Stone;
import kz.aitu.oop.practice.assignment5.services.CalculateService;

public class Main {

    public static void main(String[] args) {

        CalculateService calc1 = new CalculateService();
        CalculateService calc2 = new CalculateService();

        Stone diamond = new Stone(40, "Diamond");
        Stone ruby = new Stone(32, "Ruby");
        Stone jewel = new Stone(14, "Jewel");

        Stone[] stones1 = new Stone[] {diamond, ruby, jewel};
        Stone[] stones2 = new Stone[] {ruby, jewel};

        System.out.println(calc1.calc(stones1, 1_200_000.0));
        System.out.println(calc2.calc(stones2, 900_000.0));
    }
}
