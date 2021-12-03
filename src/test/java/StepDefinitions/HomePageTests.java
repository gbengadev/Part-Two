package StepDefinitions;

import Driver.DriverManager;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;


public class HomePageTests  {
    HomePage homePage;

public HomePageTests(HomePage homePage){
    this.homePage=homePage;
}

    @Given("user is on home page")
public void goToHomePage(){
    homePage.getUrl();
}

@When("user clicks on \"Products\" menu")
public void clickProductMenu()
{
 homePage.clickProductDropDown();
}


@Then("\"Build Wealth\" is included in the submenu")
public void checkSubMenu()
{
    homePage.verifyBuildWealthLink();
}


}
