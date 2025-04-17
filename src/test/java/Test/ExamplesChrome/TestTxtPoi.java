package Test.ExamplesChrome;

import PageModel.HomePage;
import base.utils.BaseTest;
import base.utils.Constant;
import base.utils.CsvWriter;
import base.utils.ReadFileTxtPoi;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import screenShoot.ScreenshotUtils;
import screenshotElement.ScreenshotElementUtil;

import java.io.IOException;
import java.util.Map;


public class TestTxtPoi  {

    String path = "data/readFile.txt";

    @Test
    public void TestCsvWriter( ) throws IOException {

            Map<String, String> credentials = ReadFileTxtPoi.readCredentials(path);

/*
            String username = credentials.get("username");
            String password = credentials.get("password");

            LoginPage loginPage = new LoginPage(driver);
            loginPage.login(username, password);

 */


    }
}