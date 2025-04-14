package base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Constant {

    //Variables URl
    public static String TOOLS_QA  = "http://opencart.abstracta.us/";
    public static String guru99   ="https://demo.guru99.com/test/newtours/register.php";
    //Timestamp
    public static String TIME_STAMP = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
    public static String PATH_REPORT = "C:\\Users\\saulf\\Documents\\Automation_MIT\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\src\\test\\ExtReport\\";
    //Ashot
    public static String PATH_ASHOT = "C:\\Users\\saulf\\Documents\\Automation_MIT\\Reingenieria Java Framework\\Java-Proyect-FrontEnd-2025\\src\\test\\Ashot\\";
    public static String NAME_ASHOOT = "Capture_";
    //Report Extent
    public static String NAME_REPORT = "ExtentReport_";
    public static String EXT_REPORT = ".html";
    //Variables ExcelFile
    public static String ExcelPath = "/Users/roberto/Documents/TodoBunsan/Proyecto_Panzura/Pruebas_Automatizadas/Front-End/Panzura_Web_Jenkins/ExcelPoi/";
    //Variables Login
    public static String USER = "admin";
    public static String PASSWORD  = "Bunsan2021.";
    public static String USER_SESSION = "WELCOME, ADMIN. VIEW SITE / CHANGE PASSWORD / LOG OUT";
    //Variables Assert`s
    public static String ASSERT_MODULE_PAGE_USER = "Add User";
    public static String ASSERT_GROUP = "Groups";
    public static String ASSERT_CONECTION_AUDIT_ENTRIE = "Connection audit entries";
    public static String ASSERT_SHARED_AUDI_ENTRIES = "Shared audit entries";
    public static String ASSERT_SHARED_PATH_PROPERTIES = "Shared path properties";
    public static String ASSERT_SHARED_PATHS= "Shared paths";
    public static String ASSERT_USERS= "Users";
    public static String ASSERT_LOG_ENTRIES= "Log entries";
    public static String VERSION = "v.0.1.10";
    public static String ADMIN = "ADMIN.";
    public static String CHANGE_USER = "Select User to change";
    public static String ASSERT_SHARE_FILE_PROPERTIES = "Shared file properties";
    //Variables Logs
    public static String INICIA_SESION = "Inicia Sesión";
    public static String CIERRA_SESION = "Cierra Sesion ";
    public static String INICIA_NAVEGADOR = "Inicia Instancia WebDriver";
    public static String INICIA_VERIFICACION_OK = "Verificación Exitosa";
    public static String SUBMENU_USER = "A dado click al menu AddUser";
    public static String FORM_USER = "Test addUser Complete";
    public static String FORM_USER_UPDATE = "Exitoso";
    public static String MENU_USERS = "A dado click a Menù Users";
    public static String TEST_SMOKE = "Test Smoke Complete";
    public static String DELETE_USER = "Test delete user Complete";
    public static String UPDATE_USER = "Test update user Complete";
    //Variables Screenshot
    public static String PATH_ASHOOT = "/Users/roberto/Documents/TodoBunsan/Proyecto_Panzura/Pruebas_Automatizadas/Front-End/PANZURA_WEB/src/main/java/ScreeShot/";
    //Variables Formulario Nuevo User
    public static String USER_NAME = "Test_CI";
    public static String NEW_PASSWORD = "1111";
    public static String ROLE_PROXY = "Proxy";
    public static String ID_NAME = "Automation CI";
    public static String LAST_NAME = "QA_dev";
    public static String EMAIL = "test@gmail.com";
    public static String NAME_UPDATE = "Test_QAUpdate";
    //Variables Formulario Nuevo PATH
    public static String PATH_NAME = "Test_Automation_Path";
    public static String LOCAL_PATH_NAME = "C:/Test_Automation_Local_Path";
    public static String ASSERT_PATH = "Select shared path to change";
    //Variables Formulario Nueva Company
    public static String COMPANY_NAME = "Test_Automation_Company";
    public static String PROXY_USERNAME = "";
    public static String CONTACT_USERNAME = "";
    public static String ASSERT_COMPANY = "Select Company to change";
}
