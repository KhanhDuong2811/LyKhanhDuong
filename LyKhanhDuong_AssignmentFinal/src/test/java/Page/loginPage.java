package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    // Login
    public By username = By.name("login[username]");
    public By password = By.name("login[password]");
    public By signInBtn = By.xpath("//button/span[contains(text(),'Sign in')]");
    public By forgotYourPass = By.linkText("Forgot your password?");
    public By closeIncomingMessage = By.xpath("//h1[@id='modal-title-2']//following::button[1]");

}
