package ru.tensor.task2.c;

import ru.tensor.Suit;

import java.util.HashMap;
import java.util.Map;

public class Card {
    private Suit suit;
    private int rank;

    private static Map<Suit, Integer> maxRank = new HashMap<>();

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;

        int currentMaxRank = maxRank.getOrDefault(suit, 0);
        if (rank > currentMaxRank) {
            maxRank.put(suit, rank);
        }
    }

    public Card(Suit suit) {
        this.rank = maxRank.getOrDefault(suit, 0) + 1;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }
}
