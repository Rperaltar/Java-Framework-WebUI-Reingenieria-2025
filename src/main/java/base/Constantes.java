package base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Constantes {

    /*
    ###########################
    #  Clase - Constantes     #
    #  Para Almacenar         #
    #  las variables Globales #
    #  de tipo                #
    #  Constantes             #
    #                         #
    ###########################
     */

    /**
     * The name of the Internet Explorer WebDriver executable.
     * This constant is used to specify the filename of the IEDriverServer
     * executable required for automating Internet Explorer browser interactions.
     */
    public static String CHROME_DRIVER = "chromedriver";
    public static String GECKO_DRIVER = "geckodriver";
    public static String OPERA_DRIVER = "operadriver";
    public static String IE_DRIVER    = "IEDriverServer";
    public static String EDGE_DRIVER  = "msedgedriver";


    /**
     * The file path to the directory containing the driver executables required
     * for browser automation. This path is used to locate the necessary drivers
     * for initializing and controlling web browsers during automated testing.
     *
     * Example usage:
     * - ChromeDriver executable should be placed in this directory.
     * - Ensure the path is correctly set to avoid runtime errors.
     *
     * Note: Update this path if the project directory structure changes.
     */
    public static String DRIVER_PATH = "C:\\Users\\saulf\\Documents\\Automation_Proyects\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\src\\main\\java\\drivers\\";

    /**
     * A constant string used as a prefix for test login names.
     */
    public static String PATH_ASHOT         = "";
    public static String NAME_ASHOT         = "TestLogin_";
    public static String EXT_ASHOT          = ".jpg";

    /**
     * A constant string that represents the current timestamp formatted as "yyyy_MM_dd__hh_mm_ss".
     * The timestamp is generated using the {@link SimpleDateFormat} class and the current date and time.
     *
     * Note: The value of this constant is initialized at the time of class loading and will not update
     * dynamically. It will always reflect the timestamp of when the class was first loaded.
     */
    public static String TIME_STAMP = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

    /**
     * A constant representing the base name for the extent report file path.
     * This string can be used as a prefix or identifier for report files.
     */
    public static String PATH_EXTENT_REPORT = "";
    public static String PATH_NAME          = "extentReport_";
    public static String PATH_EXTENSION     = ".html";

    /**
     * The file path where browser log files are stored.
     * This path is used to save logs generated during browser automation.
     *
     * Example:
     * "/Users/roberto/Documents/Tools_Automation/Java/JAVA_AUTO_SELENIUM/SeleniumWeb/FilesLogBrowser/"
     */
    public static String PATH_BROWSER_LOG = "/Users/roberto/Documents/Tools_Automation/Java/JAVA_AUTO_SELENIUM/SeleniumWeb/FilesLogBrowser/";
    public static String NAME_BROWSER_LOG = "Browser";
    public static String EXT_BROWSER_LOG  = ".log";


}
