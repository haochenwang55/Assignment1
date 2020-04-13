package allaboutecm.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MusicalInstrumentUnitTest {
    private MusicalInstrument musicalInstrument;

    @BeforeEach
    public void setUp() {
        musicalInstrument = new MusicalInstrument("Saxophone");
    }

    @Test
    @DisplayName("MusicalInstrument name cannot be null")
    public void NameCannotBeNull() {
        assertNotNull(musicalInstrument);
    }



    @Test
    public void sameNameMeansSameMusicalInstrument() {
        MusicalInstrument musicalInstrument1 = new MusicalInstrument("Saxophone");

        assertEquals(musicalInstrument, musicalInstrument1);
    }
}