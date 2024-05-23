package Function;

import Core.basePage;
import org.openqa.selenium.WebDriver;
import Page.loginPage;

public class loginFunction extends basePage {
    public loginFunction(WebDriver driver) {
        super(driver);
    }
    commonFunction common_Function = new commonFunction(driver);
    loginPage loginPage = new loginPage();

    public void login(String user, String password) {
        common_Function.selectByVisibleText(loginPage.username, user);
        common_Function.sendKeys(loginPage.password, password);
        common_Function.click(loginPage.signInBtn);
        common_Function.refresh();
    }
    public void refresh(){
        common_Function.refresh();

    }
    public void closeIncomingMessage(){
        common_Function.clickToElement(loginPage.closeIncomingMessage);
    }
    public void verifyLoginPage(){
        common_Function.isdisplayed(loginPage.username);
        common_Function.isdisplayed(loginPage.password);
        common_Function.isdisplayed(loginPage.signInBtn);
        common_Function.isdisplayed(loginPage.forgotYourPass);
    }

}

