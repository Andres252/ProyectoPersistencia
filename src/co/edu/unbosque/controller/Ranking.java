package co.edu.unbosque.controller;

import co.edu.unbosque.model.League;
import co.edu.unbosque.model.Team;

public class Ranking {
    League league;

    public Ranking() {
        league = new League();
    }
    public void run() {
       for (Team club: league.getClubs()) {
           System.out.println(club.getName());
           System.out.println(club.getStar());
       }
    }
}
