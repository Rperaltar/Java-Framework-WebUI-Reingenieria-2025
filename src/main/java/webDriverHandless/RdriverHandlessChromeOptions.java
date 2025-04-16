package webDriverHandless;

import base.utils.Constantes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class RdriverHandlessChromeOptions extends Constantes {

    /*
    ##########################################
    #                                        #
    #  Clase - Rdriver                       #
    #  Se crean 4 Objetos de tipo WebDriver  #
    #   1.- CreateChromeDriver               #
    #   2.- CreateFireFox                    #
    #   3.- CreateInternetExplorerDriver     #
    #   4.- CreateOperaDriver                #
    #  para levantar la sesión deseada       #
    #  a nivel navegador.                     #
    #                                        #
    ##########################################
    */

    // Constructor de la clase - Rdriver
    public RdriverHandlessChromeOptions(){
    }

    // Objeto - que crea las propiedades de tipo de sistema operativo y levanta la sessión con el driver - "GECKO_DRIVER"
    private static String modifyIfWindows(String driverPath) {
        if (System.getProperty("os.name").toLowerCase().contains("windows")){
            return driverPath + ".exe";
        } else {
            return driverPath;
        }
    }

    //Metodo - que crea los Objetos de tipo "WebDriver" para cada navegador agregando algunas Opciones
    private static WebDriver getheadlessAll() {

        //Incognito Options for Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("disable-plugins");
        chromeOptions.addArguments("disable-extensions");
        chromeOptions.addArguments("--dns-prefetch-disable");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("no-default-browser-check");
        chromeOptions.addArguments("--start-fullscreen", "--disable-gpu");

        // Se crean Opciones para hacer el setBrowser del objeto chromeOptions

        return new ChromeDriver(chromeOptions);
    }

    //Metodo - que crea los Objetos de tipo "WebDriver" para cada navegador agregando algunas Opciones
    private static WebDriver getheadlessDisable() {

        //Incognito Options for Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("disable-plugins");
        chromeOptions.addArguments("disable-extensions");
        chromeOptions.addArguments("--dns-prefetch-disable");
        chromeOptions.addArguments("--disable-dev-shm-usage");

        // Se crean Opciones para hacer el setBrowser del objeto chromeOptions
        return new ChromeDriver(chromeOptions);
    }

    //Metodo - que crea los Objetos de tipo "WebDriver" para cada navegador agregando algunas Opciones
    private static WebDriver getheadlessNosandbox() {

        //Incognito Options for Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("no-default-browser-check");
        chromeOptions.addArguments("--start-fullscreen", "--disable-gpu");

        // Se crean Opciones para hacer el setBrowser del objeto chromeOptions
        return new ChromeDriver(chromeOptions);
    }


    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Chrome
    public static WebDriver CreateChromeDriverHandlessAll(String driverPath) {
            System.setProperty("webdriver.chrome.driver", modifyIfWindows(driverPath + CHROME_DRIVER));
        return getheadlessAll();

    }

    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Chrome
    public static WebDriver CreateChromeDriverHandlessDisable(String driverPath) {
            System.setProperty("webdriver.chrome.driver", modifyIfWindows(driverPath + CHROME_DRIVER));
        return getheadlessDisable();
    }

    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Chrome
    public static WebDriver CreateChromeDriverHandlessNoSambox(String driverPath) {
            System.setProperty("webdriver.chrome.driver", modifyIfWindows(driverPath + CHROME_DRIVER));
        return getheadlessNosandbox();
    }
}
