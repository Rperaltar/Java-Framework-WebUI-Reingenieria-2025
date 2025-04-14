package Test.Firefox;

import base.Constant;
import PageModel.HomePage;
import PageModelMethods.MethodsHomePage;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import base.BaseTest;
import screenshotElement.ScreenshotElementUtil;
import screenShoot.ScreenshotUtils;

import java.awt.*;
import java.io.IOException;

public class TestApachePoi extends BaseTest {



    @Test(priority = 1)
    public void Test() throws IOException, InterruptedException, AWTException {
        ScreenshotElementUtil screenshotElementUtil = new ScreenshotElementUtil();
         MethodsHomePage methodsHomePage = new MethodsHomePage(driver);
            HomePage page = new HomePage(driver);
        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Browse Test ApachePOi");
        try {
            screenshotElementUtil.captureElementScreenshot(driver, page.getSEARCH(), "screenshotElement/labelStore7.png");
              methodsHomePage.homePageApachePOi();
                test.log(Status.PASS, "Inyecciòn fue exitoso");
        } catch (Exception e) {
                test.log(Status.FAIL, "Inyecciòn falló: " + e.getMessage());
        }         Assert.assertEquals(Constant.TOOLS_QA,driver.getCurrentUrl());
                     System.out.print(Constant.TOOLS_QA + " " + "-" + "url result" );
                         ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");


    }
    @Test(priority = 0)
    public void Test2() throws IOException, InterruptedException, AWTException {
        MethodsHomePage methodsHomePage = new MethodsHomePage(driver);
        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Browse Test ApachePOiFail");
        try {
            methodsHomePage.homePageApachePOiFail();
            test.log(Status.PASS, "Inyecciòn fue exitoso");
        } catch (Exception e) {
            test.log(Status.FAIL, "Inyecciòn falló: " + e.getMessage());
        }
            Assert.assertEquals(Constant.TOOLS_QA,driver.getCurrentUrl());
            System.out.print(Constant.TOOLS_QA + " " + "-" + "url result" );
        ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");


    }
    @Test(priority = 3)
    public void Test3() throws IOException, InterruptedException, AWTException {
        MethodsHomePage methodsHomePage = new MethodsHomePage(driver);
        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Browse Test ApachePOi_3");
        try {
            methodsHomePage.homePageApachePOi();
            test.log(Status.PASS, "Test fue exitoso");
        } catch (Exception e) {
            test.log(Status.FAIL, "Test falló: " + e.getMessage());
        }
            Assert.assertEquals("Guru99 Demo Sites","Guru99 Demo Sites");
            System.out.print(Constant.guru99 + " " + "-" + "url result" );
        ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");


    }
}