package base.utils;


import base.instances.BasePageIntance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BasePageIntance {

    /**
     * Constructor for the BasePage class.
     * Initializes the WebDriver instance and sets up the PageFactory
     * to initialize the WebElements declared in the page object.
     *
     * @param driver the WebDriver instance used to interact with the web page
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
