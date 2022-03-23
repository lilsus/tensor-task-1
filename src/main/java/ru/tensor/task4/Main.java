package ru.tensor.task4;

import ru.tensor.task3.Card;

public class Main {
    public static void main(String[] args) {
        Deck deck = Deck.createWithJokers();
        deck.shuffle();
        Card card1 = deck.getCard();
        Card card2 = deck.getCard();
        Card card3 = deck.getCard();
        deck.returnCard(card2);
        deck.returnCard(card3);
        deck.returnCard(card3);
        System.out.println(deck);

        deck.shuffle();
        System.out.println(deck);
        deck.sort();
        System.out.println(deck);

        while(!deck.isEmpty())
            deck.getCard();
        System.out.println(deck);
    }
}
