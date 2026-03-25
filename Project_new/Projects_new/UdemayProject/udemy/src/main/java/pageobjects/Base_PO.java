package pageobjects;
import static driver.DriverFactory.getDriver;

public class Base_PO {
    public Base_PO() {
    }

    public void navigateTo(String url){
        getDriver().get(url);
    }
}
