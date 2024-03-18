package co.edu.unbosque.model;

import co.edu.unbosque.util.InvalidFormatException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Team {
    private int id;
    private String name;
    private int star;

    public Team() {
        id = 0;
        name = "unknown";
        star = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStar() {
        return star;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        try {
            Pattern format = Pattern.compile("[a-zA-Z ]+");
            Matcher valid = format.matcher(name);
            if (valid.find()) this.name = name;
            else throw new InvalidFormatException("El nombre solo puede tener letras");
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setStar(int star) {
        try {
            Pattern format = Pattern.compile("^[1-9][0-9]*$");
            Matcher valid = format.matcher(String.valueOf(star));
            if (valid.find()) this.star = star;
            else throw new InvalidFormatException("Las estrellas puede ser un numero natural");
        } catch (InvalidFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
