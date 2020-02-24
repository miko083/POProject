package gui;

import football.FootballSeason;

import javax.swing.table.*;


public class GUILeagueTableModel extends AbstractTableModel{
    private String[] columnNames = {"Position","team","Points","Matches","Wins","Draws","Loses","GF","GA","+/-"};
    private FootballSeason season;
    public GUILeagueTableModel (FootballSeason season){
        this.season = season;
    }
    public int getColumnCount(){
        return columnNames.length;
    }
    public int getRowCount(){
        return season.getLeagueTable().getStandings().get(0).getTable().size();
    }

    public Object getValueAt(int row, int col){
        Object temp = null;
        if (col == 0){
            temp = season.getLeagueTable().getStandings().get(0).getTable().get(row).getPosition();
        }
        else  if (col == 1){
            temp = season.getLeagueTable().getStandings().get(0).getTable().get(row).getTeam().getName();
        }
        else if(col == 2){
            temp = season.getLeagueTable().getStandings().get(0).getTable().get(row).getPoints();
        }
        else if (col == 3){
            temp = season.getLeagueTable().getStandings().get(0).getTable().get(row).getPlayedGames();
        }
        else if (col == 4){
            temp = season.getLeagueTable().getStandings().get(0).getTable().get(row).getWon();
        }
        else if (col == 5){
            temp = season.getLeagueTable().getStandings().get(0).getTable().get(row).getDraw();
        }
        else if (col == 6){
            temp = season.getLeagueTable().getStandings().get(0).getTable().get(row).getLost();
        }
        else if (col == 7){
            temp = season.getLeagueTable().getStandings().get(0).getTable().get(row).getGoalsFor();
        }
        else if (col == 8){
            temp = season.getLeagueTable().getStandings().get(0).getTable().get(row).getGoalsAgainst();
        }
        else if (col == 9){
            temp = season.getLeagueTable().getStandings().get(0).getTable().get(row).getGoalsFor() - season.getLeagueTable().getStandings().get(0).getTable().get(row).getGoalsAgainst();
        }
        return temp;
    }

    public String getColumnName (int col){
        return columnNames[col];
    }
    public Class getColumnClass(int col){
        if (col == 1){
            return String.class;
        }
        else
            return Integer.class;
    }
}