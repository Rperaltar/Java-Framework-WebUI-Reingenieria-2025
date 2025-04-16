package apachePOi;

import base.utils.ExcelUtilsConstant;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils extends ExcelUtilsConstant {

    /**
     * Retrieves data from an Excel file at the specified row and column.
     *
     * @param row    The row index (0-based) from which to retrieve the data.
     * @param column The column index (0-based) from which to retrieve the data.
     * @return The string value of the cell at the specified row and column, or null if an error occurs.
     * @throws IOException If there is an issue with file input/output operations.
     * @throws IllegalArgumentException If the specified row or column is invalid.
     * @throws NullPointerException If the cell at the specified location is null.
     */
    public static String getData(int row, int column) {
        try {
            FileInputStream fis = new FileInputStream(new File(FILE_PATH));
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            Row rowData = sheet.getRow(row);
            Cell cell = rowData.getCell(column);
            fis.close();
            return cell.getStringCellValue();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
