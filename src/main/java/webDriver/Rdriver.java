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

    /**
     * Default constructor for the Rdriver class.
     * This constructor initializes an instance of the Rdriver class.
     */
    public Rdriver(){
    }

    /**
     * Modifies the given driver path by appending ".exe" if the operating system is Windows.
     *
     * @param driverPath The original driver path as a string.
     * @return The modified driver path with ".exe" appended if the OS is Windows,
     *         otherwise returns the original driver path.
     */
    private static String modifyIfWindows(String driverPath) {
        if (System.getProperty("os.name").toLowerCase().contains("windows")){
            return driverPath + ".exe";
        } else {
            return driverPath;
        }
    }

    /**
     * Creates and returns a WebDriver instance configured to run in incognito/private mode
     * based on the specified driver type.
     *
     * @param driverType The type of WebDriver to create. Supported values are:
     *                   "chromedriver" for Google Chrome,
     *                   "geckodriver" for Mozilla Firefox,
     *                   "operadriver" for Opera,
     *                   "IEDriverServer" for Internet Explorer,
     *                   "msedgedriver" for Microsoft Edge.
     * @return A WebDriver instance configured for incognito/private mode, or null if the driver type is unsupported.
     */
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

    /**
     * Creates a new instance of a Firefox WebDriver.
     *
     * @param driverPath The path to the directory containing the GeckoDriver executable.
     * @param incognito  A boolean flag indicating whether to launch the browser in incognito mode.
     *                   If true, the browser will be launched in incognito mode.
     * @return A WebDriver instance for Firefox. If incognito mode is enabled, the browser will
     *         be configured accordingly.
     */
    //Objeto Compuesto del metodo "modifyIfWindows y getIncognito" - tipo Session WebDriver en el navegador de Firefox
    public static WebDriver CreateFireFox(String driverPath, boolean incognito){
        System.setProperty("webdriver.gecko.driver", modifyIfWindows(driverPath + GECKO_DRIVER));
        if(incognito){
            return getIncognito(GECKO_DRIVER);
        }
        return new FirefoxDriver();
    }

    /**
     * Creates and initializes a Chrome WebDriver instance.
     *
     * @param driverPath The path to the directory containing the ChromeDriver executable.
     * @param incognito  A boolean flag indicating whether to launch the browser in incognito mode.
     * @return A WebDriver instance for Chrome. If incognito is true, the browser is launched in incognito mode.
     * @throws IllegalStateException If the ChromeDriver executable cannot be found or initialized.
     */
    public  static WebDriver CreateChromeDriver(String driverPath, boolean incognito) {
        System.setProperty("webdriver.chrome.driver", modifyIfWindows(driverPath + CHROME_DRIVER));
        if (incognito) {
            return getIncognito(CHROME_DRIVER);
        }
        return new ChromeDriver();
    }

    /**
     * Creates and returns an instance of an Internet Explorer WebDriver.
     *
     * @param driverpath The path to the directory containing the Internet Explorer WebDriver executable.
     * @param incognito  A boolean flag indicating whether to launch the browser in incognito mode.
     *                   If true, the browser will be launched in incognito mode.
     * @return A WebDriver instance for Internet Explorer. If incognito mode is enabled,
     *         the browser will be configured accordingly.
     */
    public static WebDriver CreateInternetExplorerDriver(String driverpath, boolean incognito){
        System.setProperty("webdriver.ie.driver", modifyIfWindows(driverpath + IE_DRIVER));
        if(incognito){
            return getIncognito(IE_DRIVER);
        }
        return new InternetExplorerDriver();
    }

    /**
     * Creates and returns an instance of a WebDriver configured for the Opera browser.
     *
     * @param driverpath The file path to the Opera WebDriver executable.
     * @param incognito  A boolean flag indicating whether to launch the browser in incognito mode.
     *                   If true, the browser will be launched in incognito mode.
     * @return A WebDriver instance configured for the Opera browser.
     */
    public static WebDriver CreateOperaDriver(String driverpath, boolean incognito){
        if(incognito){
            return getIncognito(OPERA_DRIVER);
        }
        OperaOptions operaOptions = new OperaOptions();
        operaOptions.getVersion();
        System.setProperty("webdriver.opera.driver", modifyIfWindows(driverpath + OPERA_DRIVER));
        return new OperaDriver(operaOptions);

    }

    /**
     * Creates and initializes a new instance of the Edge WebDriver.
     *
     * @param driverpath The path to the directory containing the Edge WebDriver executable.
     *                    This path will be modified if the operating system is Windows.
     * @return A new instance of the EdgeDriver configured with default EdgeOptions.
     * @throws IllegalStateException If the WebDriver executable cannot be found or loaded.
     */
    public static WebDriver CreateEdgeDriver(String driverpath){
        System.setProperty("webdriver.edge.driver", modifyIfWindows(driverpath + EDGE_DRIVER));
        return new EdgeDriver(new EdgeOptions());
    }
}
