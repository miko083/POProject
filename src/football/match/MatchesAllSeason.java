package football.match;

import java.util.List;

public class MatchesAllSeason {
    private List<Match> matches;
    //private List<LocalDateTime> localDateTimes;

    public MatchesAllSeason(List<Match> matches) {
        this.matches = matches;
        //this.localDateTimes = new LinkedList<>();
    }

    public List<Match> getMatches() { return matches;}

    public void update(){
        for (Match match: matches)
            match.update();
    }

    public void showInfo(){
        for (Match match : matches)
            match.showInfo();
    }
}

    /*
    public void showInfo() {
        //System.out.println("Matchday: " + Integer.toString(matches.get(0).getMatchday()));
        //for(int i = 1; i < matches.size() + 1; i++){
            //if (matches.get(i-1).getMatchday() != matches.get(i).getMatchday())
                //System.out.println("Matchday: " + Integer.toString(matches.get(i).getMatchday()));
            //matches.get(i).ShowInfo();
        //}
        //System.out.println("Matchday: " + Integer.toString(matches.get(0).getMatchday())); // Matchday is the same for all matches, so I take only from the first one.
        for (match match : matches)
            match.showInfo();
    }

   // public List<LocalDateTime> getLocalDateTimes (){ //Not necessary really.
   //     List<LocalDateTime> localDateTimes = new LinkedList<>();
   //     for (match match: matches)
  //         localDateTimes.add(match.getLocalDateTime());
 //       return localDateTimes;
   // }
}
*/