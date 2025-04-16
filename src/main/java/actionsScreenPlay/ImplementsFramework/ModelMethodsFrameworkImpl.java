package actionsScreenPlay.ImplementsFramework;

import actionsScreenPlay.InterfacesFramework.ModelMethodsFrameworkInterface;

import base.utils.Constantes;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.DataProvider;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModelMethodsFrameworkImpl implements ModelMethodsFrameworkInterface {

    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelEventsImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de Eventos      #
    #  de Selenium.                          #
    #                                        #
    ##########################################
    */

    //Metodo generico para
    static WebDriver driver;

    //Metodo - crea un File.log es un resultado de las pruebas ejecutadas mediante los Verbos - HTTP's en el navegador
    public void getAnalyzeLogBrowser() throws IOException {

        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());

            FileOutputStream out = new FileOutputStream(Constantes.PATH_BROWSER_LOG + Constantes.NAME_BROWSER_LOG + Constantes.TIME_STAMP + Constantes.EXT_BROWSER_LOG);
            out.write(entry.toString().getBytes());
        }
    }

    //#############
    @DataProvider(name = "data-provider")
    public void dataProviderMethod(String value1, String value2){
    }

    //#############
    //Variables - para definir el Objeto y la configuración del Reporte Extent -Report-HTML
    public static ExtentReports extent;
    public static ExtentTest test;

    //Metodo - Crea un Objeto de tipo htmlReporter para generar un reporte de Resultados en un archivo de tipo Ext.HTML
    public void initReport() {

        String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
        String path = "C:\\Users\\Usuario\\Documents\\PY-POM Selenium\\Reingenieria\\MultivaTestAutomation\\Reports\\";
        String name = "extentReport_";
        String ext = ".html";

        // initialize the HtmlReporter
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(path + name + timestamp + ext);
        // initialize ExtentXReporter (deprecated)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("Prueba Report Login", "Extent Report");

    }

    //############
    String fileName = Constantes.PATH_EXTENT_REPORT + Constantes.PATH_NAME + Constantes.PATH_EXTENSION;
    //Crea extent report - object
    public void ExtentReport(){

        extent = new ExtentReports();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("Reporte de Pruebas");
        htmlReporter.config().setEncoding("uft-8");
        htmlReporter.config().setReportName("QA");

        extent.attachReporter(htmlReporter);
    }

    //Crea captura de pantalla dentro - Extent report - object
    public void ExtentReportAshot() throws IOException {
        File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(image.toPath(),new File(Constantes.PATH_ASHOT + Constantes.EXT_ASHOT + Constantes.NAME_ASHOT).toPath());
    }
    //Cierra y finaliza - Extent report - object
    public void FlushReport(){
        extent.flush();
    }

    //############
    //Variables -- para definir la lectura de el libro de Excel.xlsx y la hoja de Excel a leer
    public static XSSFWorkbook wb;
    public static XSSFSheet sheet;

    // Se crea un Objeto - que lea el Libro de Archivo "Excel.xlsx" de una Ruta especifica
    public void PoiReadExcel(String excelPath) throws IOException {

        FileInputStream file = new FileInputStream(excelPath);
        wb = new XSSFWorkbook(file);
    }
    /*
    Se crea un Objeto - que lea las columnas y registros del Archivo "Excel.xlsx"
    tanto pára el dato como para la columna especifica a Obtener en el parseo de los Inputs a Inyectar
    */
    public void readData(int row, int column) {

        sheet = wb.getSheet("Inputs_Test");
        String data = sheet.getRow(row).getCell(column).getStringCellValue();
        System.out.println(data);
    }

    //##########
    //Metodo - que crea los Objetos de tipo "WebDriver - HtmlUnitDriver" para hacer la pruebas sin navegador
    public void getHtmlUnitDriver() {
        //Driver for HtmlUnitDriver
        HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.getDefault());
        driver.setJavascriptEnabled(true);
        // Se crean Opciones para hacer el setBrowser del objeto HtmlUnitDriver
    }

    //##########
    //Crea un Objeto - Para generar imagenes con formato tipo "File.png"
    public void initScreenShot(String path) throws IOException, AWTException {

        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, ".jpg", new File(path + Constantes.NAME_ASHOT + Constantes.TIME_STAMP + Constantes.EXT_ASHOT));
    }

    //##########
    //Crea un Objeto - Para generar imagenes con formato tipo "File.png"
    public void getScreenShot(String path) throws IOException {

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(path + Constantes.NAME_ASHOT + Constantes.EXT_ASHOT));
    }

}
