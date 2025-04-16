package PageModelMethods;

import PageModel.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import base.utils.BaseTest;
import apachePOi.ExcelUtils;

public class MethodsHomePage extends BaseTest {

    public HomePage homePage() {
        HomePage homePage = new HomePage(driver);
            actions.sleep();
            actions.click(homePage.SEARCH);
            actions.sendKeys(homePage.getSEARCH(),"Hola mundo");
        return homePage;
    }
    public HomePage homePageFail() {
        HomePage homePage = new HomePage(driver);
            actions.sleep();
            actions.click(homePage.SEARCH_FAIL);
            actions.sendKeys(homePage.getSEARCH_FAIL(),"Hola mundo");
        return homePage;
    }
    public HomePage homePageApachePOi() {
        HomePage homePage = new HomePage(driver);
            actions.sleep();
            actions.click(homePage.SEARCH);
            actions.sendKeys(homePage.getSEARCH(), ExcelUtils.getData(0,0));
        return homePage;
    }
    public void ASSERT() {
    Assert.assertEquals("","");
    }
    public HomePage homePageApachePOiFail() {
        HomePage homePage = new HomePage(driver);
            actions.sleep();
            actions.click(homePage.userName);
            actions.sendKeys(homePage.SEARCH, ExcelUtils.getData(1,1));
        return homePage;
    }
    public HomePage homePageApachePOi_3() {
        HomePage homePage = new HomePage(driver);
            waits.timeOutImplicitWaitHorTwo(driver);
            //actions.click(homePage.Buton1);
            actions.sendKeys(homePage.firstName, ExcelUtils.getData(0,0));
            actions.sendKeys(homePage.lastName, ExcelUtils.getData(1,0));
            actions.sendKeys(homePage.phone, ExcelUtils.getData(2,0));
            actions.sendKeys(homePage.userName, ExcelUtils.getData(3,0));
            actions.scrollDown(driver);
            actions.click(homePage.submit);
        return homePage;
    }


    public MethodsHomePage(WebDriver driver){
        MethodsHomePage.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
