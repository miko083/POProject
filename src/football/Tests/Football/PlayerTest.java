package football.Tests.Football;

import football.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player = new Player("25","Damian Dabrowski","Damian","Dabrowski","2000-01-01","Poland","Midfielder");
    @Test
    public void getName() {

        assertEquals("Damian Dabrowski",player.getName());
    }

    @Test
    public void getId() {
        assertEquals("25",player.getId());
    }

    @Test
    public void getFirstName() {
        assertEquals("Damian",player.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("Dabrowski",player.getLastName());
    }

    @Test
    public void getDateOfBirth() {
        assertEquals("2000-01-01",player.getDateOfBirth());
    }

    @Test
    public void getNationality() {
        assertEquals("Poland",player.getNationality());
    }

    @Test
    public void getPosition() {
        assertEquals("Midfielder",player.getPosition());
    }

    @Test
    public void update() {
    }


    @Test
    public void showInfo() {
    }
}