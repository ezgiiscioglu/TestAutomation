package listener;

import org.apache.log4j.MDC;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.BaseTest;

public class Listener extends BaseTest implements ITestListener {
    public void OnTestStart(ITestResult iTestResult) {

        driver.get(baseUrl);
        log.info("n11 is opened");
    }
    public void OnTestSuccess(ITestResult iTestResult) {

        System.out.println("Successed");
        log.info("Successed");
    }
    public void OnTestFailure(ITestResult iTestResult) {

        System.out.println("Failed");
        MDC.put("fail",iTestResult.getThrowable());
        log.error("Failed");
    }
    public void OnTestSkipped(ITestResult iTestResult) {

        System.out.println("Skipped");
        log.warn("Skipped");
    }
    public void OnTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }
    public void OnStart(ITestContext iTestContext) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Casper\\Downloads\\geckodriver.exe");
        driver = new FirefoxDriver();
        MDC.put("name",iTestContext.getName());
        log.info("Browser açıldı");
    }
    public void OnFinish(ITestContext iTestContext) {
        log.info("Browser kapatıldı");
        //driver.quit();
    }
}
