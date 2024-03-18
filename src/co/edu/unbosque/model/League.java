package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Orchestrator;

import java.util.ArrayList;

public class League {
    private final Orchestrator orchestrator;
    private final ArrayList<Team> clubs;

    public League() {
        orchestrator = new Orchestrator();
        clubs = new ArrayList<>();
        initArrayElements();
    }

    public void initArrayElements() {
        for (int i = 1; orchestrator.read("estrellas" + i) != null; i++) {
            String name = orchestrator.read("equipo" + i);
            int start = Integer.parseInt(orchestrator.read("estrellas" + i));

            Team team = new Team();

            team.setName(name);
            team.setStar(start);
            clubs.add(team);
        }
    }

    public ArrayList<Team> getClubs() {
        return clubs;
    }
}
