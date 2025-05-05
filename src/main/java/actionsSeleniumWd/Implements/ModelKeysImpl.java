package actionsSeleniumWd.Implements;

import actionsSeleniumWd.Interfaces.ModelKeyInterface;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ModelKeysImpl implements ModelKeyInterface {

    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelKeysImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de Eventos      #
    #  de tipo key en Selenium.                          #
    #                                        #
    ##########################################
    */

    //Metodo generico para dar enter como funcion del teclado en un Elemento Web
    public void keyEnter(WebElement element){
        element.sendKeys(Keys.ENTER);
    }

    //Metodo generico para dar Cancelar como funcion del teclado en un Elemento Web
    public void keyCancel(WebElement element){
        element.sendKeys(Keys.CANCEL);
    }

    //Metodo generico para realizar una acción como funcion del teclado
    public void keyAlt(WebElement element){
        element.sendKeys(Keys.ALT + "F4");
    }

    //Metodo generico para  realizar una acción como funcion del teclado
    public void keyTab(WebElement element){
        element.sendKeys(Keys.TAB);
    }

    //Metodo generico para realizar una acción como funcion del teclado
    public void keyAdd(WebElement element){
        element.sendKeys(Keys.ADD);
    }

    //Metodo generico para realizar una acción como funcion del teclado
    public void keyControl(WebElement element){
        element.sendKeys(Keys.CONTROL);
    }

    //Metodo generico para realizar una acción como funcion del teclado
    public void keyCommand(WebElement element){
        element.sendKeys(Keys.COMMAND);
    }

    //Metodo generico para realizar una acción como funcion del teclado
    public void keyBack(WebElement element){
        element.sendKeys(Keys.BACK_SPACE);
    }

    //Metodo generico para realizar una acción como funcion del teclado
    public void keyF11(WebElement element){
        element.sendKeys(Keys.F11);
    }

}
