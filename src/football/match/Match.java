package football.match;

import football.team.Team;
import football.Event;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Match implements Event {
    private String id;
    private String utcDate;
    private Team homeTeam;
    private Team awayTeam;
    private Score score;
    private int attendance;
    private int matchday;
    private LocalDateTime localDateTime;
    private LocalDate localDate;
    private String status;
    private boolean isFinished = false;
    private String notes;
    private boolean favorite;

    public Match(String id, String utcDate, Team homeTeam, Team awayTeam, Score score, int attendance, int matchday,String status) {
        this.id = id;
        this.utcDate = utcDate;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = score;
        this.attendance = attendance;
        this.matchday = matchday;
        this.status = status;
    }

    public String getId() {
        return id;
    }


    public String getUtcDate() {
        return utcDate;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public Score getScore() {
        return score;
    }

    public int getAttendance() {
        return attendance;
    }

    public int getMatchday() {
        return matchday;
    }

    public boolean getIsFinished() {
        return isFinished;
    }

    @Override
    public void setFavorite() {
        this.favorite = true;
    }

    public void resetFavorite(){
        this.favorite = false;
    }

    public String getEventName() {
        if (isFinished == true)
            return homeTeam.getName()  + " vs " + awayTeam.getName() + " " + Integer.toString(score.getFullTime().getHomeTeam()) + " : " + Integer.toString(score.getFullTime().getAwayTeam());
    return homeTeam.getName() + " vs " + awayTeam.getName();
    }

    public String getDate() {return utcDate;}

    public String getType() {return "football Event";}

    public String getNotes() {return notes;}

    public String getResults() {return Integer.toString(score.getFullTime().getHomeTeam()) + " : " + score.getFullTime().getAwayTeam();}

    public void update (){
        if(status.equals("FINISHED"))
            isFinished = true;
        localDateTime = UtcConverter.utcConverter(utcDate);
    }

    public void showInfo() {
        System.out.print(homeTeam.getName() + " vs " + awayTeam.getName());
        System.out.print(" " + Integer.toString(score.getFullTime().getHomeTeam()) + " : " + Integer.toString(score.getFullTime().getAwayTeam()) + " ");
        //System.out.print(utcDate.substring(8, 10) + "." + utcDate.substring(5, 7) + "." + utcDate.substring(0, 4) + " " + utcDate.substring(11, 13) + ":" + utcDate.substring(14, 16));
        System.out.print(localDateTime.toString());
        System.out.print(" Matchday " + Integer.toString(matchday));
        System.out.println(" Finished?: " + Boolean.toString(isFinished));
        //System.out.println(localDateTime.toString()); Doesnt work, dont know why :/
        //System.out.println("Attendance: " + attendance); Doesnt work, always 0. :( Probably fault on the server site.
    }

    public LocalDateTime getLocalDateTime(){
        int year = Integer.parseInt(utcDate.substring(0,4));
        int month = Integer.parseInt(utcDate.substring(5,7));
        int day = Integer.parseInt(utcDate.substring(8,10));
        int hour = Integer.parseInt(utcDate.substring(11,13));
        int minute = Integer.parseInt(utcDate.substring(14,16));
        localDateTime = LocalDateTime.of(year,month,day,hour,minute);
        return localDateTime;
    }

    public LocalDate getLocalDate(){
        int year = Integer.parseInt(utcDate.substring(0,4));
        int month = Integer.parseInt(utcDate.substring(5,7));
        int day = Integer.parseInt(utcDate.substring(8,10));
        localDate = LocalDate.of(year,month,day);
        return localDate;
    }

}