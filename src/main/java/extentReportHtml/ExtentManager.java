package extentReportHtml;

import base.Constant;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager extends Constant {
    private static ExtentReports extent;

    public static ExtentReports getExtent() {
        if (extent == null) {
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(PATH_REPORT + NAME_REPORT + TIME_STAMP + EXT_REPORT);
            htmlReporter.config().setTheme(Theme.DARK);
            htmlReporter.config().setReportName("Automation Test Regresion");
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
        }
        return extent;
    }
}