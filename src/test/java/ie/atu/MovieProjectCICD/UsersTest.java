package ie.atu.MovieProjectCICD;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UsersTest {
    @BeforeEach
    void setUp() {

    }

    @Test
    void testName() {
        Users n = new Users("Nathan","nathan@gmail.com","N4th4n!",21,"Horror");
        assertEquals("Nathan", n.getName());
        System.out.println(n);
    }
    @Test
    void testNameFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Users("Na","nathan@gmail.com","N4th4n!",21,"Horror"));
        assertEquals("Minimum of three characters required", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }

    @Test
    void testEmail() {
        Users n = new Users("Nathan","nathan@gmail.com","N4th4n!",21,"Horror");
        assertEquals("nathan@gmail.com", n.getEmail());
        System.out.println(n);
    }

    @Test
    void testEmailFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Users("Nathan","nathan@home.asleep","N4th4n",21,"Horror"));
        assertEquals("Must include @ and .com", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }

    @Test
    void testPassword() {
        Users n = new Users("Nathan","nathan@gmail.com","N4th4n!",21,"Horror");
        assertEquals("N4th4n!", n.getPassword());
        System.out.println(n);
    }

    @Test
    void testPasswordFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Users("Nathan","nathan@gmail.com","N0thin",21,"Horror"));
        assertEquals("Must include Uppercase, Lowercase, Number and Special Character", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }

    @Test
    void testAge() {
        Users n = new Users("Nathan","nathan@gmail.com","N4th4n!",21,"Horror");
        assertEquals(21, n.getAge());
        System.out.println(n);
    }
    @Test
    void testAgeFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Users("Nathan","nathan@gmail.com","N4th4n!",16,"Horror"));
        assertEquals("Must be over 18 to access the site", exMessage.getMessage());
        System.out.println(exMessage.getMessage());
    }
    @Test
    void testGenre() {
        Users n = new Users("Nathan","nathan@gmail.com","N4th4n!",21,"Horror");
        assertEquals("Horror", n.getGenre());
        System.out.println(n);
    }
    @Test
    void testGenreFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Users("Nathan","nathan@gmail.com","N4th4n!",20,"Horrir"));
        assertEquals("Must be Comedy, Horror, or Action", exMessage.getMessage());
        System.out.println(exMessage.getMessage());

    }


}