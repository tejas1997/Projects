import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;

public class MobileBrowserTest {

    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setUp() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");   // change to your device from: adb devices
        options.setBrowserName("Chrome");          // opens mobile Chrome browser

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        System.out.println("Driver started successfully!");
    }

    @Test
    public void searchOnGoogle() {

        // Open Google
        driver.get("https://www.google.com");
        System.out.println("Opened Google");

        // Wait for search box and type
        WebElement searchBox = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.name("q"))
        );
        searchBox.sendKeys("Appium automation");
        searchBox.submit();
        System.out.println("Search submitted!");

        // Wait for results
        wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("search"))
        );
        System.out.println("Search results loaded!");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Driver closed.");
        }
    }
}