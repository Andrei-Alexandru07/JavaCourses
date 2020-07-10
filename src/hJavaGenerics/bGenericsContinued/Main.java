package hJavaGenerics.bGenericsContinued;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        FootballPlayer Joe = new FootballPlayer("Joe");
        BaseballPlayer Pat = new BaseballPlayer("Pat");
        SoccerPlayer Beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaidCrows = new Team<>("Adelaide Crows");
        adelaidCrows.addPlayer(Joe);
        //adelaidCrows.addPlayer(Pat);
        //adelaidCrows.addPlayer(Beckham);

        System.out.println(adelaidCrows.numberOfPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(Pat);
        //baseballTeam.addPlayer(Beckham);

        System.out.println(baseballTeam.numberOfPlayers());

        Team<SoccerPlayer> soccerTeam = new Team<>("LA Galaxy");
        soccerTeam.addPlayer(Beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<FootballPlayer> rangers = new Team<>("Rangers");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaidCrows, 3, 8);

        adelaidCrows.matchResult(fremantle,2,1);
        //adelaidCrows.matchResult(baseballTeam,1,1);
        adelaidCrows.matchResult(rangers,1,1);

        System.out.println();
        System.out.println("Rankings:");
        System.out.println();
        System.out.println(adelaidCrows.getTeamName() + ": " + adelaidCrows.ranking());
        System.out.println(melbourne.getTeamName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getTeamName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getTeamName() + ": " + hawthorn.ranking());
        System.out.println(rangers.getTeamName() + ": "  + rangers.ranking());

        System.out.println(hawthorn.compareTo(adelaidCrows));

        ArrayList<Team<FootballPlayer>> myRank = new ArrayList<>();
        myRank.add(adelaidCrows);
        myRank.add(melbourne);
        myRank.add(fremantle);
        myRank.add(hawthorn);
        myRank.add(rangers);
      //myRank.add(baseballTeam);

        Collections.sort(myRank);
        for (Team i : myRank){
            System.out.println(i.getTeamName() + ": " + i.ranking());
        }
    }
}
