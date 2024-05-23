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
        common_Function.sendKeys(loginPage.username, user);
        common_Function.sendKeys(loginPage.password, password);
        common_Function.click(loginPage.signInBtn);
    }
    public void verifyHomePage(){
        // Thanh ngang
        common_Function.isdisplayed(loginPage.selenium);
        common_Function.isdisplayed(loginPage.insuranceProject);
        common_Function.isdisplayed(loginPage.agileProject);
        common_Function.isdisplayed(loginPage.bankProject);
        common_Function.isdisplayed(loginPage.securityProject);
        common_Function.isdisplayed(loginPage.telecomProject);
        common_Function.isdisplayed(loginPage.paymentGatewayProject);
        common_Function.isdisplayed(loginPage.newTours);
        common_Function.isdisplayed(loginPage.seo);
        common_Function.isdisplayed(loginPage.Guru99Bank);

        // Thanh thẳng
        common_Function.isdisplayed(loginPage.manager);
        common_Function.isdisplayed(loginPage.newCustomer);
        common_Function.isdisplayed(loginPage.editCustomer);
        common_Function.isdisplayed(loginPage.deleteCustomer);
        common_Function.isdisplayed(loginPage.newAccount);
        common_Function.isdisplayed(loginPage.editAccount);
        common_Function.isdisplayed(loginPage.deleteAccount);
        common_Function.isdisplayed(loginPage.deposit);
        common_Function.isdisplayed(loginPage.withdrawal);
        common_Function.isdisplayed(loginPage.fundTransfer);
        common_Function.isdisplayed(loginPage.changePass);
        common_Function.isdisplayed(loginPage.balanceEnquiry);
        common_Function.isdisplayed(loginPage.miniStatement);
        common_Function.isdisplayed(loginPage.customisedStatement);
        common_Function.isdisplayed(loginPage.logOut);

        // Center
        common_Function.isdisplayed(loginPage.img);
        common_Function.isdisplayed(loginPage.welcome);
        common_Function.isdisplayed(loginPage.mangerId);
    }

    public void verifyChangePasswordPage(){
        common_Function.click(loginPage.changePass);
        common_Function.isdisplayed(loginPage.oldPassword);
        common_Function.isdisplayed(loginPage.oldPassword);
        common_Function.isdisplayed(loginPage.oldPassword);
        common_Function.isdisplayed(loginPage.oldPassword);
        common_Function.isdisplayed(loginPage.oldPassword);
        common_Function.isdisplayed(loginPage.submitBtn);
        common_Function.isdisplayed(loginPage.resetBtn);
        common_Function.isdisplayed(loginPage.homeBtn);

    }
    public void changePassword(String oldPass, String newPass, String confirmPass){
        common_Function.sendKeys(loginPage.oldPassword, oldPass);
        common_Function.sendKeys(loginPage.oldPassword, newPass);
        common_Function.sendKeys(loginPage.oldPassword, confirmPass);
        common_Function.click(loginPage.submitBtn);
        common_Function.alert();
    }
    public void logOut(){
        common_Function.click(loginPage.logOut);
    }

    public void verifyNewCustomerPage(){
        common_Function.click(loginPage.newCustomer);
        common_Function.isdisplayed(loginPage.customerName);
        common_Function.isdisplayed(loginPage.gender);
        common_Function.isdisplayed(loginPage.genderMale);
        common_Function.isdisplayed(loginPage.genderFemale);
        common_Function.isdisplayed(loginPage.dateOfBith);
        common_Function.isdisplayed(loginPage.address);
        common_Function.isdisplayed(loginPage.city);
        common_Function.isdisplayed(loginPage.state);
        common_Function.isdisplayed(loginPage.pin);
        common_Function.isdisplayed(loginPage.phoneNumber);
        common_Function.isdisplayed(loginPage.email);
        common_Function.isdisplayed(loginPage.pass);
    }

    public void newCustomer(String name,String date,String address, String city, String state, String pin, String phone, String email,String pass, String text){
        common_Function.sendKeys(loginPage.customerName, name);
        common_Function.click(loginPage.genderFemale);
        common_Function.sendKeys(loginPage.dateOfBith, date);
        common_Function.sendKeys(loginPage.address, address);
        common_Function.sendKeys(loginPage.city, city);
        common_Function.sendKeys(loginPage.state, state);
        common_Function.sendKeys(loginPage.pin, pin);
        common_Function.sendKeys(loginPage.phoneNumber, phone);
        common_Function.sendKeys(loginPage.email, email);
        common_Function.sendKeys(loginPage.pass, pass);
        common_Function.click(loginPage.submit2);
        common_Function.alert();
        common_Function.checkText(loginPage.verifyMessage, text);
    }
}



