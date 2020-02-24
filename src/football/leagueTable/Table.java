package football.leagueTable;

import football.team.Team;

public class Table {
    private int position;
    private Team team;
    private int playedGames;
    private int won;
    private int draw;
    private int lost;
    private int points;
    private int goalsFor;
    private int goalsAgainst;

    public Table(int position, Team team, int playedGames, int won, int draw, int lost, int points, int goalsFor, int goalsAgainst) {
        this.position = position;
        this.team = team;
        this.playedGames = playedGames;
        this.won = won;
        this.draw = draw;
        this.lost = lost;
        this.points = points;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public int getPosition() {
        return position;
    }

    public Team getTeam() {
        return team;
    }

    public int getPlayedGames() {
        return playedGames;
    }

    public int getWon() {
        return won;
    }

    public int getDraw() {
        return draw;
    }

    public int getLost() {
        return lost;
    }

    public int getPoints() {
        return points;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }
}
