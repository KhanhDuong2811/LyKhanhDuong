package Function;

import Core.basePage;
import org.openqa.selenium.WebDriver;

public class dashboardFunction extends basePage {
    public dashboardFunction(WebDriver driver) {
        super(driver);
    }
    commonFunction common_Function = new commonFunction(driver);
    public void verifyLoginSuccess(){
        common_Function.verifyTitle("Dashboard / Magento Admin");
    }
}
