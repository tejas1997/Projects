import org.testng.annotations.Test;
import org.testng.Assert;

public class TestFlipkart extends BaseTest{

    @Test  
    public void test() 
    {
        HomePage homePage = new HomePage(driver);
        homePage.search("iPhone");
        String expectedUrl = "https://www.flipkart.com/search?q=iPhone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Search failed!");
    }
}