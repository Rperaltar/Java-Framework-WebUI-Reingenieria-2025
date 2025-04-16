package base;

import actionsScreenPlay.Implements.ModelActionsImpl;
import actionsScreenPlay.Implements.ModelAssertImpl;
import actionsScreenPlay.Implements.ModelWaitsImpl;
import actionsScreenPlay.Interfaces.ModelActionsInterface;
import actionsScreenPlay.Interfaces.ModelAssertInterface;
import actionsScreenPlay.Interfaces.ModelWaitsInterface;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import extentReportHtml.ExtentManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import videoRecorder.VideoRecorder;
import webDriver.Rdriver;

public class BaseTest extends Constant{


    @BeforeTest
    public void setUpDriver() throws Exception {
            extentManager();
                createFireFoxDriver();
                                  getUrl();
    }
    @AfterTest
    public void closeExtent() throws Exception {
        extenFlush();
                 close();
        //System.out.println("No existe reporte Web");
    }
    private void extentManager(){
        extent = ExtentManager.getExtent();
        return;

    }
    private void createFireFoxDriver() throws Exception {
        if (optionsDriver == null)
            driver = Rdriver.CreateEdgeDriver(Constantes.DRIVER_PATH);
        else {
            driver = Rdriver.CreateFireFox(Constantes.DRIVER_PATH,true);
        }
        return;
    }
    private void getUrl() throws Exception {
        actions.getUrl(Constant.TOOLS_QA, driver);
        actions.maximize(driver);
            VideoRecorder.startRecording();
            log.info(Constant.INICIA_NAVEGADOR);
        return;

    }
    private void extenFlush(){
            extent.flush();
        return;

    }
    private void close() throws Exception {
            VideoRecorder.stopRecording();
        if (driver != null) {
            driver.quit();
        }
        //System.out.println("No existe reporte Web");
    }
}