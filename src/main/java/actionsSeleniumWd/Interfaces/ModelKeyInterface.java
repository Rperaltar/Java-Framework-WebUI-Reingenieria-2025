package actionsSeleniumWd.Interfaces;

import org.openqa.selenium.WebElement;

public interface ModelKeyInterface {

  /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    # Se crean una interface de Metodos                  #
    # mediante la Implementación - ModelKey              #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades de                #
    #  de los Objetos mediante JAVA - Void               #
    #                                                    #
    ######################################################
    */


    void keyAlt(WebElement element);
    void keyTab(WebElement element);
    void keyEnter(WebElement element);
    void keyCancel(WebElement element);
    void keyAdd(WebElement element);
    void keyControl(WebElement element);
    void keyCommand(WebElement element);
    void keyBack(WebElement element);
    void keyF11(WebElement element);
}
