package screenShoot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtils {

    /**
     * Captures a screenshot of the current state of the web page in the browser and saves it to the specified file path.
     *
     * @param driver   The WebDriver instance controlling the browser.
     * @param filePath The file path where the screenshot will be saved.
     */
    public static void takeScreenshot(WebDriver driver, String filePath) {
            ScreenshotUtils.takeScreenshotMethod(driver,filePath);
        return;
    }

    /**
     * Captures a screenshot of the current browser window and saves it to the specified file path.
     *
     * @param driver   The WebDriver instance used to take the screenshot. It must support the TakesScreenshot interface.
     * @param filePath The file path where the screenshot will be saved.
     *
     * @throws IOException If an error occurs while copying the screenshot file to the specified location.
     */
    private static void takeScreenshotMethod(WebDriver driver, String filePath) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
