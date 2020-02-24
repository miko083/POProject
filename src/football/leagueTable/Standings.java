package football.leagueTable;

import java.util.List;
import football.team.Team;

public class Standings {
    private String stage;
    private List<Table> table;

    public Standings(String stage, List<Table> table) {
        this.stage = stage;
        this.table = table;
    }

    public String getStage() {
        return stage;
    }

    public List<Table> getTable() {
        return table;
    }

    public void showInfo(){
        if (stage.equals("REGULAR_SEASON"))
            System.out.println("Stage: Regular season"); //Regular season == Home + Away matches

        for (Table table : table){
            Team team = table.getTeam();
            System.out.println();
            System.out.print(Integer.toString(table.getPosition()) + " " + team.getName() + " ");
            System.out.println(Integer.toString(table.getPoints()) + " points");
        }
    }
}



