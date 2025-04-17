package base.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class ReadFileTxtPoi {

    /**
     * Reads a credentials file and parses its contents into a map.
     * Each line in the file should be in the format "key=value".
     * Lines that do not conform to this format are ignored.
     *
     * @param filePath The path to the credentials file.
     * @return A map containing the parsed key-value pairs from the file.
     *         Keys and values are trimmed of leading and trailing whitespace.
     * @throws RuntimeException if an I/O error occurs while reading the file.
     */
    public static Map<String, String> readCredentials(String filePath) {
        Map<String, String> credentials = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.print(reader);
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    credentials.put(parts[0].trim(), parts[1].trim());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return credentials;
    }
}
