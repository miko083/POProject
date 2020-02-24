package football.json;

import football.leagueTable.LeagueTable;
import football.match.MatchesAllSeason;
import football.Player;
import football.scoresTable.ScorersTable;
import football.team.TeamsInSeason;
import com.google.gson.Gson;

public class JsonImport {

    //public String url = "https://api.football-data.org/v2/";

    public static Player importPlayer(String playerID){

        String url = "https://api.football-data.org/v2/players/" + playerID;

        Gson gson = new Gson();
        Player player = gson.fromJson(JsonService.JsonString(url),Player.class);
        return player;
    }


    public static LeagueTable importLeagueTable (String competitionID){

        String url = "https://api.football-data.org/v2/competitions/" + competitionID + "/standings";

        Gson gson = new Gson();
        LeagueTable leagueTable = gson.fromJson(JsonService.JsonString(url),LeagueTable.class);
        return leagueTable;
    }

    public static MatchesAllSeason importMatchesFPM (String competitionID){

        String url = "https://api.football-data.org/v2/competitions/" + competitionID + "/matches";

        Gson gson = new Gson();
        MatchesAllSeason matchesAllSeason = gson.fromJson(JsonService.JsonString(url), MatchesAllSeason.class);
        return  matchesAllSeason;
    }

    public static ScorersTable importScoreTable (String competitionID){

        String url = "https://api.football-data.org/v2/competitions/" + competitionID + "/scorers";

        Gson gson = new Gson();
        ScorersTable scorersTable = gson.fromJson(JsonService.JsonString(url), ScorersTable.class);
        return scorersTable;
    }

    public static TeamsInSeason importTemsinSeason (String competitionID){

        String url = "https://api.football-data.org/v2/competitions/" + competitionID + "/teams";

        Gson gson = new Gson();
        TeamsInSeason teamsInSeason = gson.fromJson(JsonService.JsonString(url), TeamsInSeason.class);
        return teamsInSeason;
    }

}
