package webDriver;

import base.Constantes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;


public class RdriverHandlessAll extends Constantes {

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
    public RdriverHandlessAll(){
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
    private static WebDriver getIncognito(String driverType) {

        //Incognito Options for firefox
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addPreference("browser.privatebrowsing.autostart",true);
        firefoxOptions.addPreference("network.automatic-ntlm-auth.trusted-uris", "http://,https://");
        firefoxOptions.addPreference("network.automatic-ntlm-auth.allow-non-fqdn", true);
        firefoxOptions.addPreference("network.negotiate-auth.delegation-uris", "http://,https://");
        firefoxOptions.addPreference("network.negotiate-auth.trusted-uris", "http://,https://");
        firefoxOptions.addPreference("network.http.phishy-userpass-length", 255);
        firefoxOptions.addPreference("security.csp.enable", false);
        firefoxOptions.addPreference("network.proxy.no_proxies_on", "");

        //Incognito Options for Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
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

        //Incognito Options for IE Explorer
        InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
        internetExplorerOptions.addCommandSwitches("-private");
        internetExplorerOptions.setCapability("ie.usePerProcessProxy", "true");
        internetExplorerOptions.setCapability("requireWindowFocus", "false");
        internetExplorerOptions.setCapability("ie.browserCommandLineSwitches", "-private");
        internetExplorerOptions.setCapability("ie.ensureCleanSession", "true");

        // Incognito Options for Opera
        OperaOptions operaOptions = new OperaOptions();
        operaOptions.addArguments("private");
        operaOptions.addArguments("--no-sandbox");
        operaOptions.addArguments("--disable-extensions");

        //CASE
        // Se crean Opciones para hacer el setBrowser del objeto getIncognito
        switch (driverType){
            case "chromedriver":
                return new ChromeDriver(chromeOptions);
            case "geckodriver":
               return new FirefoxDriver(firefoxOptions);
            case "operadriver":
                return new OperaDriver(operaOptions);
            case "IEDriverServer":
                return new InternetExplorerDriver(internetExplorerOptions);
        }
      return null;
    }
    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Firefox
    public static WebDriver CreateFireFox(String driverPath){
           System.setProperty("webdriver.gecko.driver", modifyIfWindows(driverPath + GECKO_DRIVER));
      return new FirefoxDriver();
    }

    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Chrome
    public  static WebDriver CreateChromeDriver(String driverPath) {
           System.setProperty("webdriver.chrome.driver", modifyIfWindows(driverPath + CHROME_DRIVER));
      return new ChromeDriver();
    }
    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de ExplorerDriver
    public static WebDriver CreateInternetExplorerDriver(String driverpath){
           System.setProperty("webdriver.ie.driver", modifyIfWindows(driverpath + IE_DRIVER));
      return new InternetExplorerDriver();
    }
    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Opera
    public static WebDriver CreateOperaDriver(String driverpath,String setbinary){
           OperaOptions operaOptions = new OperaOptions();
           operaOptions.setBinary(setbinary);
           System.setProperty("webdriver.opera.driver", modifyIfWindows(driverpath + OPERA_DRIVER));
      return new OperaDriver(operaOptions);
    }
}
