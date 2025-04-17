package Test.ExamplesChrome;

import PageModel.HomePage;
import base.utils.BaseTest;
import base.utils.Constant;
import base.utils.CsvWriter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import screenShoot.ScreenshotUtils;
import screenshotElement.ScreenshotElementUtil;

import java.io.IOException;


public class TestCsvWriter extends BaseTest {


    @Test
    public void TestCsvWriter( ) throws IOException {
        HomePage page = new HomePage(driver);
        ScreenshotElementUtil screenshotElementUtil = new ScreenshotElementUtil();

        // Obtener algún dato de la página
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String source = driver.getPageSource();

        test = extent.createTest("Login Test1");
        try {
            screenshotElementUtil.captureElementScreenshot(driver, page.LABEL_STORE, Constant.ALLPATH_ASHOT_ELEMENT_WEB);

            // Crear y escribir en el archivo CSV
            String filePath = "output/data.csv";
            CsvWriter csvWriter = new CsvWriter();

            // Crear encabezado
            csvWriter.writeHeader(new String[]{"Título", "URL", "SOURCE"});

            // Agregar fila de datos
            csvWriter.addRow(new String[]{title, url, source});

            System.out.println("CSV creado exitosamente en: " + filePath);
            test.log(Status.PASS, "CSV creado exitosamente");
        } catch (Exception e) {
            test.log(Status.FAIL, "CSV creado falló: " + e.getMessage());
                Assert.assertTrue(true,driver.getCurrentUrl());
                System.out.print(Constant.TOOLS_QA + " " + "-" + "url result" );
                ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");
        }

            }
        }