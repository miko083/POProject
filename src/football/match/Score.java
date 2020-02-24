package football.match;

public class Score {
    private String winner;
    private FullTime fullTime;

    public Score(String winner, FullTime fullTime) {
        this.winner = winner;
        this.fullTime = fullTime;
    }

    public String getWinner() {
        return winner;
    }

    public FullTime getFullTime() {
        return fullTime;
    }
}
