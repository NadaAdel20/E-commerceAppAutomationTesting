package Pages;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResetPasswordPage {

    public WebElement EmailPOM(WebDriver driver)
    {
        return driver.findElement(By.id("Email"));
    }

    public By Message()
    {
        return By.className("content");
    }
    public void ResetPasswordStep(WebDriver driver,String Email)
    {
        EmailPOM(driver).clear();
        EmailPOM(driver).sendKeys(Email);


    }

}
