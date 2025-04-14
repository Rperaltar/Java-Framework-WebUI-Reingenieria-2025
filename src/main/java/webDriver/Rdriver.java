package webDriver;

import base.Constantes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;


public class Rdriver extends Constantes {

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
    public Rdriver(){
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

        //Incognito Options for Chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

        //Incognito Options for IE Explorer
        InternetExplorerOptions IEOptions = new InternetExplorerOptions();
        IEOptions.addCommandSwitches("-private");

        // Incognito Options for Opera
        OperaOptions operaOptions = new OperaOptions();
        operaOptions.addArguments("private");

        // Incognito Options for Opera
        EdgeOptions edgeOptions = new EdgeOptions();

        // Se crean Opciones para hacer el setBrowser del objeto getIncognito
        switch (driverType){
            case "chromedriver":
                return new ChromeDriver(chromeOptions);
            case "geckodriver":
               return new FirefoxDriver(firefoxOptions);
            case "operadriver":
                return new OperaDriver(operaOptions);
            case "IEDriverServer":
                return new InternetExplorerDriver(IEOptions);
            case "msedgedriver":
                return new EdgeDriver(edgeOptions);
        }

      return null;
    }
    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Firefox
    public static WebDriver CreateFireFox(String driverPath, boolean incognito){
        System.setProperty("webdriver.gecko.driver", modifyIfWindows(driverPath + GECKO_DRIVER));
        if(incognito){
            return getIncognito(GECKO_DRIVER);
        }
        return new FirefoxDriver();
    }
    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Chrome
    public  static WebDriver CreateChromeDriver(String driverPath, boolean incognito) {
        System.setProperty("webdriver.chrome.driver", modifyIfWindows(driverPath + CHROME_DRIVER));
        if (incognito) {
            return getIncognito(CHROME_DRIVER);
        }
        return new ChromeDriver();
    }
    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de ExplorerDriver
    public static WebDriver CreateInternetExplorerDriver(String driverpath, boolean incognito){
        System.setProperty("webdriver.ie.driver", modifyIfWindows(driverpath + IE_DRIVER));
        if(incognito){
            return getIncognito(IE_DRIVER);
        }
        return new InternetExplorerDriver();
    }
    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Opera
    public static WebDriver CreateOperaDriver(String driverpath, boolean incognito){
        if(incognito){
            return getIncognito(OPERA_DRIVER);
        }
        OperaOptions operaOptions = new OperaOptions();
        operaOptions.getVersion();
        System.setProperty("webdriver.opera.driver", modifyIfWindows(driverpath + OPERA_DRIVER));
        return new OperaDriver(operaOptions);

    }
    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de ExplorerDriver
    public static WebDriver CreateEdgeDriver(String driverpath){
        System.setProperty("webdriver.edge.driver", modifyIfWindows(driverpath + EDGE_DRIVER));
        return new EdgeDriver(new EdgeOptions());
    }
}
