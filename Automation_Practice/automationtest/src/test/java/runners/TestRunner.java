package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:features"}, glue = {"driver.hooks","stepdefinitions"},
                  tags = "@Login", monochrome = true, dryRun = false, 
                  plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"       
})
public class TestRunner extends AbstractTestNGCucumberTests 
{
    @Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}