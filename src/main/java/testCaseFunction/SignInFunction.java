package testCaseFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import utils.BasePage;

public class SignInFunction extends BasePage {
    public SignInFunction(WebDriver driver) {
        super(driver);
    }
    private String pass = "testtest1";
    private By loginEmail = By.id("email");
    private By loginPassword = By.id("password");
    private By loginBtn = By.id("loginButton");
    private String emailAddress = "testtestbir@gmail.com";
    private String fName = "test";
    private String lName = "testbir";

    public void signInForm() {
        element(By.linkText("Giriş Yap")).click();
        sendKeys(loginEmail,emailAddress);
        sendKeys(loginPassword, pass);
        element(loginBtn).click();
    }
}
