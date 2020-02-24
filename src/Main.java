import com.google.gson.JsonSyntaxException;
import football.*;
import gui.*;

public class Main {
    public static void main(String[] args) {
        try {
            FootballSeason englandSeason = new FootballSeason("2021");
            FootballSeason italySeason = new FootballSeason("2019");

            GUILeagueTable englandTable = new GUILeagueTable("England Table", englandSeason);
            englandTable.setVisible(true);
            GUIScorersTable englandScorers = new GUIScorersTable("England Scorers", englandSeason);
            englandScorers.setVisible(true);

            GUILeagueTable italyTable = new GUILeagueTable("Italy Table", italySeason);
            italyTable.setVisible(true);
            GUIScorersTable italyScorers = new GUIScorersTable("Italy Scorers", italySeason);
            italyScorers.setVisible(true);
        }
        catch (JsonSyntaxException e){
            System.out.println("Too many requests.");
        }

    }
}
