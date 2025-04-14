package actionsScreenPlay.Implements;


import actionsScreenPlay.Interfaces.ModelActionsInterface;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ModelActionsImpl implements ModelActionsInterface {

    /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelActionsImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de Acciones     #
    #  de Selenium.                          #
    #                                        #
    ##########################################
    */

    //Metodo generico para dar clic en un Elemento Web
    public void click(WebElement element) {
        element.click();
    }

    //Metodo generico para agregar texto a un textbox de un Elemento Web
    public void sendKeys(WebElement element, String key) {
        element.sendKeys(key);
    }

    //Metodo generico para limpiar un textbox de un Elemento Web
    public void clear(WebElement element) {
        element.clear();
    }

    //Metodo generico para cerrar el la ventana del navegador
    public void close(WebDriver driver) {
        driver.close();
    }

    //Metodo generico para cerrar el la ventana del navegador
    public void quit(WebDriver driver) {
        driver.quit();
    }

    //Metodo generico para abrir la url de una pagina web en un navegador
    public void getUrl(String url, WebDriver driver) {
        driver.get(url);
    }

    //Metodo generico para abrir una url de una pagina web especifica en un navegador
    public void navigateUrl(String url, WebDriver driver) {
        driver.navigate().to(url);
    }

    //Metodo generico para refrescar y / o actualizar la pagina
    public void reFresh(WebDriver driver) {
        driver.navigate().refresh();
    }

    //Metodo generico para mandar un Mensaje de Consola
    public void printInt(String msgLog) {
        System.out.println(msgLog);

    }

    // Metodo generico que hace que se duerma por unos milisegundo el navegador
    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    //Metodo generico que hace que se duerma por unos milisegundo el navegador
    public void sleepMed() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Metodo generico para hacer un scroll y / o bajar dentro de la pagina
    public void scrollDownMax(WebDriver driver) {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,10000)", "");
    }

    //Metodo generico para hacer un un scroll y / o bajar dentro de la pagina
    public void scrollDown(WebDriver driver) {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,500)", "");
    }

    //Metodo generico para scroll y / o subir dentro de la pagina
    public void scrollUp(WebDriver driver) {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,-1000)", "");
    }

    //Metodo generico para dar seleccionar en un Elemento Web dentro de Un comboBox o ListBox
    public void selectByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
        
    }

    //Metodo generico para ir o posicionarce en un Elemento Web
    public void moveTo(WebElement element, WebDriver driver) {
        Actions menu = new Actions(driver);
        menu.moveToElement(element).build().perform();
    }

    //Metodo generico para que la pantalla de la Pagina Web se haga de tipo fullscreen
    public void fullScreen(WebDriver driver) {
        driver.manage().window().fullscreen();
    }

    //Metodo generico para Maximizar una Pagina Web
    public void maximize(WebDriver driver) {
        driver.manage().window().maximize();
    }

    //Metodo generico para Buscar e Ingresar en Un WebElement de tipo / iframe
    public void swichFrame(WebElement element, WebDriver driver) {
        driver.switchTo().frame(element);
    }

    //Metodo generico para Buscar y Salir de Un WebElement de tipo / iframe
    public void closeFrame(WebDriver driver) {
        driver.switchTo().defaultContent();
    }

    //Metodo generico para Buscar y entrar a un tipo de WebElement
    //Activos como por ejemplo un "FileUpload" para subir y / o selecionar un archivo.
    public void swichToActiveElement(WebDriver driver) {
        driver.switchTo().activeElement();
    }

    //Metodo generico para Buscar e Ingresar en Un WebElement de tipo / iframe con un array inicializado en "[0]"
    public void swichToFrameInt(WebDriver driver,Integer Init){
        driver.switchTo().frame(Init);
    }

    //Metodo generico para salir de un WebElement de tipo / iframe
    public void swichToDefaultContent(WebDriver driver){
        driver.switchTo().defaultContent();
    }
}
