package driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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

        switch (getBrowserType()) {
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
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("linux")) 
            {
                firefoxOptions.addArguments("--headless=new");    
            }
            firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new FirefoxDriver(firefoxOptions);
            break;
            }
        }
        driver.manage().window().maximize();
        return driver;
    }

private static String getBrowserType() {
        String browserType = null;
        String browserTypeRemoteValue = System.getProperty("browserType");
        try{
            if(browserTypeRemoteValue == null || browserTypeRemoteValue.isEmpty()) {
            Properties properties = new Properties();
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/properties/config.properties");
            properties.load(file);
            browserType = properties.getProperty("browser").toLowerCase().trim();
        } 
    else
        {
        browserType = browserTypeRemoteValue;
        }
}   
    catch (IOException e) {
            System.out.println("Error reading config.properties file: " + e.getMessage());
        }
        return browserType;
    }    
    public static void cleanupDriver() 
    {
        driver.get().quit();
        driver.remove();
    }
}

