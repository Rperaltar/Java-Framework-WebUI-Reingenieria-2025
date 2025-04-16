package Test.ExamplesChrome;

import base.utils.Constant;
import PageModelMethods.MethodsHomePage;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import base.utils.BaseTest;
import screenShoot.ScreenshotUtils;

import java.awt.*;
import java.io.IOException;

public class TestPageMethodsExample extends BaseTest {



    @Test(priority = 1)
    public void Test() throws IOException, InterruptedException, AWTException {
        MethodsHomePage methodsHomePage = new MethodsHomePage(driver);
        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test1");
        try {
            methodsHomePage.homePage();
            test.log(Status.PASS, "Busqueda fue exitoso");
        } catch (Exception e) {
            test.log(Status.FAIL, "Busqueda falló: " + e.getMessage());
        }
        Assert.assertEquals(Constant.TOOLS_QA,driver.getCurrentUrl());
        System.out.print(Constant.TOOLS_QA + " " + "-" + "url result" );
        ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");


    }
    @Test(priority = 2)
    public void Test2() throws IOException, InterruptedException, AWTException {
        MethodsHomePage methodsHomePage = new MethodsHomePage(driver);
        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test2");
        try {
            methodsHomePage.homePageFail();
            test.log(Status.PASS, "Busqueda fue exitoso");
        } catch (Exception e) {
            test.log(Status.FAIL, "Busqueda falló: " + e.getMessage());
        }
        Assert.assertEquals(Constant.TOOLS_QA,driver.getCurrentUrl());
        System.out.print(Constant.TOOLS_QA + " " + "-" + "url result" );
        ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");

    }
}