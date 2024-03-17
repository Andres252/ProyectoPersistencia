package co.edu.unbosque.model;

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
        Pattern format = Pattern.compile("[a-zA-Z]+");
        Matcher valid = format.matcher(name);
        if (valid.find()) this.name = name;
        else System.out.println("Formato no valido");
    }

    public void setStar(int star) {
        Pattern format = Pattern.compile("[0-9]+");
        Matcher valid = format.matcher(String.valueOf(star));
        if (valid.find()) this.star = star;
        else System.out.println("Formato no valido");
    }
}
