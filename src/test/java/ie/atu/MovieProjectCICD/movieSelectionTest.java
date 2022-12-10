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
    void testGenre() {
        movieSelection movie = new movieSelection("Oscars Oasis","Horror",18,90);
        assertEquals("Horror", movie.getGenre());
        System.out.println(movie);
    }

    @Test
    void testGenreFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new movieSelection("Oscars Oasis","Crime", 15, 60));
        assertEquals("Selection must be Horror, action, Comedy", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }

    @Test
    void testAgeRating() {
        movieSelection movie = new movieSelection("Oscars Oasis","Horror", 18, 60);
        assertEquals(18, movie.getAgeRating());
        System.out.println(movie);
    }
    @Test
    void testAgeRatingFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new movieSelection("Oscars Oasis","Horror", 11,60 ));
        assertEquals("Age rating must be 12, 15 or 18", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }

    @Test
    void testScore() {
        movieSelection movie = new movieSelection("Oscars Oasis","Horror",18, 60);
        assertEquals(60, movie.getScore());
        System.out.println(movie);
    }
    @Test
    void testScoreFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new movieSelection("Oscars Oasis","Horror", 18, 3));
        assertEquals("Score must be between 10 and 90", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }

    @AfterEach
    void tearDear() {

    }

}
