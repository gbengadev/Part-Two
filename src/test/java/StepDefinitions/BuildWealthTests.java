package StepDefinitions;

import Pages.BuildWealthPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class BuildWealthTests {
    private String age="25";
    private String salary="350000";
    private String investmentPercentage="20";
    private String investmentPreference="Stability";
    private String retirementAge="60";
    private String wealthValue="$1,309,578.71";





    HomePage homePage;
    BuildWealthPage buildWealthPage;

    public BuildWealthTests(HomePage homePage,BuildWealthPage buildWealthPage){
        this.homePage=homePage;
        this.buildWealthPage=buildWealthPage;
    }

    public void getBuildWealthPage(){
        homePage.getUrl();
        homePage.clickProductDropDown();
        homePage.getBuildWealthPage();
    }


   // Scenario: Capture and Print all text in H1 tag on the page

    @Given ("user is on the \"Build Wealth\" page")
    public void goToBuildWealth(){
        getBuildWealthPage();
    }
    @Then("the text in the header tag should be printed")
    public void printHeaderText(){
        buildWealthPage.printHeaderText();
    }


    // Scenario: Verify and print the wealth value for Tope when he retires at the age of 60

    @Given("Tope is on the \"Build Wealth\" page")
    public void goToBuildWealthPage()
    {
       getBuildWealthPage();
    }

    @When("Tope enters his age")
    public void enterAge(){
        buildWealthPage.enterAge(age);
    }

    @And("Tope enters his salary")
    public void enterSalary(){
        buildWealthPage.enterSalary(salary);
    }
    @And("Tope enters his investmentPercentage")
    public void enterInvestmentPercentage(){
        buildWealthPage.enterInvestmentPercentage(investmentPercentage);
    }
    @And("Tope enters his retirementAge")
    public void enterRetirementAge(){
        buildWealthPage.enterRetirementAge(retirementAge);
    }
    @And("Tope enters his investmentPreference")
    public void enterInvestmentPreference(){
        buildWealthPage.selectInvestmentPreference(investmentPreference);
    }
    @And("Tope clicks the calculateBUtton")
    public void clickCalculateButton(){
        buildWealthPage.clickCalculateButton();
    }
    @Then("the wealth value for Tope should be displayed and printed")
    public void getWealthValue(){
        assertEquals(buildWealthPage.getWealthValue(),wealthValue);
    }


}
