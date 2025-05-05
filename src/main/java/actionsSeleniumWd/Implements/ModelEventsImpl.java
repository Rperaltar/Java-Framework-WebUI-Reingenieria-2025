package actionsSeleniumWd.Implements;

import actionsSeleniumWd.Interfaces.ModelEventsInterface;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ModelEventsImpl implements ModelEventsInterface {

    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelEventsImpl              #
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

    //Metodo generico para dar click o aceptar las ventanas emegentes un "Pop-up" de Alerta
    public void acceptAlert(WebDriver driver){
        driver.switchTo().alert();
    }

    //Metodo generico para dar dobleclic en un Elemento Web
    public void dobleClick(WebDriver driver, WebElement element){
        Actions dobleClic = new Actions(driver);
        dobleClic.contextClick(element).build().perform();
    }

    //Metodo generico para posicionarce en un Elemento Web y darle clic al mismo tiempo
    public void contextClick(WebDriver driver,WebElement element){
        Actions contClick = new Actions(driver);
        contClick.contextClick(element).build().perform();
    }

    //Metodo generico para posicionarce en un Elemento Web y darle clic al mismo tiempo
    public void clickHold(WebDriver driver,WebElement element){
        Actions clickhold = new Actions(driver);
        clickhold.contextClick(element).build().perform();
    }

    //Metodo generico para posicionarce en una funcionalidad de tipo barra ya sea latera y / horizontal
    // y hace el deslice hacia izquierda o derecha de la misma
    public void dragDrop(WebDriver driver,WebElement element,WebElement webElement){
        (new Actions(driver)).dragAndDrop(element, webElement).perform();
    }

    public void moveByOffset(WebDriver driver) {
        Actions builder = new Actions(driver);
        Action move = builder.moveByOffset(50, 50).build();
        move.perform();
    }

}
