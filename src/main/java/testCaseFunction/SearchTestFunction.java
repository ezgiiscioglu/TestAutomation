package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SearchTestFunction extends BasePage {
    private By searchBox  = By.id("searchData");
    private By search = By.xpath(("//a[@title='ARA']"));
    //private By secondPage = By.linkText("2");
    private By secondPage = By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div[4]/a[2]");


    public SearchTestFunction(WebDriver driver) {
        super(driver);
    }
    public void searchTest() {
        element(searchBox ).sendKeys("bilgisayar");
        element(search).click();
        element(secondPage).click();
    }
}
