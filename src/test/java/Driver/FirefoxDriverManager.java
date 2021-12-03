package Driver;

//import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static io.github.bonigarcia.wdm.config.DriverManagerType.FIREFOX;

public class FirefoxDriverManager extends DriverManager {

    @Override
    protected void createDriver() {
        System.out.println("Initializing FireFox Driver"); // Change to Loggers
        WebDriverManager.getInstance(FIREFOX).setup();

        driver= new FirefoxDriver();
    }
}
