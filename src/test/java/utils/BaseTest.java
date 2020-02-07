package utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
        public static WebDriver driver;
        public static String baseUrl = "https://www.n11.com/";
        public Logger log = LogManager.getLogger(getClass().getName());

        @BeforeClass
        public static void setUp() {
                System.setProperty("webdriver.gecko.driver","C:\\Users\\Casper\\Downloads\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get(baseUrl);
        }
        @AfterClass
        public static void tearDown() {
                //driver.quit();
        }
}
