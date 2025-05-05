package base.instances;

import actionsSeleniumWd.Implements.ModelActionsImpl;
import actionsSeleniumWd.Implements.ModelAssertImpl;
import actionsSeleniumWd.Implements.ModelWaitsImpl;
import actionsSeleniumWd.Interfaces.ModelActionsInterface;
import actionsSeleniumWd.Interfaces.ModelAssertInterface;
import actionsSeleniumWd.Interfaces.ModelWaitsInterface;
import base.utils.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import videoRecorder.VideoRecorder;

public class BaseTestInstance {

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

}
