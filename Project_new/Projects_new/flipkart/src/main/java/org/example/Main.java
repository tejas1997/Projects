package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class Main
{
    ChromeDriver driver;
    //Actions searchButton;
    @BeforeClass
    public void beforeClass()
        {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.flipkart.com/");
            driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/header/div[1]/div[2]/form/div/div/input")).sendKeys("iPhone", Keys.ENTER);
            try
            {
                WebElement str = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/span"));
                System.out.println(str.getText());
            } catch (Exception e) {
                System.out.println("No text found");
            }
        }
        @Test()
      public void test()
      {
          System.out.println("Testing");

      }
      //@org.testng.annotations.AfterClass
        @AfterClass()
      public void afterClass()
      {
          driver.quit();
      }
}