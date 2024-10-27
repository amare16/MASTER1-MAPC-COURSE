package org.example.td2;

import java.util.ArrayList;
import java.util.List;

public class MultiDeck {
    private List<List<Card.CardEnum>> decks;

    // Default constructor to create multiple decks
    public MultiDeck(int numberOfDecks) {
        decks = new ArrayList<>();
        for (int i = 0; i < numberOfDecks; i++) {
            decks.add(new ArrayList<>(List.of(Card.CardEnum.values())));
        }
    }

    // Shallow copy constructor
    public MultiDeck(MultiDeck original) {
        this.decks = new ArrayList<>(original.decks); // Shares the same list references
    }

    // Deep copy constructor
    public MultiDeck deepCopy(MultiDeck original) {
        this.decks = new ArrayList<>();
        for (List<Card.CardEnum> deck : original.decks) {
            this.decks.add(new ArrayList<>(deck)); // Copies each deck list individually
        }
        return original;
    }

    public List<List<Card.CardEnum>> getDecks() {
        return decks;
    }
}
