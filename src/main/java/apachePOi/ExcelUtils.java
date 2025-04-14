package apachePOi;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelUtils {

    private static final String FILE_PATH = "resources/input.xlsx/";

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
