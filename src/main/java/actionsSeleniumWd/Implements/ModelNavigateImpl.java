package actionsSeleniumWd.Implements;

import actionsSeleniumWd.Interfaces.ModelNavigateInteface;
import org.openqa.selenium.WebDriver;

public class ModelNavigateImpl implements ModelNavigateInteface {


    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelNavigateImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de Navegaciones #
    #  en Selenium.                          #
    #                                        #
    ##########################################
    */

    //Metodo generico para navegar en una url especifica tipo "https://"
    public void navigateUrl(String url,WebDriver driver){
        driver.navigate().to(url);
    }

    //Metodo generico para actualizar una url especifica tipo "https://"
    public void navigateRefresh(WebDriver driver){
        driver.navigate().refresh();
    }

    //Metodo generico para navegar una pagina Atras de donde estas posocionado en una url tipo "https://"
    public void navigateBack(WebDriver driver){
        driver.navigate().back();
    }

    //Metodo generico  para navegar una pagina Adelante de donde estas posocionado en una url tipo "https://"
    public void navigateForward(WebDriver driver){
        driver.navigate().forward();
    }
}

