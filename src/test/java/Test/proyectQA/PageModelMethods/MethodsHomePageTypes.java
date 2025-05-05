package Test.proyectQA.PageModelMethods;

import Test.proyectQA.PageModel.HomePageTypes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import base.utils.BaseTest;
import apachePOi.ExcelTypesUtil;
import apachePOi.ExcelUtils;

public class MethodsHomePageTypes extends BaseTest {




    public HomePageTypes homePageApachePOiTypes() {

        ExcelTypesUtil excelTypesUtil = new ExcelTypesUtil();
        excelTypesUtil.ExcelUtils(ExcelTypesUtil.excelPath,ExcelTypesUtil.sheetName);

        HomePageTypes homePage = new HomePageTypes(driver);
        waits.timeOutImplicitWaitHorTwo(driver);
        //actions.click(homePage.Buton1);
            actions.sendKeys(homePage.firstName,ExcelUtils.getData(0,0));
            actions.sendKeys(homePage.lastName, excelTypesUtil.getCellData(1,0));
            actions.sendKeys(homePage.phone, excelTypesUtil.getCellData(2,0));
            actions.sendKeys(homePage.userName,excelTypesUtil.getCellData(3,0));
            actions.scrollDown(driver);
            actions.click(homePage.submit);
        return homePage;
    }


    public MethodsHomePageTypes(WebDriver driver){
        MethodsHomePageTypes.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
