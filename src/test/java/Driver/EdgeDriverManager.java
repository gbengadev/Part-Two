package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static io.github.bonigarcia.wdm.config.DriverManagerType.EDGE;

public class EdgeDriverManager extends DriverManager {
    @Override
    protected void createDriver() {
        System.out.println("Initializing FireFox Driver"); // Change to Loggers
        WebDriverManager.getInstance(EDGE).setup();

        driver= new EdgeDriver();
    }
}
