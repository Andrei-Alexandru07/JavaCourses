package hJavaGenerics.cGenericsChallenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String leagueName;
    private ArrayList<T> leagueTeams;

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.leagueTeams = new ArrayList<>();
    }

    public boolean addTeam(T team){
        if (leagueTeams.contains(team)){
            return false;
        }
        this.leagueTeams.add(team);
        return true;
    }

    public void showLeagueTable(){
        Collections.sort(this.leagueTeams);
        int count = 1;
        for (T t : this.leagueTeams) {
            System.out.println(count + ". " + t.getTeamName() + ": " + t.ranking() +"p");
            count++;
        }
    }
}
