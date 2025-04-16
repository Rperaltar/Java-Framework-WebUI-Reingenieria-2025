package base;

import actionsScreenPlay.Implements.ModelActionsImpl;
import actionsScreenPlay.Implements.ModelAssertImpl;
import actionsScreenPlay.Implements.ModelWaitsImpl;
import actionsScreenPlay.Interfaces.ModelActionsInterface;
import actionsScreenPlay.Interfaces.ModelAssertInterface;
import actionsScreenPlay.Interfaces.ModelWaitsInterface;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import videoRecorder.VideoRecorder;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Constant {

    /**
     * Logger instance for the BaseTest class.
     * This logger is used to log messages for debugging and tracking purposes.
     * It is initialized using the LogManager with the name of the BaseTest class.
     */
    public static String optionsDriver;
    protected ExtentTest test;
    public static WebDriver driver;
    protected ExtentReports extent;
    private VideoRecorder videoRecorder;

    /**
     * A static instance of the ModelActionsInterface, initialized with an implementation
     * of ModelActionsImpl. This can be used to perform actions defined in the
     * ModelActionsInterface throughout the application.
     */
    public static ModelActionsInterface actions = new ModelActionsImpl();
    public static ModelWaitsInterface waits = new ModelWaitsImpl();
    public static ModelAssertInterface Assert = new ModelAssertImpl();
    public static Logger log = LogManager.getLogger(BaseTest.class.getName());

    /**
     * A constant string that holds the URL for the Guru99 registration page.
     * This URL points to the registration form on the Guru99 demo website.
     */
    public static String TOOLS_QA  = "http://opencart.abstracta.us/";
    public static String guru99   ="https://demo.guru99.com/test/newtours/register.php";

    /**
     * The PATH_REPORT constant defines the file path to the directory where
     * the Extent Reports are stored. This path is used for generating and
     * saving test execution reports in the specified location.
     *
     * Note: Ensure that the file path is valid and accessible on the system
     * where the application is running. Update the path if the directory
     * structure changes.
     */
    public static String TIME_STAMP = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
    public static String PATH_REPORT = "C:\\Users\\saulf\\Documents\\Automation_Proyects\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\src\\test\\ExtReport\\";

    /**
     * The PATH_ASHOT constant defines the file path to the directory where Ashot-related
     * resources are stored. This path is used in the automation projects for managing
     * screenshots or other Ashot framework-related files.
     *
     * Note:
     * - Ensure that the path is correctly set according to the file structure of your project.
     * - Update this path if the directory structure changes.
     */
    public static String PATH_ASHOT = "C:\\Users\\saulf\\Documents\\Automation_Proyects\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\src\\test\\Ashot\\";
    public static String NAME_ASHOOT = "Capture_";

    /**
     * A constant that represents the prefix for the name of the extent report files.
     * This is used to generate report file names dynamically.
     */
    public static String NAME_REPORT = "ExtentReport_";
    public static String EXT_REPORT = ".html";

    /**
     * A constant string representing the action to initialize a WebDriver instance.
     */
    public static String INICIA_NAVEGADOR = "Inicia Instancia WebDriver";

    /**
     * The file path where the screenshots of web elements will be stored.
     * This path is used to save the captured screenshots during automation testing.
     *
     * Example:
     * "C:\\Users\\saulf\\Documents\\Automation_Proyects\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\screenshotElement\\"
     */
    public static String PATH_ASHOT_ELEMENT_WEB = "C:\\Users\\saulf\\Documents\\Automation_Proyects\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\screenshotElement\\";
    public static String NAME_ASHOT_ELEMENT_WEB = "ashotElementWeb_";
    public static String EXT_ASHOT_ELEMENT_WEB = ".png";
    public static String ALLPATH_ASHOT_ELEMENT_WEB = PATH_ASHOT_ELEMENT_WEB + NAME_ASHOT_ELEMENT_WEB + TIME_STAMP + EXT_ASHOT_ELEMENT_WEB;
}
