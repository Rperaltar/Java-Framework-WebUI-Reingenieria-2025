package actionsScreenPlay.Interfaces;

import org.openqa.selenium.WebDriver;

public interface ModelGetInteface {

   /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    # Se crean una interface de Metodos                  #
    # mediante la Implementación - ModelGetInteface      #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades de                #
    #  de los Objetos mediante JAVA - Void               #
    #                                                    #
    ######################################################
    */


    void getUrl(String url, WebDriver driver);
    String getTitle(WebDriver driver);
    void getPageSource(WebDriver driver);
    void getCurrentUrl(WebDriver driver);
    void getManage(WebDriver driver);
    void getWindowHandle(WebDriver driver);
    void getWindowHandles(WebDriver driver);

}
