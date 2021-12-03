package Pages;

import StepDefinitions.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    BaseTests baseTests;
    private By productDropDown= By.xpath("//span[@class='jsx-3936143020']");
    private By buildWealthLink= By.xpath("//a[.='Build Wealth']");

    public HomePage(BaseTests baseTests){
        this.driver= baseTests.getDriver();
    }

    public void getUrl(){
        driver.get("https://risevest.com/");
    }

    public void clickProductDropDown(){
        driver.findElement(productDropDown).click();
    }
    public Boolean verifyBuildWealthLink(){
      return  driver.findElement(productDropDown).isDisplayed();
    }

    public void getBuildWealthPage(){
        driver.findElement(buildWealthLink).click();
    }

}
