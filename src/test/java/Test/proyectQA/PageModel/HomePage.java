package Test.proyectQA.PageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import base.utils.BasePage;

public class HomePage extends BasePage {

    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS, css = "#search > input")
    public WebElement SEARCH;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS, css = "#search > inpu")
    public WebElement SEARCH_FAIL;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.CSS, css = "#top-links > ul > li.dropdown > a > i")
    public WebElement LABEL_STORE;

    //Locators para test Apache POi
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.NAME, name = "firstName")
    public WebElement firstName;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.NAME, name = "lastName")
    public WebElement lastName;
    //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.NAME, name = "phone")
    public WebElement phone; //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.NAME, name = "userName")
    public WebElement userName; //Localizadores de los Elementos Web del Modelo de Pagina
    @FindBy(how = How.NAME, name = "submit")
    public WebElement submit; //Localizadores de los Elementos Web del Modelo de Pagina

    //Elements Assert
    @FindBy(how = How.CSS, css = "body > div.container-fluid > div.row.topper > div.col-md-2.header-section > div.logo > a > img")
    public WebElement text_laber_guru; //Localizadores de los Elementos Web del Modelo de Pagina


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSEARCH() {
        return SEARCH;
    }

    public WebElement getSEARCH_FAIL() {
        return SEARCH_FAIL;
    }
}
