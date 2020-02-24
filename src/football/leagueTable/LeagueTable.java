package football.leagueTable;

import java.util.List;

public class LeagueTable {
    private List<Standings> standings;

    public LeagueTable(List<Standings> standings) {
        this.standings = standings;
    }


    public List<Standings> getStandings() {
        return standings;
    }


    public void showInfo(){
        standings.get(0).showInfo(); //There are three standings. We want only first one which has table of home + away matches.
    }
}

