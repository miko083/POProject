import com.google.gson.JsonSyntaxException;
import football.*;
import gui.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<FootballSeason> footballSeasons = new ArrayList<>(2);
            footballSeasons.add(new FootballSeason("2021", "England"));
            footballSeasons.add(new FootballSeason("2019", "Italy"));

            for (FootballSeason footballSeason : footballSeasons){
                footballSeason.setVisible();
            }
        }

        catch (JsonSyntaxException e){
            System.out.println("Too many requests.");
        }

    }
}
