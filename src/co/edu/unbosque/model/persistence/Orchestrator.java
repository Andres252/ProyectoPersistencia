package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Orchestrator {
    final private File file;
    private final Properties data;

    public Orchestrator() {
        file = new File("data\\leaderboard.properties");
        data = new Properties();
    }

    public void read() throws IOException {
        try {
            FileInputStream in = new FileInputStream(file);
            data.load(in);
            in.close();
        } catch (IOException e) {
            throw new IOException("Formato Inv�lido");
        }
    }

    public void write(String key, String value) throws IOException {
        try {
            data.setProperty(key, value);
            data.store(new FileOutputStream(file), null);
        } catch (IOException e) {
            throw new IOException("Formato Inv�lido");
        }
    }
}
