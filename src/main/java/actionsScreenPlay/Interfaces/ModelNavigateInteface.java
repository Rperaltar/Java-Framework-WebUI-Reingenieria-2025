package actionsScreenPlay.Interfaces;

import org.openqa.selenium.WebDriver;

public interface ModelNavigateInteface {

    /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    # Se crean una interface de Metodos                  #
    # mediante la Implementación - ModelNavigateInteface #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades de                #
    #  de los Objetos mediante JAVA - Void               #
    #                                                    #
    ######################################################
    */

    void navigateUrl(String url, WebDriver driver);
    void navigateRefresh(WebDriver driver);
    void navigateBack(WebDriver driver);
    void navigateForward(WebDriver driver);
}
