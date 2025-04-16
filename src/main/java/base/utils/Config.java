package base.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private Properties properties;
    /**
     * Constructor for the Config class.
     * Initializes a Properties object and loads properties from the
     * "src/main/resources/log4j.properties" file.
     *
     * If an IOException occurs during file reading or property loading,
     * the stack trace is printed to the standard error stream.
     */
    public Config() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/log4j.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}