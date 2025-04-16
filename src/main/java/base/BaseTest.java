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

    /**
     * Sets up the WebDriver for the test execution.
     * This method initializes the ExtentManager for reporting,
     * creates a Firefox WebDriver instance, and navigates to the specified URL.
     *
     * @throws Exception if an error occurs during the setup process.
     */
    @BeforeTest
    public void setUpDriver() throws Exception {
            extentManager();
                createFireFoxDriver();
                                  getUrl();
    }

    /**
     * This method is executed after the test suite has completed.
     * It ensures that the extent report is properly flushed and closed.
     *
     * @throws Exception if an error occurs during the flushing or closing of the report.
     */
    @AfterTest
    public void closeExtent() throws Exception {
        extenFlush();
                 close();
        //System.out.println("No existe reporte Web");
    }

    /**
     * Initializes the extent report manager by retrieving the extent instance
     * from the ExtentManager. This method does not return any value.
     */
    private void extentManager(){
        extent = ExtentManager.getExtent();
        return;

    }

    /**
     * Starts the video recording process.
     * This method initializes and begins the recording using the VideoRecorder.
     *
     * @throws Exception if an error occurs during the recording process.
     */
    private void startRecording() throws Exception {
        VideoRecorder.startRecording();
        return;
    }

    /**
     * Stops the video recording process.
     *
     * @throws Exception if an error occurs while stopping the recording.
     */
    private void stopRecording() throws Exception {
        VideoRecorder.stopRecording();
        return;
    }

    /**
     * Creates a Firefox WebDriver instance.
     *
     * This method initializes the `driver` object based on the provided options.
     * If `optionsDriver` is null, it creates an Edge WebDriver instance using the
     * specified driver path. Otherwise, it creates a Firefox WebDriver instance
     * with the specified driver path and additional options.
     *
     * @throws Exception if an error occurs during the WebDriver creation process.
     */
    private void createFireFoxDriver() throws Exception {
        if (optionsDriver == null)
            driver = Rdriver.CreateEdgeDriver(Constantes.DRIVER_PATH);
        else {
            driver = Rdriver.CreateFireFox(Constantes.DRIVER_PATH,true);
        }
        return;
    }

    /**
     * Opens a specified URL in the web browser, maximizes the browser window,
     * starts video recording of the session, and logs the initialization message.
     *
     * @throws Exception if an error occurs during the execution of the actions.
     */
    private void getUrlWeb() throws Exception {
        getUrl();
            maximize();
                startRecording();
        return;
    }

    /**
     * Navigates to the specified URL defined in the Constant.TOOLS_QA variable
     * using the provided WebDriver instance.
     *
     * @throws Exception if an error occurs during the URL navigation process.
     */
    private void getUrl() throws Exception {
        actions.getUrl(Constant.TOOLS_QA, driver);
        return;
    }

    /**
     * Maximizes the browser window using the provided driver instance.
     *
     * @throws Exception if an error occurs during the maximize operation.
     */
    private void maximize() throws Exception {
        actions.maximize(driver);
        return;
    }

    /**
     * Flushes the extent report to ensure that all the logged information
     * is written to the report file. This method should be called after
     * all test information has been logged to finalize the report.
     */
    private void extenFlush(){
            extent.flush();
        return;

    }

    /**
     * Closes the resources used during the execution of the program.
     *
     * This method stops the video recording if it is in progress and quits the
     * WebDriver instance if it is not null. It ensures proper cleanup of resources
     * to avoid memory leaks or other issues.
     *
     * @throws Exception if an error occurs while stopping the video recording
     *                   or quitting the WebDriver.
     */
    private void close() throws Exception {
            stopRecording();
                   closeDriver();
        //System.out.println("No existe reporte Web");
    }

    /**
     * Closes the WebDriver instance if it is not null.
     * This method ensures that the WebDriver is properly terminated
     * to release resources and avoid potential memory leaks.
     *
     * @throws Exception if an error occurs during the WebDriver termination process.
     */
    private void closeDriver() throws Exception {
        if (driver != null) {
            driver.quit();
        }
        return;
        //System.out.println("No existe reporte Web");
    }

}