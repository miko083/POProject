package gui;

import football.FootballSeason;
import football.scoresTable.ScorersTable;


import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUIScorersTable extends JFrame {
    private JTable table;
    private ScorersTable scorersTable;
    public GUIScorersTable (String title, ScorersTable scorersTable) {

        super(title);
        this.scorersTable = scorersTable;

        setBounds(10,10,300,230);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GUIScorersTableModel tableModel = new GUIScorersTableModel(scorersTable);
        table = new JTable(tableModel);
        table.setAutoCreateRowSorter(true);
        table.getTableHeader().setEnabled(false);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(280,210));
        JPanel panel = new JPanel();
        panel.add(scrollPane);
        add(panel,BorderLayout.CENTER);
        int[] columnsWidth = {50, 180, 50};
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
                    JOptionPane.showMessageDialog(new JFrame(name),
                            scorersTable.getScorers().get(table.getSelectedRow()).getPlayer().toString());
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
