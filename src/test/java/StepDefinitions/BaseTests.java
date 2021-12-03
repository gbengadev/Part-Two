package StepDefinitions;

import Driver.DriverFactory;
import Driver.DriverManager;
import Driver.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static Driver.DriverType.*;

public class BaseTests {
    DriverManager driverManager;
    private WebDriver driver;
    private final String baseUrl ="https://risevest.com/";


    @Before
    public void setup()  {
        System.out.println("Me");
        System.out.println(System.getProperty("browser"));
        driverManager = DriverFactory.getManager(System.getProperty("browser"));
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    @After
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }

    public WebDriver getDriver(){
        return driver;
    }


}

