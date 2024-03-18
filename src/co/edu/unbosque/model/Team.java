package co.edu.unbosque.model;

import co.edu.unbosque.util.InvalidException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Team {
    private String name;
    private int star;

    public Team() {
        name = "unknown";
        star = 0;
    }

    public String getName() {
        return name;
    }

    public int getStar() {
        return star;
    }

    public void setName(String name) {
        try {

            Pattern format = Pattern.compile("[a-zA-Z]+");
            Matcher valid = format.matcher(name);
            if (valid.find()) this.name = name;
            else throw new InvalidException("El nombre solo puede tener letras");
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setStar(int star) {
        try {
            Pattern format = Pattern.compile("[0-9]+");
            Matcher valid = format.matcher(String.valueOf(star));
            if (valid.find()) this.star = star;
            else throw new InvalidException("El nombre solo puede tener letras");
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }
    }
}
