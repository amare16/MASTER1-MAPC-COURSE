package org.example;

import java.util.List;

public class Memoire implements Document {
    private String titre;
    private List<Chapitre> chapitres;

    public Memoire(String titre, List<Chapitre> chapitres) {
        this.titre = titre;
        this.chapitres = chapitres;
    }

    // Implementation of the titre() method
    @Override
    public String titre() {
        return titre;
    }

    // Implementation of the taille() method
    @Override
    public int taille() {
        int totalSize = 0;
        for (Chapitre chapitre : chapitres) {
            // Get the size of each chapter
            int chapterSize = chapitre.taille();
            // Add the chapter size to the total
            totalSize += chapterSize;
        }
        // Return the total size of the memoire
        return totalSize;
    }
}
