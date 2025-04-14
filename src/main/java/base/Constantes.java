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

    //variables - para almacenar los driver de los Navegadores esta se utilizan en la "clase Rdriver"
    public static String CHROME_DRIVER = "chromedriver";
    public static String GECKO_DRIVER = "geckodriver";
    public static String OPERA_DRIVER = "operadriver";
    public static String IE_DRIVER    = "IEDriverServer";
    public static String EDGE_DRIVER  = "msedgedriver";

    //variables - para almacenar la configuración de los reportes de tipo "HTML - REPORT - estas se utilizan en las"clases TEST"
    public static String UFT_8          = "utf-8";
    public static String TITLE          = "W2A Automation Reports";
    public static String REPORT_NAME    = "Automation Test Results";
    public static String ROLE           = "Automation Tester";
    public static String INFO_QA        = "Roberto Carlos";
    public static String INFO_ORG       = "Orgainzation";
    public static String NAME_ORG       = "Orgainzation";
    public static String INFO_SYS       = "Build No";
    public static String INFO_SYS_NAME  = "Build No";
    public static String MS_CREATE_TEST = "Test1 - solicitud_PFAE";

    //variables - para almacenar los mensajes de la generación - LOGS - estas se utilizan en las "clases TEST"
    public static String MS_SETUP       = "Iniciando Clase de Pruebas:";
    public static String MS_CLOSE_TEST  = "Ejecucion Finalizada:";
    public static String MS_SUITE_TEST  = "Iniciando Prueba:";

    //Variables - para almacenar los mensajes en consola - PRINTS OUT  - estas se utilizan en las "clases TEST"
    public static String MS_PRINT        = "Test Succes";

    //Variables - para almacenar los localizadores y llamarlos con "Implicit / Expicit Waits - LOCATOR´S - estas se utilizan en las "clases TEST"
    public static String NOMBRE_EMPRESA_LOCATOR  = "nombreEmpresa";
    public static String CELULAR_LOCATOR = "celular";
    public static String RFC_LOCATOR     = "rfc";

    //Variables - para almacenar las - URL´ de la pagina a desplegar y para los driver de los "Navegadores"
    public static String DRIVER_PATH = "C:\\Users\\saulf\\Documents\\Automation_Proyects\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\src\\main\\java\\drivers\\";

    //Variables - para almacenar las rutas de los archivos que se utilizan en "Apache Poi"
    public static String EXCEL_PATH         = "";
    public static String EXCEL_FILE         = "Inputs.xlsx";

    //Variables - para almacenar las rutas de la imagenes que se generan de cada prueba - "Archivos ScreenShot.png / .jpg"
    public static String PATH_ASHOT         = "";
    public static String NAME_ASHOT         = "TestLogin_";
    public static String EXT_ASHOT          = ".jpg";

    //Variables - para almacenar y hacer el seteo del formato de tipo - "TIME_STAMP_yyyy_MM_dd__hh_mm_ss"
    public static String TIME_STAMP = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

    //Variables - para almacenar las rutas de los reportes generados de tipo "HTML_REPORT- EXTENT_REPORT"
    public static String PATH_EXTENT_REPORT = "";
    public static String PATH_NAME          = "extentReport_";
    public static String PATH_EXTENSION     = ".html";

    //Variables - para almacenar las rutas de los log´s generados por el navegador al ejecutar las pruebas de UI estos son de tipo "BROWSER_LOG_REPORT"
    public static String PATH_BROWSER_LOG = "/Users/roberto/Documents/Tools_Automation/Java/JAVA_AUTO_SELENIUM/SeleniumWeb/FilesLogBrowser/";
    public static String NAME_BROWSER_LOG = "Browser";
    public static String EXT_BROWSER_LOG  = ".log";


}
