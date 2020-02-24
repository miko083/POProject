package football.Tests.Football.match;

import football.match.FullTime;
import football.match.Match;
import football.match.Score;
import football.team.Team;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchTest {
    Team cracovia = new Team("21", "Cracovia", "Jozefa Kaluzy 1", "White-Red", "Krakow");
    Team piast = new Team("22", "Piast", "Stadium of Piast", "Blue", "Gliwice");
    FullTime fullTime = new FullTime(3, 0);
    Score score = new Score("Cracovia", fullTime);
    Match match = new Match("23", "2019-02-09", cracovia, piast, score, 14000, 21, "NoFinished");

    @Test
    public void getId() {
        assertEquals("23", match.getId());
    }

    @Test
    public void getUtcDate() {
        assertEquals("2019-02-09", match.getUtcDate());
    }


    @Test
    public void getAttendance() {
        assertEquals(14000, match.getAttendance());
    }

    @Test
    public void getMatchday() {
        assertEquals(21, match.getMatchday());
    }
}

