package main;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DatabaseProperties {
    private final String PROPERTIES_URL = "./database.properties";

    private String url;
    private String user;
    private String pass;

    public DatabaseProperties() {
        Properties props = getProperties();
        this.url = props.getProperty("db.url");
        this.user = props.getProperty("db.user");
        this.pass = props.getProperty("db.pass");
    }

    public String getUrl() {
        return this.url;
    }

    public String getUser() {
        return this.user;
    }

    public String getPass() {
        return this.pass;
    }

    private Properties getProperties() {
        Properties props = new Properties();

        try (FileInputStream in = new FileInputStream(PROPERTIES_URL)) {
            props.load(in);
        } catch (IOException e) {
            System.err.println("Configuration file not found\nAborting...");
            System.exit(2);
        }

        return props;
    }
}
