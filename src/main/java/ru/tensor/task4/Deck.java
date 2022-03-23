package ru.tensor.task4;

import ru.tensor.Suit;
import ru.tensor.task3.Card;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Deck {
    private List<Card> cards = new ArrayList<>();

    public static Deck create() {
       Deck deck = new Deck();
       for (Suit suit : Suit.values()) {
           for (int rank = 2; rank <= 14; rank++) {
               deck.returnCard(new Card(suit, rank));
           }
       }
       return deck;
    }

    public static Deck createWithJokers() {
        Deck deck = Deck.create();
        deck.returnCard(new Card(Suit.CLUB, 15));
        deck.returnCard(new Card(Suit.SPADE, 15));
        return deck;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void sort() {
        Collections.sort(cards);
    }

    public static Card getRandomCard() {
        Random random = new Random();
        int suit = random.nextInt(Suit.values().length);
        int rank = random.nextInt(16 - 2) + 2;
        return new Card(Suit.values()[suit], rank);
    }

    public Card getCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(cards.size() - 1);
    }

    public void returnCard(Card card) {
        if (!cards.contains(card)) {
            cards.add(card);
        }
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Deck:\n");
        for (Card card : cards) {
            sb.append(card).append("\n");
        }
        return sb.toString();
    }
}
