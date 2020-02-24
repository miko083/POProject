package football.scoresTable;

import football.Player;

public class Scorer {
    private Player player;
    private int numberOfGoals;

    public Scorer(Player player, int numberOfGoals) {
        this.player = player;
        this.numberOfGoals = numberOfGoals;
    }

    public void update(){
        player.update();
    }

    public Player getPlayer() {
        return player;
    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

}
