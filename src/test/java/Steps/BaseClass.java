package Steps;

import Pages.login;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {
    public WebDriver driver;

    public void launchBrowser(){
       // WebDriver driver;
        WebDriverManager.chromedriver().version("91.0.4472.101").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
    }


    public void clickEvent( By elementId){
        driver.findElement(elementId).click();
    }

    public void inputEvent(By elementId, String inputData){
        driver.findElement(elementId).sendKeys(inputData);
    }

    public void select(WebElement webElement, String value){
         Select select = new Select(webElement);
         select.selectByValue(value);

    }

}
