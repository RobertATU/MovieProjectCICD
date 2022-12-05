package ie.atu.MovieProjectCICD;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class movieSelectionTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void testTitle() {
        movieSelection movie = new movieSelection("Pulp Fiction", "Crime", "English", 18, 85);
        assertEquals("Pulp Fiction", movie.getTitle());
        System.out.println(movie);
    }





    @AfterEach
    void tearDear() {

    }

}
