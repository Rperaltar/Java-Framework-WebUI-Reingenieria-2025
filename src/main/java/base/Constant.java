package base;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Constant {

    //Variables URl
    public static String TOOLS_QA  = "http://opencart.abstracta.us/";
    public static String guru99   ="https://demo.guru99.com/test/newtours/register.php";
    //Timestamp
    public static String TIME_STAMP = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
    public static String PATH_REPORT = "C:\\Users\\saulf\\Documents\\Automation_Proyects\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\src\\test\\ExtReport\\";
    //Ashot
    public static String PATH_ASHOT = "C:\\Users\\saulf\\Documents\\Automation_Proyects\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\src\\test\\Ashot\\";
    public static String NAME_ASHOOT = "Capture_";
    //Report Extent
    public static String NAME_REPORT = "ExtentReport_";
    public static String EXT_REPORT = ".html";

    //Variables Logs
    public static String INICIA_NAVEGADOR = "Inicia Instancia WebDriver";

    //Variables - para almavenar las evidencias de los locators en formato png
    public static String PATH_ASHOT_ELEMENT_WEB = "C:\\Users\\saulf\\Documents\\Automation_Proyects\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\screenshotElement\\";
    public static String NAME_ASHOT_ELEMENT_WEB = "ashotElementWeb_";
    public static String EXT_ASHOT_ELEMENT_WEB = ".png";
    public static String ALLPATH_ASHOT_ELEMENT_WEB = PATH_ASHOT_ELEMENT_WEB + NAME_ASHOT_ELEMENT_WEB + TIME_STAMP + EXT_ASHOT_ELEMENT_WEB;
}
