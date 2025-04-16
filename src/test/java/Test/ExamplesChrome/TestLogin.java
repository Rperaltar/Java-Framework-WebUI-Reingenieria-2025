package Test.ExamplesChrome;

import actionsScreenPlay.Implements.ModelActionsImpl;
import actionsScreenPlay.Implements.ModelAssertImpl;
import actionsScreenPlay.Implements.ModelWaitsImpl;
import actionsScreenPlay.Interfaces.ModelActionsInterface;
import actionsScreenPlay.Interfaces.ModelAssertInterface;
import actionsScreenPlay.Interfaces.ModelWaitsInterface;
import base.Constant;
import base.Constantes;
import extentReportHtml.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import screenShoot.ScreenshotUtils;
import webDriver.Rdriver;

import java.awt.*;
import java.io.IOException;

public class TestLogin {

    public static WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;

    public static ModelActionsInterface actions = new ModelActionsImpl();
    public static ModelWaitsInterface waits = new ModelWaitsImpl();
    public static ModelAssertInterface Assert = new ModelAssertImpl();
    private static Logger log = LogManager.getLogger(TestLogin.class.getName());

    @AfterTest
    public void closeExtent(){
        extent.flush();
        //System.out.println("No existe reporte Web");
    }

    @BeforeTest
    public void setUpDriver() throws IOException, AWTException, IOException, AWTException {
            extent = ExtentManager.getExtent();
        driver = Rdriver.CreateEdgeDriver(Constantes.DRIVER_PATH);
        actions.getUrl(Constant.TOOLS_QA, driver);
        actions.maximize(driver);
        log.info(Constant.INICIA_NAVEGADOR);
    }
    @Test(priority = 2)
    public void Test() throws IOException, InterruptedException, AWTException {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test1");
        test.log(Status.INFO, "test23:18 página de login");
        test.log(Status.ERROR, "test2 página de login");
        test.log(Status.SKIP, "test3 página de login");
        test.log(Status.FAIL, "test4 página de login");
        test.log(Status.WARNING, "test5 página de login");
        Assert.assertEquals(Constant.TOOLS_QA,driver.getCurrentUrl());
        System.out.print(Constant.TOOLS_QA + "-" + "url result" );
        ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".png");


    }
    @Test(priority = 2)
    public void Test1() throws IOException, InterruptedException, AWTException {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test2");
        test.log(Status.INFO, "test1 página de login");
        test.log(Status.INFO, "test2 página de login");
        System.out.print(Constant.TOOLS_QA + "-" + "url result" );


    }
    @Test(priority = 3)
    public void Test2() throws IOException, InterruptedException, AWTException {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test3");
        test.log(Status.INFO, "test1 página de login");
        test.log(Status.ERROR, "test2 página de login");
        test.log(Status.SKIP, "test3 página de login");
        System.out.print(Constant.TOOLS_QA + "-" + "url result" );


    }
    @Test(priority = 4)
    public void Test3() throws IOException, InterruptedException, AWTException {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test4");
        test.log(Status.INFO, "test1 página de login");
        test.log(Status.ERROR, "test2 página de login");
        test.log(Status.SKIP, "test3 página de login");
        System.out.print(Constant.TOOLS_QA + "-" + "url result" );


    }
    @Test(priority = 5)
    public void Test4() throws IOException, InterruptedException, AWTException {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test5");
        test.log(Status.INFO, "test1 página de login");
        test.log(Status.ERROR, "test2 página de login");
        test.log(Status.SKIP, "test3 página de login");
        System.out.print(Constant.TOOLS_QA + "-" + "url result" );


    }
    @Test(priority = 6)
    public void Test5() throws IOException, InterruptedException, AWTException {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Login Test6");
        test.log(Status.INFO, "test1 página de login");
        test.log(Status.ERROR, "test2 página de login");
        test.log(Status.SKIP, "test3 página de login");
        System.out.print(Constant.TOOLS_QA + "-" + "url result" );


    }
    @AfterMethod
    void tearDown(ITestResult result) {
        if (driver != null) {
            driver.quit();
        }
    }
}