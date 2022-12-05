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

    @Test
    void testTitle2() {
        movieSelection movie = new movieSelection("pulp fiction", "Crime", "English", 18, 85);
        assertEquals("pulp fiction", movie.getTitle());
        System.out.println(movie);
    }

    @Test
    void testTitle3() {
        movieSelection movie = new movieSelection("Pulp fiction", "Crime", "English", 18, 85);
        assertEquals("Pulp fiction", movie.getTitle());
        System.out.println(movie);
    }

    @Test
    void testTitleFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new movieSelection("pup fiction", "Crime", "English", 18, 85));
        assertEquals("Incorrect movie title", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }

    @Test
    void testGenre() {
        movieSelection movie = new movieSelection("Pulp fiction", "Crime", "English", 18, 85);
        assertEquals("Crime", movie.getGenre());
        System.out.println(movie);

    }
    @Test
    void testGenreFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new movieSelection("Pulp fiction", "Adventure", "English", 18, 85));
        assertEquals("Incorrect movie genre", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }

    @Test
    void testLanguage() {
        movieSelection movie = new movieSelection("Pulp fiction", "Crime", "English", 18, 85);
        assertEquals("English", movie.getLanguage());
        System.out.println(movie);
    }
    @Test
    void testLanguageFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new movieSelection("Pulp fiction", "Crime", "Irish", 18, 85));
        assertEquals("Incorrect language", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }

    @Test
    void testAgeRating() {
        movieSelection movie = new movieSelection("Pulp fiction", "Crime", "English", 18, 85);
        assertEquals(18, movie.getAgeRating());
        System.out.println(movie);
    }
    @Test
    void testAgeRatingFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new movieSelection("Pulp fiction", "Crime", "Irish", 13, 85));
        assertEquals("Age rating does not match", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }










    @AfterEach
    void tearDear() {

    }

}
