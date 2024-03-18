package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.Orchestrator;
import co.edu.unbosque.util.AliasException;
import co.edu.unbosque.util.NullExeception;

import java.util.ArrayList;

public class League {
    private final Team team;
    private final Orchestrator orchestrator;
    private final ArrayList<Team> clubs;

    public League() {
        orchestrator = new Orchestrator();
        clubs = new ArrayList<>();
        team = new Team();
    }

    private void cleanLeague() {
        clubs.clear();
    }

    public void initArrayElements() {
        for (int i = 1; orchestrator.read("id" + i) != null; i++) {

            int id = Integer.parseInt(orchestrator.read("id" + i));
            String name = orchestrator.read("equipo" + i);
            int start = Integer.parseInt(orchestrator.read("estrellas" + i));

            Team team = new Team();

            team.setId(id);
            team.setName(name);
            team.setStar(start);
            clubs.add(team);
        }
    }

    private boolean findIdClub(int id) {
        return id == Integer.parseInt(orchestrator.read("id" + id));
    }

    private int findNameClub(String name) {
        int res = -1;
        for (Team club : clubs) {
            if (name.equalsIgnoreCase(club.getName())) {
                res = 0;
                break;
            }
        }
        return res;
    }

    public void addClub(String name, int start) {
        try {
            if (findNameClub(name) != -1) throw new AliasException("El equipo ya existe");

            orchestrator.write("id" + clubs.size(), String.valueOf(clubs.size()));
            orchestrator.write("equipo" + clubs.size(), name);
            orchestrator.write("estrellas" + clubs.size(), String.valueOf(start));

            cleanLeague();
            initArrayElements();
        } catch (AliasException e) {
            System.out.println(e.getMessage());
        }
    }

    public void patchClub(int id, String name) {
        try {
            if (findNameClub(name) != -1) throw new AliasException("El nombre del equipo ya existe");

            if (!findIdClub(id)) throw new NullExeception("El equipo no existe");

            orchestrator.write("equipo" + id, name);

            cleanLeague();
            initArrayElements();
        } catch (AliasException | NullExeception e) {
            System.out.println(e.getMessage());
        }
    }

    public void patchClub(int id, int start) {
        try {
            if (!findIdClub(id)) throw new NullExeception("El equipo no existe");

            orchestrator.write("estrellas" + id, String.valueOf(start));

            cleanLeague();
            initArrayElements();
        } catch (NullExeception e) {
            System.out.println(e.getMessage());
        }
    }

    public void destroyClub(int id) {
        try {
            if (!findIdClub(id)) throw new NullExeception("El equipo no existe");

            if (id == clubs.size()) {
                orchestrator.ban("id" + id);
                orchestrator.ban("equipo" + id);
                orchestrator.ban("estrellas" + id);
            } else {
                for (int i = id; orchestrator.read("id" + (i + 1)) != null; i++) {
                    orchestrator.write("id" + i, orchestrator.read("id" + (i + 1)));
                    orchestrator.write("equipo" + i, orchestrator.read("equipo" + (i + 1)));
                    orchestrator.write("estrellas" + i, orchestrator.read("estrellas" + (i + 1)));
                }
                orchestrator.ban("id" + clubs.size());
                orchestrator.ban("equipo" + clubs.size());
                orchestrator.ban("estrellas" + clubs.size());
            }
            cleanLeague();
            initArrayElements();
        } catch (NullExeception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Team> getClubs() {
        return clubs;
    }
}
