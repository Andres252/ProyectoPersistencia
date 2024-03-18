package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Orchestrator {
    private final File file;
    private final Properties data;

    public Orchestrator() {
        file = new File("src//data//leaderboard.properties");
        data = new Properties();
    }

    public String read(String key) {
        String res;
        try {
            data.load(new FileInputStream(file));
            res = data.getProperty(key);
        } catch (IOException ex) {
            return null;
        }
        return res;
    }

    public void write(String key, String value) {
        try {
            data.setProperty(key, value);
            data.store(new FileOutputStream(file), null);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void ban(String key) {
        try {
            data.remove(key);
            data.store(new FileOutputStream(file), null);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
