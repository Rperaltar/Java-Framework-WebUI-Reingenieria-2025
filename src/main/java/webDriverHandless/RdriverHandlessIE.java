package webDriverHandless;

import base.Constantes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;


public class RdriverHandlessIE extends Constantes {

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
    public RdriverHandlessIE(){
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
    private static WebDriver getDriver() {
            //Options for Internet Explorer
            InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
            internetExplorerOptions.setCapability("ie.usePerProcessProxy", "true");
            internetExplorerOptions.setCapability("requireWindowFocus", "false");
            internetExplorerOptions.setCapability("ie.browserCommandLineSwitches", "-private");
            internetExplorerOptions.setCapability("ie.ensureCleanSession", "true");

        return new InternetExplorerDriver(internetExplorerOptions);
    }

    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Chrome
    public static WebDriver CreateInternetExplorerDriver(String driverpath, boolean incognito){
        System.setProperty("webdriver.ie.driver", modifyIfWindows(driverpath + IE_DRIVER));
        return getDriver();
    }
}
