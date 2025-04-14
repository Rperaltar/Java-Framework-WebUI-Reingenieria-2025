package screenShoot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtils {

    public static void takeScreenshot(WebDriver driver, String filePath) {
            ScreenshotUtils.takeScreenshotMethod(driver,filePath);
        return;
    }
    private static void takeScreenshotMethod(WebDriver driver, String filePath) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
