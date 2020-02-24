package football.Tests.Football.scoresTable;

import football.json.JsonImport;
import football.Player;
import football.scoresTable.Scorer;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScorerTest {
    Player player = JsonImport.importPlayer("44");
    Scorer scorer = new Scorer(player,32);
    @Test

    public void getNumberOfGoals() {
        assertEquals(32,scorer.getNumberOfGoals());
    }
}