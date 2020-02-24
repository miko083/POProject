package motorSport;

public interface Table {
    void addTablePole(String name, String team, int points);
    String getLeader();
    String getPlace(int num);
    void sortByScores();
    void printTable();
}
