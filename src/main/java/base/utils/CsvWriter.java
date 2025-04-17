package base.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CsvWriter {

    private String filePath;
    private String FilePath = "output/data.csv";

    public CsvWriter( ) {
        this.filePath = FilePath;
    }

    public void writeHeader(String[] headers) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, false))) {
            writer.println(String.join(",", headers));
        }
    }

    public void addRow(String[] rowData) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println(String.join(",", rowData));
        }
    }
}
