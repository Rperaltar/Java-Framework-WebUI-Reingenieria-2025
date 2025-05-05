package Test.proyectQA.PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageElementScrenShot {
    WebDriver driver;

    private By usernameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("loginBtn");

    public LoginPageElementScrenShot(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameInput() {
        return driver.findElement(usernameInput);
    }

    public WebElement getPasswordInput() {
        return driver.findElement(passwordInput);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public void login(String user, String pass) {
        getUsernameInput().sendKeys(user);
        getPasswordInput().sendKeys(pass);
        getLoginButton().click();
    }
}
