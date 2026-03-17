package driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() 
    {
        if (driver.get() == null) 
        {
            driver.set(createDriver());
        }
        return driver.get();
    }

    private static WebDriver createDriver() {
        WebDriver driver = null;

        String browseString = "chrome";

        switch (browseString) {
            case "chrome" -> {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--window-size=1920,1080");
            chromeOptions.addArguments("--remote-allow-origins=*");
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("linux")) 
            {
                chromeOptions.addArguments("--headless=new");    
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--disable-dev-shm-usage");
                chromeOptions.addArguments("--disable-gpu");
            }
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new ChromeDriver(chromeOptions);
            break;
            }
            case "firefox" -> {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments("--window-size=1920,1080");
            firefoxOptions.addArguments("--remote-allow-origins=*");
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("linux")) 
            {
                firefoxOptions.addArguments("--headless=new");    
                firefoxOptions.addArguments("--no-sandbox");
                firefoxOptions.addArguments("--disable-dev-shm-usage");
                firefoxOptions.addArguments("--disable-gpu");
            }
            firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new FirefoxDriver(firefoxOptions);
            break;
            }
        }
        driver.manage().window().maximize();
        return driver;
    }
    public static void cleanupDriver() 
    {
        driver.get().quit();
        driver.remove();
    }
}

