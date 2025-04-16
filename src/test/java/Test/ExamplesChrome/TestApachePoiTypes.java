package Test.ExamplesChrome;

import base.Constant;
import PageModelMethods.MethodsHomePageTypes;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import base.BaseTest;
import screenShoot.ScreenshotUtils;

import java.awt.*;
import java.io.IOException;

public class TestApachePoiTypes extends BaseTest {

    @Test(priority = 3)
    public void Test3() throws IOException, InterruptedException, AWTException {
        MethodsHomePageTypes homePage = new MethodsHomePageTypes(driver);
        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        test = extent.createTest("Browse Test ApachePOi_3");
        try {
            homePage.homePageApachePOiTypes();
            test.log(Status.PASS, "Test fue exitoso");
        } catch (Exception e) {
            test.log(Status.FAIL, "Test falló: " + e.getMessage());
        }
        Assert.assertEquals("Guru99 Demo Sites","Guru99 Demo Sites");
        System.out.print(Constant.guru99 + " " + "-" + "url result" );
        ScreenshotUtils.takeScreenshot(driver, Constant.PATH_ASHOT + Constant.NAME_ASHOOT + Constant.TIME_STAMP + ".jpg");


    }
}