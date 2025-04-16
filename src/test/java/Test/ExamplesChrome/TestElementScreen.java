package Test.ExamplesChrome;


import PageModel.LoginPageElementScrenShot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import base.BaseTest;
import screenshotElement.ScreenshotElementUtil;

public class TestElementScreen extends BaseTest {
    WebDriver driver;

    @Test
    public void testLoginScreenshot() {

        LoginPageElementScrenShot elementScrenShot = new LoginPageElementScrenShot(driver);
        ScreenshotElementUtil screenshotElementUtil = new ScreenshotElementUtil();

        screenshotElementUtil.captureElementScreenshot(driver, elementScrenShot.getUsernameInput(), "screenshotElement/usernameInput.png");
        screenshotElementUtil.captureElementScreenshot(driver, elementScrenShot.getPasswordInput(), "screenshotElement/passwordInput.png");
        screenshotElementUtil.captureElementScreenshot(driver, elementScrenShot.getLoginButton(), "screenshotElement/loginButton.png");

        elementScrenShot.login("admin", "admin123");
        driver.quit();
    }
}
