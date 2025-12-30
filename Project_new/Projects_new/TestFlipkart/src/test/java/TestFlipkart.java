import pages.HomePage;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestFlipkart extends BaseTest{

    @Test  
    public void test() 
    {
        HomePage homePage = new HomePage(driver, wait);
        homePage.search("iPhone");
        Assert.assertTrue(
        driver.getCurrentUrl().contains("search?q=iPhone"),
        "Search failed!"
        );
    }
}