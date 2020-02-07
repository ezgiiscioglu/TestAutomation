package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SearchTestFunction extends BasePage {
    private By searchBox  = By.id("searchData");

    public SearchTestFunction(WebDriver driver) {
        super(driver);
    }
    public void searchTest() {
        element(searchBox ).sendKeys("bilgisayar");
    }
}
