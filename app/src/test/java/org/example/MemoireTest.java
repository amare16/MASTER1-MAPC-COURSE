package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MemoireTest {
    @Test
    public void testMemoireTaill() {
        // Create Chapitre objects as per the object diagram
        Chapitre c1 = new Chapitre("Introduction", Arrays.asList("Page 1", "Page 2"));
        Chapitre c2 = new Chapitre("Patrons", Arrays.asList("Page 1", "Page 2", "Page 3"));
        Chapitre c3 = new Chapitre("Anti-Patrons", Arrays.asList("Page 1", "Page 2"));
        Chapitre c4 = new Chapitre("Conclusion", Arrays.asList("Page 1"));

        // Create the Memoire object with the list of Chapitre objects
        Memoire memoireAlice = new Memoire("Patrons and Anti-Patrons", Arrays.asList(c1, c2, c3, c4));

        // Check the total size of the Memoire
        // Question 11
        int expectedFailedSize = 7; // The exercise mentions this as the incorrect size
        // Question 12
        int expectedSize = 8; // corrected size

        int actualSize = memoireAlice.taille();

        // Assert that the expected size is 7 (which we expect to fail)
        assertEquals(expectedSize, actualSize, "The size of the Mémoire should be 7.");

    }
}
