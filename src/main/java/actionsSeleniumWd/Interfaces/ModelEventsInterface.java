package actionsSeleniumWd.Interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ModelEventsInterface {

    /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    # Se crean una interface de Metodos                  #
    # mediante la Implementación - ModelEvents           #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades de                #
    #  de los Objetos mediante JAVA - Void               #
    #                                                    #
    ######################################################
    */


    void acceptAlert(WebDriver driver);
    void moveByOffset(WebDriver driver);
    void clickHold(WebDriver driver, WebElement element);
    void dobleClick(WebDriver driver, WebElement element);
    void contextClick(WebDriver driver, WebElement element);
    void dragDrop(WebDriver driver, WebElement element, WebElement webElement);

}
