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

    public static String excelPath  = "src/main/resources/Input.xlsx/";
    public static String sheetName  = "Hoja1";
    ExcelTypesUtil excelTypesUtil;

    public void ExcelUtils(String excelPath, String sheetName) {
        excelTypesUtil.ExcelUtilsMethod(excelPath,sheetName);
    }
    public String getCellData(int rowNum, int colNum) {
        excelTypesUtil.getCellDataMethod(rowNum,colNum);
        return "";
    }

    public void ExcelUtilsMethod(String excelPath, String sheetName) {
        try {
            FileInputStream file = new FileInputStream(excelPath);
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
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