package kz.aitu.oop.practice.assignment5.services;

import kz.aitu.oop.practice.assignment5.entities.Necklace;
import kz.aitu.oop.practice.assignment5.entities.Stone;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CalculateService {


    public String calc(Stone[] stones, Double price) {

        Necklace necklace = new Necklace();
        necklace.setNecklaceId(UUID.randomUUID());
        necklace.setWeight(countCarats(stones));
        necklace.setStones(stones);
        necklace.setPrice(price);
        necklace.setName(getStoneData(stones));


        return necklace.getPrice() + " KZT | " + necklace.getName() + " | " +
                necklace.getWeight() + " carats";
    }



    private String getStoneData(Stone[] stones) {
        List<String> list = new ArrayList<String>();
        for (Stone st:
                stones) {
            list.add(st.getType());
        }
        return String.join(" and ", list);
    }

    private Integer countCarats(Stone[] stones) {
        Integer counter = 0;
        for (Stone st:
                stones) {
            counter += st.getCarats();
        }
        return counter;
    }
}
