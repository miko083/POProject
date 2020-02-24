package gui;

import football.FootballSeason;

import javax.swing.table.*;


public class GUIScorersTableModel extends AbstractTableModel{
    private String[] columnNames = {"Number","Name","Goals"};
    private FootballSeason season;
    public GUIScorersTableModel (FootballSeason season){
        this.season = season;
    }
    public int getColumnCount(){
        return columnNames.length;
    }
    public int getRowCount(){ return season.getScorersTable().getScorers().size();
    }

    public Object getValueAt(int row, int col){
        Object temp = null;
        if (col == 0){
            temp = row + 1;
        }
        else  if (col == 1){
            temp = season.getScorersTable().getScorers().get(row).getPlayer().getName();
        }
        else if(col == 2){
            temp = season.getScorersTable().getScorers().get(row).getNumberOfGoals();
        }
        return temp;
    }

    public String getColumnName (int col){
        return columnNames[col];
    }
    public Class getColumnClass(int col){
        if (col == 0){
            return Integer.class;
        }
        else
            return String.class;
    }
}