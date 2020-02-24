package gui;

import football.FootballSeason;
import football.team.NoTeamInListException;
import football.team.Team;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUILeagueTable extends JFrame {
    private JTable table;
    private FootballSeason season;
    public GUILeagueTable(String title, FootballSeason season) {

        super(title);
        this.season = season;

        setBounds(10,10,650,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GUILeagueTableModel tableModel = new GUILeagueTableModel(season);
        table = new JTable(tableModel);
        table.setAutoCreateRowSorter(true);
        table.getTableHeader().setEnabled(false);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(630,380));
        JPanel panel = new JPanel();
        panel.add(scrollPane);
        add(panel,BorderLayout.CENTER);
        int[] columnsWidth = {50, 180, 50, 50, 50, 50, 50, 50, 50 ,50};
        int i = 0;
        for (int width : columnsWidth) {
            TableColumn column = table.getColumnModel().getColumn(i++);
            column.setMinWidth(width);
            column.setMaxWidth(width);
            column.setPreferredWidth(width);
        }

        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2){
                    String name = tableModel.getValueAt(table.getSelectedRow(),2).toString();
                    Team temp = season.getLeagueTable().getStandings().get(0).getTable().get(table.getSelectedRow()).getTeam();
                    try {
                        int temp_int = season.getTeams().getTeam(temp);
                        temp = season.getTeams().getTeams().get(temp_int);
                        JOptionPane.showMessageDialog(new JFrame(name), temp.toString());
                    }
                    catch (NoTeamInListException exception){
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        //GUIScorersTable scorersApp = new GUIScorersTable("England Scorer");
        //scorersApp.setVisible(true);
    }
}
