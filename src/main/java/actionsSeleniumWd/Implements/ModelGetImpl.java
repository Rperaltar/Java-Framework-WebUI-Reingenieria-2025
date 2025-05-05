package actionsSeleniumWd.Implements;

import actionsSeleniumWd.Interfaces.ModelGetInteface;
import org.openqa.selenium.WebDriver;

public class ModelGetImpl implements ModelGetInteface {

    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelGetImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de Eventos      #
    #  de Selenium.                          #
    #                                        #
    ##########################################
    */

    //Metodo generico para setear la url a despelegar en el navegador Web
    public void getUrl(String url,WebDriver driver){
        driver.get(url);
    }

    //Metodo generico para setear titulo de la url a despelegar en el navegador Web
    public String getTitle(WebDriver driver){
        driver.getTitle();
        return null;
    }

    //Metodo generico para setear el origen y datos de la url a despelegar en el navegador Web
    public void getPageSource(WebDriver driver){
        driver.getPageSource();
    }

    //Metodo generico para setear el nombre de la url a despelegar en el navegador Web
    public void getCurrentUrl(WebDriver driver){
        driver.getCurrentUrl();
    }

    //Metodo generico para setear la url a despelegar en el navegador Web
    public void getManage(WebDriver driver){
        driver.getClass();
    }

    //Metodo generico para
    public void getWindowHandle(WebDriver driver){
        driver.getWindowHandle();
    }

    //Metodo generico para setear la url a despelegar en el navegador Web
    public void getWindowHandles(WebDriver driver){
        driver.getWindowHandles();
    }

}
