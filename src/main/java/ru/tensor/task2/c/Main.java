package ru.tensor.task2.c;

import ru.tensor.Suit;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(Suit.DIAMOND, 4);
        Card card2 = new Card(Suit.DIAMOND, 2);
        Card card3 = new Card(Suit.DIAMOND);
        System.out.println(card1.getRank());
        System.out.println(card2.getRank());
        System.out.println(card3.getRank());
    }
}
