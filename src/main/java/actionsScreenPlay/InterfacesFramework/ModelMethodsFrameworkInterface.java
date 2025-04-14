package actionsScreenPlay.InterfacesFramework;

import java.awt.*;
import java.io.IOException;

public interface ModelMethodsFrameworkInterface {


    void getAnalyzeLogBrowser() throws IOException;
    void dataProviderMethod(String value1, String value2);
    void initReport();
    void ExtentReport();
    void ExtentReportAshot() throws IOException;
    void FlushReport();
    void PoiReadExcel(String excelPath) throws IOException;
    void readData(int row, int column);
    void getHtmlUnitDriver();
    void initScreenShot(String path) throws IOException, AWTException;
    void getScreenShot(String path) throws IOException;


}
