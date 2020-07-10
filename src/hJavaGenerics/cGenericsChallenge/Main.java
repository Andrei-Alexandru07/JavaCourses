package hJavaGenerics.cGenericsChallenge;

public class Main {

    public static void main(String[] args) {
	// write your code here

        League<Team<FootballPlayer>> footballLeague = new League<>("La Liga");
        Team<FootballPlayer> barcelona = new Team<>("Barcelona FC");
        Team<FootballPlayer> realMadrid = new Team<>("Real Madrid FC");
        Team<FootballPlayer> atleticoMadrid = new Team<>("Atletico Madrid");
        Team<FootballPlayer> sevilla = new Team<>("Sevilla FC");

        footballLeague.addTeam(barcelona);
        footballLeague.addTeam(realMadrid);
        footballLeague.addTeam(atleticoMadrid);
        footballLeague.addTeam(sevilla);

        FootballPlayer cr7 = new FootballPlayer("Cristiano Ronaldo");
        realMadrid.addPlayer(cr7);

        System.out.println();

        realMadrid.matchResult(barcelona,3,1);
        realMadrid.matchResult(atleticoMadrid,5,0);
        barcelona.matchResult(sevilla,1,1);
        barcelona.matchResult(atleticoMadrid,2,1);
        atleticoMadrid.matchResult(sevilla,3,1);
        sevilla.matchResult(atleticoMadrid,2,2);

        System.out.println();
        System.out.println("Clasament:");
        System.out.println();
        footballLeague.showLeagueTable();
    }
}
