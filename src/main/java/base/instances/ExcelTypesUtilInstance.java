package base.instances;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelTypesUtilInstance {

    /**
     * Represents a workbook instance, typically used for managing and manipulating
     * spreadsheet data. This object may provide access to sheets, cells, and other
     * workbook-related functionalities.
     */
    public Workbook workbook;
    public Sheet sheet;

    /**
     * The file path to the Excel file used as input.
     * This path points to the "input.xlsx" file located in the "src/main/resources" directory.
     * Note: Ensure the file exists at the specified location to avoid runtime errors.
     */
    public static String excelPath  = "src/main/resources/input.xlsx/";
    public static String sheetName  = "Hoja1";


}