package actionsSeleniumWd.Interfaces;

import org.openqa.selenium.WebDriver;

public interface ModelWaitsInterface {

    /*
    #################################################
    #            Patron de Diseño                   #
    #           ScreeenPlayActions                  #
    #                                               #
    # Se crean una interface de Metodos             #
    # mediante la Implementación - ModelWaits       #
    #                                               #
    #  Con el Objetivo de                           #
    #  inicializar las funcionalidades de           #
    #  de los Objetos mediante JAVA - Void          #
    #                                               #
    #################################################
    */

    void timeOutImplicitWaitMilOne(WebDriver driver);
    void timeOutImplicitWaitMilTwo(WebDriver driver);
    void timeOutImplicitWaitSegOne(WebDriver driver);
    void timeOutImplicitWaitSegTwo(WebDriver driver);
    void timeOutImplicitWaitMinOne(WebDriver driver);
    void timeOutImplicitWaitMinTwo(WebDriver driver);
    void timeOutImplicitWaitHorOne(WebDriver driver);
    void timeOutImplicitWaitHorTwo(WebDriver driver);
    void ExplicitWaitElementLocated(WebDriver driver, String element);
    void ExplicitWaitToBeClickable(WebDriver driver, String element);
    void ExplicitWaitToInvisibility(WebDriver driver, String element);
}
