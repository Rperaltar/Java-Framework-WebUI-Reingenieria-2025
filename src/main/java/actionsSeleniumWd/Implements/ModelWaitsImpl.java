package actionsSeleniumWd.Implements;

import actionsSeleniumWd.Interfaces.ModelWaitsInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ModelWaitsImpl implements ModelWaitsInterface {


    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelActionsImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de esperas      #
    #  Implicitas / Explicitas de Selenium.  #
    #                                        #
    ##########################################
    */


    // Implicit Waits
    //Metodo generico para hacer una espera de implicitamente de 20 Milisegundos
    public void timeOutImplicitWaitMilOne(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
    }

    //Metodo generico para hacer una espera de implicitamente de 50 Milisegundos
    public void timeOutImplicitWaitMilTwo(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
    }

    //Metodo generico para hacer una espera de implicitamente de 05 SECONDS
    public void timeOutImplicitWaitSegOne(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
    }

    //Metodo generico para hacer una espera de implicitamente de 10 SECONDS
    public void timeOutImplicitWaitSegTwo(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //Metodo generico para hacer una espera de implicitamente de 10 MINUTES
    public void timeOutImplicitWaitMinOne(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
    }

    //Metodo generico para hacer una espera de implicitamente de 10 MINUTES
    public void timeOutImplicitWaitMinTwo(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
    }

    //Metodo generico para hacer una espera de implicitamente de 1 HOURS
    public void timeOutImplicitWaitHorOne(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.HOURS);
    }

    //Metodo generico para hacer una espera de implicitamente de 2 HOURS
    public void timeOutImplicitWaitHorTwo(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.HOURS);
    }

    //Explicit Waits
    //Metodo generico para hacer una espera de Explicitamente de un Elemento Web localizable  presente
    public void ExplicitWaitElementLocated(WebDriver driver, String element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name(element)));
    }

    //Metodo generico para hacer una espera de Explicitamente un Elemento Web  clickleable
    public void ExplicitWaitToBeClickable(WebDriver driver, String element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
    }

    //Metodo generico para hacer una espera de Explicitamente de un Elemento Web localizable Visible
    public void ExplicitWaitToInvisibility(WebDriver driver, String element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(element)));
    }
}
