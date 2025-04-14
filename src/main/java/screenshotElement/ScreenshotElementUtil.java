package screenshotElement;

import org.openqa.selenium.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenshotElementUtil {

    public static void captureElementScreenshot(WebDriver driver, @org.jetbrains.annotations.NotNull WebElement element, String filePath) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            BufferedImage fullImg = ImageIO.read(screenshot);

            Point point = element.getLocation();
            int eleWidth = element.getSize().getWidth();
            int eleHeight = element.getSize().getHeight();

            BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
            ImageIO.write(eleScreenshot, "png", new File(filePath));
        } catch (IOException e) {
            System.out.println("Error capturing element screenshot: " + e.getMessage());
        }
    }
}
