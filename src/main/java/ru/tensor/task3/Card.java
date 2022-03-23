package ru.tensor.task3;

import ru.tensor.Suit;

public class Card implements Comparable<Card> {
    private Suit suit;
    private int rank;

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public boolean fromStandardDeck() {
        return rank >= 2 && rank <= 15;
    }

    public boolean strongerThan(Card card) {
        return suit == card.getSuit() && rank > card.getRank();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Suit: ").append(suit).append(" Rank: ");
        switch (rank) {
            case 11:
                sb.append("Jack");
                break;
            case 12:
                sb.append("Queen");
                break;
            case 13:
                sb.append("King");
                break;
            case 14:
                sb.append("Ace");
                break;
            case 15:
                sb.append("Joker");
                break;
            default:
                sb.append(rank);
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;
        return suit == card.suit && rank == card.rank;
    }

    @Override
    public int hashCode() {
        int result = suit != null ? suit.hashCode() : 0;
        result = 31 * result + rank;
        return result;
    }

    public static int compare(Card card1, Card card2) {
        return card1.compareTo(card2);
    }

    @Override
    public int compareTo(Card o) {
        if (suit != o.getSuit())
            return suit.ordinal() - o.getSuit().ordinal();
        return rank - o.getRank();
    }
}

