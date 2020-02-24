package football.scoresTable;

import football.Player;

import java.util.List;

public class ScorersTable {
    private List<Scorer> scorers;

    public ScorersTable(List<Scorer> scorers) {
        this.scorers = scorers;
    }

    public List<Scorer> getScorers() {
        return scorers;
    }

    public void update(){
        for (Scorer scorer: scorers)
            scorer.update();
    }

    public void showInfo() {
        for (Scorer scorer : scorers) {
            Player player = scorer.getPlayer();
            System.out.print(player.getName() +  " ");
            System.out.println(Integer.toString(scorer.getNumberOfGoals()) + " goals");
        }
    }
}
