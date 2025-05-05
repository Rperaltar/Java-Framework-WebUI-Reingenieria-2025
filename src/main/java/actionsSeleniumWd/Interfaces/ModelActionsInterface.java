package actionsSeleniumWd.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ModelActionsInterface {

   /*
    #################################################
    #               Patron de Diseño                #
    #              ScreeenPlayActions               #
    #                                               #
    #  Se crean una interface de Metodos            #
    #  mediante la Implementación - ModelActions    #
    #                                               #
    #  Con el Objetivo de                           #
    #  inicializar las funcionalidades de           #
    #  de los Objetos mediante JAVA - Void          #
    #                                               #
    #################################################
    */

    void sleep();
    void sleepMed();
    void quit(WebDriver driver);
    void close(WebDriver driver);
    void printInt(String msgLog);
    void clear(WebElement element);
    void reFresh(WebDriver driver);
    void click(WebElement element);
    void scrollUp(WebDriver driver);
    void maximize(WebDriver driver);
    void fullScreen(WebDriver driver);
    void scrollDown(WebDriver driver);
    void closeFrame(WebDriver driver);
    void scrollDownMax(WebDriver driver);
    void getUrl(String url, WebDriver driver);
    void swichToActiveElement(WebDriver driver);
    void swichToDefaultContent(WebDriver driver);
    void sendKeys(WebElement element, String key);
    void navigateUrl(String url, WebDriver driver);
    void moveTo(WebElement element, WebDriver driver);
    void swichToFrameInt(WebDriver driver, Integer Init);
    void swichFrame(WebElement element, WebDriver driver);
    void selectByVisibleText(WebElement element, String value);

}
