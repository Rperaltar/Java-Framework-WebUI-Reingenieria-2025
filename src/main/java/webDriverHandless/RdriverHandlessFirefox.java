package webDriverHandless;

import base.utils.Constantes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class RdriverHandlessFirefox extends Constantes {

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
    public RdriverHandlessFirefox(){
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
            //Incognito Options for Chrome
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addPreference("network.automatic-ntlm-auth.trusted-uris", "http://,https://");
            firefoxOptions.addPreference("network.automatic-ntlm-auth.allow-non-fqdn", true);
            firefoxOptions.addPreference("network.negotiate-auth.delegation-uris", "http://,https://");
            firefoxOptions.addPreference("network.negotiate-auth.trusted-uris", "http://,https://");
            firefoxOptions.addPreference("network.http.phishy-userpass-length", 255);
            firefoxOptions.addPreference("security.csp.enable", false);
            firefoxOptions.addPreference("network.proxy.no_proxies_on", "");

        return new FirefoxDriver(firefoxOptions);
    }

    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Firefox
    public static WebDriver CreateFirefoxDriver(String driverPath){
        System.setProperty("webdriver.gecko.driver", modifyIfWindows(driverPath + GECKO_DRIVER));
        return getDriver();
    }
}
