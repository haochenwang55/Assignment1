package allaboutecm.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MusicianUnitTest {
    private Musician musician;

    @BeforeEach
    public void setUp() {
        musician = new Musician("Jay-Z");
    }

    @Test
    @DisplayName("Musician name cannot be null")
    public void NameCannotBeNull() {

        assertNotNull(musician);
    }



    @Test
    public void sameNameMeansSameMusician() {
         Musician musician1 = new Musician("Jay-Z");

        assertEquals(musician, musician1);
    }
}