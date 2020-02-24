package football.Tests.Football.json;

import football.json.*;
import football.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class JsonImportTest {

    @Test
    public void importPlayer() {
        Player player = JsonImport.importPlayer("44");
        assertEquals("Cristiano Ronaldo",player.getName());

    }
}