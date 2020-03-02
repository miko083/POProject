package football;

import football.json.JsonImport;
import football.leagueTable.LeagueTable;
import football.match.MatchesAllSeason;
import football.scoresTable.ScorersTable;
import football.team.TeamsInSeason;
import gui.GUILeagueTable;
import gui.GUIScorersTable;

public class FootballSeason {
    private MatchesAllSeason matchesAllSeason;
    private TeamsInSeason teams;
    private ScorersTable scorersTable;
    private LeagueTable leagueTable;

    private GUILeagueTable guiLeagueTable;
    private GUIScorersTable guiScorersTable;

    public FootballSeason(String competitionID, String nameOfCountry) {
        this.matchesAllSeason = JsonImport.importMatchesFPM(competitionID);
        this.teams = JsonImport.importTemsinSeason(competitionID);
        this.scorersTable = JsonImport.importScoreTable(competitionID);
        this.leagueTable = JsonImport.importLeagueTable(competitionID);
        this.guiLeagueTable = new GUILeagueTable(nameOfCountry + " Table", leagueTable, teams );
        this.guiScorersTable = new GUIScorersTable(nameOfCountry + "Table", scorersTable );
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

    public void setVisible(){
        guiLeagueTable.setVisible(true);
        guiScorersTable.setVisible(true);
    }


}



