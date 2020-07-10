package hJavaGenerics.bGenericsContinued;

import java.util.ArrayList;

public class Team<T extends Player > implements Comparable<Team<T>> { // instead of "public class Team {...}" This will only accept objects of type
                                                                      // or of types which are derived from Player class
    private String teamName;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> teamMembers = new ArrayList<>(); // instead of "private ArrayList<Player> teamMembers = new ArrayList<>();"

    public Team(String teamName){
        this.teamName = teamName;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public boolean addPlayer(T player){     // instead of "public boolean addPlayer(T player){...}"
        if(teamMembers.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            teamMembers.add(player);
            System.out.println(player.getName() + " picked for team " + this.teamName);
            return true;
        }
    }

    public int numberOfPlayers() {
        return this.teamMembers.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if (ourScore > theirScore) {
            this.won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            this.tied++;
            message = " drew with ";
        } else {
            this.lost++;
            message = " lost to ";
        }
        this.played++;
        // Saving the result for our team and by calling the method again with null, we update their score stats also
        if (opponent != null) {
            System.out.println(this.getTeamName() + message + opponent.getTeamName() + " : " + ourScore + " - " + theirScore + ".");
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won*3) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        }
        return 0;
    }
}
