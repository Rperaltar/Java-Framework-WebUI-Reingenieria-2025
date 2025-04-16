package apachePOi;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

import static java.sql.Types.BOOLEAN;
import static java.sql.Types.NUMERIC;
import static org.apache.xmlbeans.impl.piccolo.xml.Piccolo.STRING;

public class ExcelTypesUtil {
    private Workbook workbook;
    private Sheet sheet;
    /**
     * The file path to the Excel file used as input.
     * This path points to the "input.xlsx" file located in the "src/main/resources" directory.
     * Note: Ensure the file exists at the specified location to avoid runtime errors.
     */
    public static String excelPath  = "src/main/resources/input.xlsx/";
    public static String sheetName  = "Hoja1";
    ExcelTypesUtil excelTypesUtil;

    /**
     * Retrieves the data from a specific cell in an Excel sheet.
     *
     * @param rowNum The row number of the cell (0-based index).
     * @param colNum The column number of the cell (0-based index).
     * @return A string representing the data in the specified cell.
     */
    public void ExcelUtils(String excelPath, String sheetName) {
        excelTypesUtil.ExcelUtilsMethod(excelPath,sheetName);
    }
    public String getCellData(int rowNum, int colNum) {
        excelTypesUtil.getCellDataMethod(rowNum,colNum);
        return "";
    }
    /**
     * Initializes the workbook and sheet objects for the specified Excel file and sheet name.
     *
     * @param excelPath The file path of the Excel file to be accessed.
     * @param sheetName The name of the sheet within the Excel file to be accessed.
     * @throws IOException If an I/O error occurs while accessing the file.
     */
    public void ExcelUtilsMethod(String excelPath, String sheetName) {
        try {
            FileInputStream file = new FileInputStream(excelPath);
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Retrieves the data from a specific cell in a spreadsheet based on the given row and column numbers.
     *
     * @param rowNum The row number of the cell (0-based index).
     * @param colNum The column number of the cell (0-based index).
     * @return The cell data as a String. If the cell contains:
     *         - A string value, it returns the string.
     *         - A numeric value, it converts the number to a string.
     *         - A boolean value, it converts the boolean to a string.
     *         - Any other type, it returns an empty string.
     */
    public String getCellDataMethod(int rowNum, int colNum) {
        Cell cell = sheet.getRow(rowNum).getCell(colNum);
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return "";
        }
    }
}