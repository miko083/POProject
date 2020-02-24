package football.team;


import java.util.List;

public class TeamsInSeason {
    private List<Team> teams;

    public TeamsInSeason(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public int getTeam (Team team)  throws NoTeamInListException {
        int i = 0;
        for (Team t : teams) {
            if (team.getName().toLowerCase().equals(t.getName().toLowerCase()))
                return i;
            else
                i++;
        }
        throw new NoTeamInListException();
    }

    public void showInfo() {
        for (Team team : teams) {
            System.out.println("team: " + team.getName());
        }
    }
}





