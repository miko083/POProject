package football;

import football.json.JsonImport;
import football.leagueTable.LeagueTable;
import football.match.MatchesAllSeason;
import football.scoresTable.ScorersTable;
import football.team.TeamsInSeason;

public class FootballSeason {
    private MatchesAllSeason matchesAllSeason;
    private TeamsInSeason teams;
    private ScorersTable scorersTable;
    private LeagueTable leagueTable;

    public FootballSeason(String competitionID) {
        this.matchesAllSeason = JsonImport.importMatchesFPM(competitionID);
        this.teams = JsonImport.importTemsinSeason(competitionID);
        this.scorersTable = JsonImport.importScoreTable(competitionID);
        this.leagueTable = JsonImport.importLeagueTable(competitionID);
    }

    public void showInfo() {
        matchesAllSeason.showInfo();
        teams.showInfo();
        scorersTable.showInfo();
        leagueTable.showInfo();
    }

    public void update(){
        scorersTable.update();
        matchesAllSeason.update();
    }

    public MatchesAllSeason getMatchesAllSeason() {
        return matchesAllSeason;
    }

    public TeamsInSeason getTeams() {
        return teams;
    }

    public ScorersTable getScorersTable() {
        return scorersTable;
    }

    public LeagueTable getLeagueTable() {
        return leagueTable;
    }


}



