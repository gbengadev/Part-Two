package Driver;


import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager extends DriverManager {

    @Override
    protected void createDriver() {
        System.out.println("Initializing Chrome Driver");
        WebDriverManager.getInstance(CHROME).setup();
        driver= new ChromeDriver();
    }



}
