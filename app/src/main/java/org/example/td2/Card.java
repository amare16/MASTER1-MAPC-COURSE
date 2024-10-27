
package org.example.td2;

public class Card {
    public enum Color {
        RED, BLACK
    }

    public enum Suit {
        CLUBS(Color.BLACK),
        DIAMONDS(Color.RED),
        HEARTS(Color.RED),
        SPADES(Color.BLACK);

        private final Color color;

        Suit(Color color) {
            this.color = color;
        }

        public Color getColor() {
            return color;
        }
    }

    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public enum CardEnum {
        // Spades
        ACE_OF_SPADES(Rank.ACE, Suit.SPADES), TWO_OF_SPADES(Rank.TWO, Suit.SPADES), THREE_OF_SPADES(Rank.THREE, Suit.SPADES),
        FOUR_OF_SPADES(Rank.FOUR, Suit.SPADES), FIVE_OF_SPADES(Rank.FIVE, Suit.SPADES), SIX_OF_SPADES(Rank.SIX, Suit.SPADES),
        SEVEN_OF_SPADES(Rank.SEVEN, Suit.SPADES), EIGHT_OF_SPADES(Rank.EIGHT, Suit.SPADES), NINE_OF_SPADES(Rank.NINE, Suit.SPADES),
        TEN_OF_SPADES(Rank.TEN, Suit.SPADES), JACK_OF_SPADES(Rank.JACK, Suit.SPADES), QUEEN_OF_SPADES(Rank.QUEEN, Suit.SPADES), KING_OF_SPADES(Rank.KING, Suit.SPADES),

        // Hearts
        ACE_OF_HEARTS(Rank.ACE, Suit.HEARTS), TWO_OF_HEARTS(Rank.TWO, Suit.HEARTS), THREE_OF_HEARTS(Rank.THREE, Suit.HEARTS),
        FOUR_OF_HEARTS(Rank.FOUR, Suit.HEARTS), FIVE_OF_HEARTS(Rank.FIVE, Suit.HEARTS), SIX_OF_HEARTS(Rank.SIX, Suit.HEARTS),
        SEVEN_OF_HEARTS(Rank.SEVEN, Suit.HEARTS), EIGHT_OF_HEARTS(Rank.EIGHT, Suit.HEARTS), NINE_OF_HEARTS(Rank.NINE, Suit.HEARTS),
        TEN_OF_HEARTS(Rank.TEN, Suit.HEARTS), JACK_OF_HEARTS(Rank.JACK, Suit.HEARTS), QUEEN_OF_HEARTS(Rank.QUEEN, Suit.HEARTS), KING_OF_HEARTS(Rank.KING, Suit.HEARTS),

        // Diamonds
        ACE_OF_DIAMONDS(Rank.ACE, Suit.DIAMONDS), TWO_OF_DIAMONDS(Rank.TWO, Suit.DIAMONDS), THREE_OF_DIAMONDS(Rank.THREE, Suit.DIAMONDS),
        FOUR_OF_DIAMONDS(Rank.FOUR, Suit.DIAMONDS), FIVE_OF_DIAMONDS(Rank.FIVE, Suit.DIAMONDS), SIX_OF_DIAMONDS(Rank.SIX, Suit.DIAMONDS),
        SEVEN_OF_DIAMONDS(Rank.SEVEN, Suit.DIAMONDS), EIGHT_OF_DIAMONDS(Rank.EIGHT, Suit.DIAMONDS), NINE_OF_DIAMONDS(Rank.NINE, Suit.DIAMONDS),
        TEN_OF_DIAMONDS(Rank.TEN, Suit.DIAMONDS), JACK_OF_DIAMONDS(Rank.JACK, Suit.DIAMONDS), QUEEN_OF_DIAMONDS(Rank.QUEEN, Suit.DIAMONDS), KING_OF_DIAMONDS(Rank.KING, Suit.DIAMONDS),

        // Clubs
        ACE_OF_CLUBS(Rank.ACE, Suit.CLUBS), TWO_OF_CLUBS(Rank.TWO, Suit.CLUBS), THREE_OF_CLUBS(Rank.THREE, Suit.CLUBS),
        FOUR_OF_CLUBS(Rank.FOUR, Suit.CLUBS), FIVE_OF_CLUBS(Rank.FIVE, Suit.CLUBS), SIX_OF_CLUBS(Rank.SIX, Suit.CLUBS),
        SEVEN_OF_CLUBS(Rank.SEVEN, Suit.CLUBS), EIGHT_OF_CLUBS(Rank.EIGHT, Suit.CLUBS), NINE_OF_CLUBS(Rank.NINE, Suit.CLUBS),
        TEN_OF_CLUBS(Rank.TEN, Suit.CLUBS), JACK_OF_CLUBS(Rank.JACK, Suit.CLUBS), QUEEN_OF_CLUBS(Rank.QUEEN, Suit.CLUBS), KING_OF_CLUBS(Rank.KING, Suit.CLUBS),

        // none --- Jokers
        RED_JOKER(null, null, Color.RED), BLACK_JOKER(null, null, Color.BLACK);

        private final Rank rank;
        private final Suit suit;
        private final Color color;

        // Constructor for standard cards
        CardEnum(Rank rank, Suit suit) {
            this.rank = rank;
            this.suit = suit;
            this.color = suit != null ? suit.getColor() : null;
        }

        // Constructor for jokers
        CardEnum(Rank rank, Suit suit, Color color) {
            this.rank = rank;
            this.suit = suit;
            this.color = color;
        }

        public Rank getRank() {
            return rank;
        }

        public Suit getSuit() {
            return suit;
        }

        public Color getColor() {
            return color;
        }

        @Override
        public String toString() {
            if (rank == null && suit == null) {
                return color + " Joker";
            }
            return rank + " of " + suit;
        }
    }

    // Main Card class with methods to access card properties
    public static class CardInstance {
        private final CardEnum cardType;

        public CardInstance(CardEnum cardType) {
            this.cardType = cardType;
        }

        public Rank getRank() { return cardType.getRank(); }
        public Suit getSuit() { return cardType.getSuit(); }
        public Color getColor() { return cardType.getColor(); }

        @Override
        public String toString() { return cardType.toString(); }
    }


}