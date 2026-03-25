package stepdefinitions.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static driver.DriverFactory.cleanupDriver;
import static driver.DriverFactory.getDriver;
import java.sql.Timestamp;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.testng.annotations.AfterTest;

public class Hooks 
{
    @Before
    public void setup() {
        getDriver();
    }

    @AfterStep
    public void screenShotOnFailure(Scenario scenario) {
        // Implement logic to capture screenshot on test failure if needed
        if(scenario.isFailed()){
          Timestamp timestamp = new Timestamp(System.currentTimeMillis());
          String timeMilliseconds = Long.toString(timestamp.getTime());

          byte[] screenshot = ((TakesScreenshot) getDriver())
                    .getScreenshotAs(OutputType.BYTES);
          scenario.attach(screenshot, "image/png", timeMilliseconds);
        }
    }

    @After
    public void tearDown() {
        cleanupDriver();
    }
}