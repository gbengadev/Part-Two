package Driver;

public class DriverFactory {

    public static DriverManager getManager(String type) {

        DriverManager driverManager;

        switch (type) {
            case ("CHROME"):
                driverManager = new ChromeDriverManager();
                break;
            case ("FIREFOX"):
                driverManager = new FirefoxDriverManager();
                break;
            default:
                driverManager = new EdgeDriverManager();
                break;
        }
        return driverManager;

    }
}