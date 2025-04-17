package base.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CsvWriter extends Constant {

    /**
     * Constructor for the CsvWriter class.
     * Initializes the CsvWriter with the specified file path.
     *
     * Note: Ensure that the variable `FilePath` is properly defined and assigned
     * before calling this constructor, as it is used to initialize the `filePath` field.
     */
    public CsvWriter( ) {
        this.filePath = FilePath;
    }

    /**
     * Writes a header row to a file, with the provided headers joined by commas.
     * The file is overwritten if it already exists.
     *
     * @param headers An array of strings representing the header values to be written.
     * @throws IOException If an I/O error occurs while writing to the file.
     */
    public void writeHeader(String[] headers) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, false))) {
            writer.println(String.join(",", headers));
        }
    }

    /**
     * Appends a new row of data to a file specified by the filePath.
     * Each element in the rowData array is joined with a comma to form a CSV row.
     *
     * @param rowData An array of strings representing the data for the new row.
     * @throws IOException If an I/O error occurs while writing to the file.
     */
    public void addRow(String[] rowData) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println(String.join(",", rowData));
        }
    }
}
