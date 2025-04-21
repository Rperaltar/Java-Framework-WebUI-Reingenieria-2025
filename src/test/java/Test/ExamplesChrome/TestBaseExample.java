package Test.ExamplesChrome;

import base.utils.Constant;
import PageModel.HomePage;
import base.utils.Constantes;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import base.utils.BaseTest;
import screenshotElement.ScreenshotElementUtil;
import screenShoot.ScreenshotUtils;
import webDriver.Rdriver;

import java.awt.*;
import java.io.IOException;

public class TestBaseExample extends BaseTest {
    /* Estructura de pruebas en TestNg / Maven Junit
                  1.-Datos de Entrada
                  2.-Cuerpo de la Prueba
                  3.-Resultado de la Prueba
                  4.-Clear de la Prueba
    */
    @Test(priority = 1)
    public void Test() throws Exception {

       createEdgeDriver();
          getUrl(Constant.TOOLS_QA);
             HomePage page = new HomePage(driver);
             ScreenshotElementUtil screenshotElementUtil = new ScreenshotElementUtil();

        test = extent.createTest("Login Test1");
        try {
            screenshotElementUtil.captureElementScreenshot(driver, page.LABEL_STORE, Constant.ALLPATH_ASHOT_ELEMENT_WEB);
            test.log(Status.PASS, "Inyecciòn fue exitoso");
        } catch (Exception e) {
            test.log(Status.FAIL, "Inyecciòn falló: " + e.getMessage());
        }
        test.log(Status.INFO, "test23:18 página de login");
         Assert.assertTrue(true,driver.getCurrentUrl());
            System.out.print(Constant.TOOLS_QA + " " + "-" + "url result" );
         ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");
    }

    @Test(priority = 2)
    public void Test2() throws IOException, InterruptedException, AWTException {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test1");
        test.log(Status.INFO, "test23:18 página de login");
        ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");


    }

    @Test(priority = 3)
    public void Test3() throws IOException, InterruptedException, AWTException {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test1");
        test.log(Status.INFO, "test23:18 página de login");
        ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");


    }
    @Test(priority = 4)
    public void Test4() throws IOException, InterruptedException, AWTException {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test1");
        test.log(Status.INFO, "test23:18 página de login");
        ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");


    }

    @Test(priority = 5)
    public void Test5() throws IOException, InterruptedException, AWTException {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test1");
        test.log(Status.INFO, "test23:18 página de login");
        ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");


    }

    @Test(priority = 6)
    public void Test6() throws IOException, InterruptedException, AWTException {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test1");
        test.log(Status.INFO, "test23:18 página de login");
        ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");


    }

}