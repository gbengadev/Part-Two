package Pages;

import StepDefinitions.BaseTests;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuildWealthPage {
    private WebDriver driver;

    private By h1Tag= By.tagName("h1");
    private By ageField=By.name("age");
    private By monthlyIncomeField=By.name("salary");
    private By investmentPercentageField=By.name("investmentPercentage");
    private By retirementAgeField=By.name("retirementAge");
    private By investmentPreferenceFIeld=By.name("investmentPreference");
    private By calculateBUtton=By.cssSelector(".bg-primary");
    private By wealthValue=By.xpath("//p[@class='text-2xl text-darkGray font-bold']");

    public void clearField(By element){
        driver.findElement(element).sendKeys(Keys.CONTROL + "a");
        driver.findElement(element).sendKeys(Keys.DELETE);
    }

    public BuildWealthPage(BaseTests baseTests) {
        this.driver= baseTests.getDriver();
    }

    public void printHeaderText(){
       System.out.println( driver.findElement(h1Tag).getText());
    }

    public void enterAge(String age){
        clearField(ageField);
     driver.findElement(ageField).sendKeys(age);
    }
    public void enterSalary(String salary){
        clearField(monthlyIncomeField);
        driver.findElement(monthlyIncomeField).sendKeys(salary);

    }
    public void enterInvestmentPercentage(String investmentPercentage){
        clearField(investmentPercentageField);
    driver.findElement(investmentPercentageField).sendKeys(investmentPercentage);
    }

    public void enterRetirementAge(String retirementAge){
        clearField(retirementAgeField);
    driver.findElement(retirementAgeField).sendKeys(retirementAge);
    }

    public void selectInvestmentPreference(String investmentPreference){
        String scrollAction= "window.scrollBy(0,350)";
        ((JavascriptExecutor)driver).executeScript(scrollAction,"");
        Select preference=new Select(driver.findElement(investmentPreferenceFIeld));
        preference.selectByVisibleText(investmentPreference);
    }

    public void clickCalculateButton(){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(calculateBUtton));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }

    public String getWealthValue(){
       return driver.findElement(wealthValue).getText();
    }

}
