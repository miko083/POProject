package gui;

import football.FootballSeason;
import football.scoresTable.ScorersTable;

import javax.swing.table.*;


public class GUIScorersTableModel extends AbstractTableModel{
    private String[] columnNames = {"Number","Name","Goals"};
    private ScorersTable scorersTable;
    public GUIScorersTableModel (ScorersTable scorersTable){
        this.scorersTable = scorersTable;
    }
    public int getColumnCount(){
        return columnNames.length;
    }
    public int getRowCount(){ return scorersTable.getScorers().size();
    }

    public Object getValueAt(int row, int col){
        Object temp = null;
        if (col == 0){
            temp = row + 1;
        }
        else  if (col == 1){
            temp = scorersTable.getScorers().get(row).getPlayer().getName();
        }
        else if(col == 2){
            temp = scorersTable.getScorers().get(row).getNumberOfGoals();
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