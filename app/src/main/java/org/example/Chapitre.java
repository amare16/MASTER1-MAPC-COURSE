package org.example;

import java.util.List;

public class Chapitre implements Document {
    private String titre;
    private List<String> pages;

    // Constructor
    public Chapitre(String titre, List<String> pages) {
        this.titre = titre;
        this.pages = pages;
    }

    // Implementation of the titre() method
    @Override // when overriding or implementing methods from a superclass or interface.
    public String titre() {
        return this.titre;
    }

    // Implementation of the taille() method
    @Override
    public int taille() {
        return this.pages.size();
    }


}
