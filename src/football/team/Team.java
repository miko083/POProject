package football.team;

public class Team {
    private String id;
    private String name;
    private String venue;
    private String clubColors;
    private String address;


    public Team(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public Team(String id, String name, String venue,String clubColors,String address) {
        this.id = id;
        this.name = name;
        this.venue = venue;
        this.clubColors = clubColors;
        this.address = address;
    }

    public String getClubColors() {
        return clubColors;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVenue() {
        return venue;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Venue: " + venue);
        System.out.println("Club Colors: " + clubColors);
        System.out.println("Address: " + address);
    }


    public String toString(){
        return "Name: " + this.name + "\nVenue: " + this.venue + "\nClub Colors: " + this.clubColors + "\nAddress: " + this.address;
    }


}

